package PageActions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.fail;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.PageFactory;
import objectRepo.CheckoutLocators;
import objectRepo.Coupons;
import objectRepo.LoginLocators;
import objectRepo.ProductDetails;
import objectRepo.Profile;
import objectRepo.ShippingPeriod;
import objectRepo.ShoppingCartLocaters;
import objectRepo.Wishlist;

public class CommonActions extends PageFactory {

	public static void login(String email, String pass) {

		System.out.println("Click on Login button");
		click(LoginLocators.login);

		WebElement emailaddress = driver.findElement(LoginLocators.emailAddress);
		WebElement password = driver.findElement(LoginLocators.password);

		if (email.equals("empty")) {
			emailaddress.sendKeys("");
		} else {
			emailaddress.sendKeys(email);
		}
		if (pass.equals("empty")) {
			password.sendKeys("");
		} else {
			password.sendKeys(pass);
		}
		password.submit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The user is logged in ");

	}

	// login for guest user after procedding from shoppingCart
	public static void CheckoutLogin() {

		WebElement emailaddress = driver.findElement(LoginLocators.emailAddress);
		WebElement password = driver.findElement(LoginLocators.password);
		emailaddress.sendKeys("mmehdawi+Auto1@hajeer.com");
		password.sendKeys("password1234");
		password.submit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("The user is logged in ");
	}

