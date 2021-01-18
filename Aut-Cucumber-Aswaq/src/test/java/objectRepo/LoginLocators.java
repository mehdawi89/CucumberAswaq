package objectRepo;
import org.openqa.selenium.By;

public class LoginLocators {
	//normal login
	public static By login = By.id("login_link");
	public static By emailAddress = By.id("id_login-username");
	public static By password = By.id("id_login-password");
	
	//facebook Login
	public static By facebook = By.xpath("//*[@id=\"facebook_login\"]");
	public static By Emailfb  = By.id("email");
	public static By Passfb   = By.id("pass");
	public static By LoginFbBtn= By.id("loginbutton");
	
	//Google Login
	public static By google = By.xpath("//*[@id=\"google_login\"]");
	public static By ggemail= By.id("identifierId");
	public static By ggpass=  By.name("password");
	public static By Next  =  By.id("identifierNext");
	public static By passNext= By.id("passwordNext");
	
	public static By twitter = By.xpath("//*[@id=\"twitter_login\"]");
	public static By TwUsername = By.id("username_or_email");
	public static By TwUser = By.xpath("//input[@id='username_or_email']");
	public static By TwPassword = By.id("password");
	public static By TwPass = By.xpath("//input[@id='password']");
	public static By TwSignin = By.id("allow");
	public static By LogAndTweet = By.xpath("//input[@value='Log in and Tweet']");
	
	public static By ForgetEmail = By.id("id_email");
	public static By ResestEmailbtn = By.xpath("//*[contains(text(),'Send reset email')]");

	
}
