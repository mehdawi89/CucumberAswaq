package PageFactory;

import static org.testng.Assert.fail;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import objectRepo.CheckoutLocators;
import objectRepo.LoginLocators;

public class PageFactory {
	public static String hosturl = "http://staging.aswaq.com";
	public static String Odoo = "http://stagingerp.aswaq.com/web/login";
	public static WebDriver driver;
	public static String Code ;
	public static String Email ;
	public static String CodeName;
	public static String OrderID;
	public static String pariticipantphoneNumber;
	public static String participantName;
	public static List<By> uneditable = Arrays.asList(CheckoutLocators.cardNo, CheckoutLocators.ccv,
			CheckoutLocators.givenName, CheckoutLocators.surname);
	public static List<By> unclickable = Arrays.asList(LoginLocators.TwUser, LoginLocators.TwPass);

	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void navigateTo(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("navigate to : " + driver.getCurrentUrl());
	}

	public static void sendKeys(String value, By locator) {

		Random rand = new Random();
		int rnd = rand.nextInt(999) + 1;
		if (value.contains("[random]")) {

			value = value.replace("[random]", rnd + String.valueOf(System.currentTimeMillis()));
		}
		

		try {
			WebElement elem = driver.findElement(locator);

			if (!unclickable.contains(locator)) {
				elem.click();
			}

			if (!uneditable.contains(locator)) {
				elem.clear();

			}

				elem.sendKeys(value);

		}

		catch (Exception e) {
			CaptureScreenShot("No such Element found" +value );

			driver.quit();
			System.out.println("No Such element  found .");
			fail("No such Element found");

		}

	}

	public static void click(By locator) {
		WebElement elem;
		try {
			elem = driver.findElement(locator);
			elem.click();
		} catch (NoSuchElementException e) {

			CaptureScreenShot("No such Element found" + locator);

			driver.quit();
			System.out.println("No Such element  found .");
			fail("No such Element found" + locator);
		}

		wait(2);

	}

	public static void MouseHover(By locater) {

		Actions action = new Actions(driver);
		WebElement elem = driver.findElement(locater);
		action.moveToElement(elem).build().perform();
	}

	public static void quit() {
		driver.quit();
	}

	public static void wait(int x) {
		x = x * 1000;
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void match(String value) {

		value = value.trim();
		boolean m = driver.getPageSource().contains(value);
		try {
			assertTrue(m);

		} catch (AssertionError e) {
			
			CaptureScreenShot(value);
			driver.quit();
			System.out.println(" The" + value + " is not found ");
			fail(value);
			

		}

	}

	public static void Notmatch(String value) {

		value = value.trim();
		boolean m = driver.getPageSource().contains(value);
		try {
			assertFalse(m);

		} catch (AssertionError e) {
			
			CaptureScreenShot(value);
			driver.quit();
			System.out.println(" The" + value + " is found ");
			fail(value);
			

		}

	}

	public static void Select(By locater, String value) {

		WebElement elem = driver.findElement(locater);
		Select dropdown = new Select(elem);

		dropdown.selectByValue(value);

	}
	
	public static void Enter (By locater) {
		
		WebElement elem = driver.findElement(locater);
		elem.sendKeys(Keys.ENTER);
	}
	
	public static void PageDown () {
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();


	}
	
	public static void UrlMatch(String value) {
		
		boolean Url =driver.getCurrentUrl().contains(value);
		assertTrue(Url);
	}
	
	public static void CaptureScreenShot( String screenshotname ) {
		
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver ;
			
			File source =ts.getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(source, new File("./Screenshots/"+screenshotname+".png"));
			
			System.out.println("Screenshot taken");
		
		} 
		
		catch (Exception e) {
	
			System.out.println("Exception while takin screenshot"+e.getMessage());
		}
		
	}


}