	public static void placeOrderMethod(String payment_method) throws Throwable {
		WebElement placeorder;
		payment_method = payment_method.toLowerCase();

		navigateTo(hosturl + "/basket/");

		System.out.println("proceed to checkout");
		click(CheckoutLocators.checkout_btn);

		System.out.println("continue to paymenth method");
		click(CheckoutLocators.continue_btn);

		switch (payment_method) {
		case "cod":
			click(CheckoutLocators.cod);
			ImplicitWait(5);
			placeorder = driver.findElement(CheckoutLocators.placeOrder_form);
			placeorder.submit();
			break;

		case "visa":
			click(CheckoutLocators.onlinePayment);
			ImplicitWait(5);
			System.out.println("Fill the Visa info");
			fillVisaInfo();
			System.out.println("Place Order");
			click(CheckoutLocators.placeOrderbtn);

			break;

		case "mada":

			click(CheckoutLocators.onlinePayment);
			ImplicitWait(5);
			System.out.println("Fill the Mada info");
			fillMadainfo();
			System.out.println("Place Order");
			click(CheckoutLocators.placeOrderbtn);
			break;

		case "master":
			click(CheckoutLocators.onlinePayment);
			ImplicitWait(5);
			System.out.println("Fill the Master info");
			fillMasterinfo();
			System.out.println("Place Order");
			click(CheckoutLocators.placeOrderbtn);
			sendKeys("12345", CheckoutLocators.MasterConfirmation);
			click(CheckoutLocators.MasterSubmit);

			break;

		case "wallet":
			click(CheckoutLocators.Wallet);
			ImplicitWait(5);
			placeorder = driver.findElement(CheckoutLocators.placeOrder_form);
			placeorder.submit();
			break;
		}

		System.out.println("submit the placeorder form");
	}
	
	
	public static void CreateOncebyOneCoupon(String Coupon) {
		
		
		System.out.println(" Login with a super User");
		openbrowser();
		navigateTo(hosturl);
		login("mmehdawi@hajeer.com", "mehdawi121189");
		
		navigateTo(hosturl+"/en/dashboard/vouchers/create/");
		
		switch(Coupon) {
		
		case"OnceByone%":
			
			System.out.println("Create OnceByOne with Percentage Coupon");
			sendKeys("Oncebyone%[random]" , Coupons.CouponName);
			
			sendKeys("Oncebyone%[random]" , Coupons.Code);
			
			sendKeys("2019-03-31 00:00:39" , Coupons.StartDate);

			sendKeys("2026-02-26 02:30:39" , Coupons.EndDate);
			
			click(Coupons.DiscountProducts);
		
			click(Coupons.ProductType);

			sendKeys("50" , Coupons.DiscountValue);
			
			sendKeys("1" , Coupons.NumberOfCode);
			
			sendKeys("Auto[random]" , Coupons.AccountNumber);
			
		    CodeName =driver.findElement(By.id("id_name")).getAttribute("value");
			
			Code =driver.findElement(By.id("id_code")).getAttribute("value");
					
			System.out.println("The Coupon Name is :"+CodeName);

			System.out.println("The Coupon Code is :"+Code);

		    click(Coupons.Save);
		   
		   break;
		   
		case "OnceByone%max" :
			System.out.println("Create OnceByOne with Percentage Coupon with max limit");
			sendKeys("Oncebyone%max[random]" , Coupons.CouponName);
			
			sendKeys("Oncebyone%max[random]" , Coupons.Code);
			
			sendKeys("2019-03-31 00:00:39" , Coupons.StartDate);

			sendKeys("2026-02-26 02:30:39" , Coupons.EndDate);
			
			click(Coupons.DiscountProducts);
		
			click(Coupons.ProductType);

			sendKeys("50" , Coupons.DiscountValue);
			
			sendKeys("1" , Coupons.NumberOfCode);
			
			sendKeys("100" ,Coupons.Maxlimit);
			
			sendKeys("Auto[random]" , Coupons.AccountNumber);
			
		    CodeName =driver.findElement(By.id("id_name")).getAttribute("value");
			
			Code =driver.findElement(By.id("id_code")).getAttribute("value");
			
			System.out.println("The Coupon Name is :"+CodeName);

			System.out.println("The Coupon Code is :"+Code);

		    click(Coupons.Save);
		    break;
		    
		case"OnceByoneFix":
			System.out.println("Create OnceByOne with fixed Coupon ");
			sendKeys("OncebyoneFix[random]" , Coupons.CouponName);
			
			sendKeys("OncebyoneFix[random]" , Coupons.Code);
			
			sendKeys("2019-03-31 00:00:39" , Coupons.StartDate);

			sendKeys("2026-02-26 02:30:39" , Coupons.EndDate);
			
			click(Coupons.DiscountProducts);
		
			click(Coupons.ProductType);
			
			click(Coupons.Discount);
			
			click(Coupons.DiscountTypeFixed);

			sendKeys("100" , Coupons.DiscountValue);
			
			sendKeys("1" , Coupons.NumberOfCode);
				
			sendKeys("Auto[random]" , Coupons.AccountNumber);
			
		    CodeName =driver.findElement(By.id("id_name")).getAttribute("value");
			
			Code =driver.findElement(By.id("id_code")).getAttribute("value");
			
			System.out.println("The Coupon Name is :"+CodeName);

			System.out.println("The Coupon Code is :"+Code);

		    click(Coupons.Save);
			break;
		}
		
		navigateTo(hosturl+"/en/dashboard/logout/");
		driver.close();
				
	}
	
	

	public static void ImplicitWait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);

	}

	public static void addToCart_productDetails(String url, String q) {
		System.out.println("add Item to cart");
		navigateTo(hosturl + url);
		WebElement quanity_select = driver.findElement(ProductDetails.quantity);
		Select quantity = new Select(quanity_select);
		quantity.selectByVisibleText(q);
		quanity_select.submit();
		wait(1);

	}

	public static void addToCart_QuickView(String q) {

		WebElement quanity_select = driver.findElement(ProductDetails.quantity);
		Select quantity = new Select(quanity_select);
		quantity.selectByVisibleText(q);
		quanity_select.submit();
		wait(1);
	}

	public static void apply_coupon(String code) {
		WebElement coupon = driver.findElement(CheckoutLocators.coupon);
		coupon.sendKeys(code);
		click(CheckoutLocators.applyCoupon);
        wait(1);
	}

	public static void fillVisaInfo() {
		String card_num = "4111111111111111";
		String card_holder = "Automation test";
		String ccv = "123";
		String MM = "01";
		String YY = "25";

		sendKeys(card_num, CheckoutLocators.cardNo);
		sendKeys(card_holder, CheckoutLocators.CardHolder);
		sendKeys(ccv, CheckoutLocators.ccv);

		WebElement ExpiryMonth = driver.findElement(CheckoutLocators.ExpiryMM);
		Select ExpiryMM = new Select(ExpiryMonth);
		ExpiryMM.selectByValue(MM);

		WebElement ExpiryYear = driver.findElement(CheckoutLocators.ExpiryYY);
		Select ExpiryYY = new Select(ExpiryYear);
		ExpiryYY.selectByValue(YY);

	}

	public static void fillMadainfo() {
		String card_num = "5297412542005689";
		String card_holder = "Automation test";
		String ccv = "350";
		String MM = "05";
		String YY = "21";

		sendKeys(card_num, CheckoutLocators.cardNo);
		sendKeys(card_holder, CheckoutLocators.CardHolder);
		sendKeys(ccv, CheckoutLocators.ccv);

		WebElement ExpiryMonth = driver.findElement(CheckoutLocators.ExpiryMM);
		Select ExpiryMM = new Select(ExpiryMonth);
		ExpiryMM.selectByValue(MM);

		WebElement ExpiryYear = driver.findElement(CheckoutLocators.ExpiryYY);
		Select ExpiryYY = new Select(ExpiryYear);
		ExpiryYY.selectByValue(YY);

	}

	public static void fillMasterinfo() {
		String card_num = "5313581000123430";
		String card_holder = "Automation test";
		String ccv = "123";
		String MM = "05";
		String YY = "21";

		sendKeys(card_num, CheckoutLocators.cardNo);
		sendKeys(card_holder, CheckoutLocators.CardHolder);
		sendKeys(ccv, CheckoutLocators.ccv);

		WebElement ExpiryMonth = driver.findElement(CheckoutLocators.ExpiryMM);
		Select ExpiryMM = new Select(ExpiryMonth);
		ExpiryMM.selectByValue(MM);

		WebElement ExpiryYear = driver.findElement(CheckoutLocators.ExpiryYY);
		Select ExpiryYY = new Select(ExpiryYear);
		ExpiryYY.selectByValue(YY);

	}

	public static void AddtoWishlist() {

		System.out.println("Add Product to Wishlist");

		click(ProductDetails.AddToWishlist);
		sendKeys("AutoWishlist", ProductDetails.WishlistName);
		click(ProductDetails.AddToNewWishlist);

	}

	public static void EditWishlist() {

		System.out.println("Edit Wishlist");

		click(Wishlist.EditWishlist);
		sendKeys("AutoWishlist", Wishlist.EditField);
		click(Wishlist.Done);

		String WishlistName = driver.findElement(By.className("wishlist-name")).getText();

		try {

			assertTrue(WishlistName.matches("AutoWishlist"));
			System.out.println("The Wishlist name has been updated to = " + WishlistName);
		} catch (AssertionError e) {
			driver.quit();
			System.out.println("The Wishlist name has not been updated");
			fail(WishlistName);
		}

	}

	public static void RemoveWishlist() {

		WebElement Wishlistdd = driver.findElement(Wishlist.Wishlistdropdown);
		Select Wishlists = new Select(Wishlistdd);

		List<WebElement> W = Wishlists.getOptions();
		int size = W.size();

		System.out.println(size);
		for (int i = 0; i < size; i++) {

			click(Wishlist.DeleteWishlist);

			click(Wishlist.Delete);

			match("Your 'AutoWishlist' wish list has been deleted");
		}

	}

	// Increase The Product Quantity from Shopping Cart
	public static void IncreaseQuantity(String q) {
		System.out.println("Increase The product Quantity from shopping Cart");
		WebElement Cartquantity = driver.findElement(ShoppingCartLocaters.CartQuantity);
		Select Quantity = new Select(Cartquantity);
		Quantity.selectByVisibleText(q);

	}

	public static void SelectMoreItemCart() {

		WebElement fstchekbox = driver.findElement(ShoppingCartLocaters.CheckFstProduct);

		if (!fstchekbox.isSelected()) {
			fstchekbox.click();
		}

		assertTrue(fstchekbox.isSelected());

		WebElement Sndcheckbox = driver.findElement(ShoppingCartLocaters.Check2ndProduct);
		if (!Sndcheckbox.isSelected()) {
			Sndcheckbox.click();
		}

		assertTrue(Sndcheckbox.isSelected());

	}

	public static void CancelOrder() {
		System.out.println("Cancel Order");

		click(CheckoutLocators.CancelOrder);
		Select(CheckoutLocators.CancelReason, "2");
		sendKeys("Test Automation Cancel Order", CheckoutLocators.Note);

		click(CheckoutLocators.ConfirmCancel);

		driver.switchTo().alert().accept();
	}

	// Delete All items from shopping Cart
	public static void DeleteItemsCart() {

		click(ShoppingCartLocaters.Delete);
	}

	public void NotDisplayed(By Locater) {

		try {
			WebElement elem = driver.findElement(Locater);
			assertFalse(elem.isDisplayed());
		} catch (Exception e) {

			System.out.println("The Value is displayed");
		}
	}

	public static void SecureConnection() {

		boolean SecureConnect = driver.getCurrentUrl().contains("https");
		try {
			assertTrue(SecureConnect);
			match("POST");

			System.out.println("The connection is secured ");

		} catch (AssertionError e) {

			driver.quit();
			fail("The connection is not secured");
		}

	}

	public static void EmailVerified() {

		try

		{
			WebElement verifyemail = driver.findElement(Profile.verifyemail);
			boolean actualresult = verifyemail.isDisplayed();

			if (actualresult == true)

			{
				System.out.println("The Email is not verified");
			}

		} catch (Exception e) {

			System.out.println("The email is verified");
		}

	}

	public static void ShippingPeriods() {

		WebElement shipping = driver.findElement(ShippingPeriod.Shippingtype);
		Select s = new Select(shipping);
		List<WebElement> shippingType = s.getOptions();

		int size = shippingType.size();

		for (int x = 0; x < size; x++) {

			String text = shippingType.get(x).getAttribute("value");
			if (text.equals("5")) {
				s.selectByValue(text);
				match("The shipment will be placed");

				System.out.println("The Online shipping is displayed");

			} else if (text.equals("2")) {
				s.selectByValue(text);
				match("The shipment will be placed");

				System.out.println("The Stnadard shipping is displayed");
			} else if (text.equals("4")) {
				s.selectByValue(text);
				match("The shipment will be placed");

				System.out.println("The Express shipping is displayed");
			}

		}

	}

	public void ShippingTypes() {

		int shippingName = driver.findElements(ShippingPeriod.Shippingdropdown).size();
		System.out.println(shippingName);

		for (int i = 0; i < shippingName; i++)

		{
			String text = driver.findElements(ShippingPeriod.Shippingdropdown).get(i).getAttribute("value");

			if (text.equals("5")) {
				System.out.println("The Online shipping is displayed");
			} else if (text.equals("2")) {
				System.out.println("The Stnadard shipping is displayed");
			} else if (text.equals("4")) {
				System.out.println("The Express shipping is displayed");
			}
		}

	}


	public static void OrderID() {

		String Order = driver.findElement(By.partialLinkText("Order ID")).getText();
		OrderID = Order.substring(9);
		System.out.println(OrderID);

	}

	public static void ExplicitWait(int seconds, By Locater) {

		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locater));

	}

	public static void SearchPagination() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,2000)");
		wait(2);
		js.executeScript("window.scrollBy(0,3500)");
		wait(2);

	}

	public static void SearchScroll(By locater) {
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        WebElement Element = driver.findElement(locater);

        String attribute ="";
      
       
   while(!attribute.equals("3")) {
	   
       js.executeScript("arguments[0].scrollIntoView();", Element);

	   attribute = Element.getText();
       System.out.println(attribute);
   }
           
       
    	
       


	}

}