package PageActions;

import objectRepo.AccountDashboard;
import objectRepo.Address;
import objectRepo.CheckoutLocators;
import objectRepo.Coupons;
import objectRepo.HomePage;
import objectRepo.LoginLocators;
import objectRepo.OdooLocaters;
import objectRepo.ProductDetails;
import objectRepo.ProductsUrl;
import objectRepo.Profile;
import objectRepo.RamadanCampaign;
import objectRepo.ShoppingCartLocaters;
import objectRepo.SignUpLocators;
import objectRepo.Wishlist;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;

import PageActions.CommonActions;

public class Actionwords extends CommonActions {

	public void iAmLoggedInASWAQ() throws Throwable {
		System.out.println("");
		openbrowser();
		navigateTo(hosturl);
		login("mmehdawi+Auto1@hajeer.com", "password1234");
	}

	public void iAmLoggedInASWAQOutsideRiyadh() {
		System.out.println("");
		openbrowser();
		navigateTo(hosturl);
		login("mmehdawi+outside@hajeer.com", "password1234");
	}

	public void LoginWithUsernamePassword(String EmailAddress, String Password) {
		login(EmailAddress, Password);
	}

	public void UnverifiedLogin() {
		System.out.println("");
		openbrowser();
		navigateTo(hosturl);
		login("mmehdawi+unverified@hajeer.com", "password1234");

	}

	public void CompanyLogin() {
		System.out.println("");
		openbrowser();
		navigateTo(hosturl);
		login("mmehdawi+com7@hajeer.com", "password1234");

	}
	public void RamadanCampaignHomePage() {
		System.out.println("");
		openbrowser();
		navigateTo(hosturl);
		navigateTo(hosturl+"/en/campaign/ramadan/");
		UrlMatch("/en/campaign/ramadan/");
		match("Have you followed us on?");
        match("Register");

	}
	

	public void LoginFacebook(String email, String pass) {
		System.out.println("Click on Login Button");
		click(LoginLocators.login);

		System.out.println("Login with facebook");
		click(LoginLocators.facebook);

		System.out.println("Enter Facebook EmailAddress = " + email);
		sendKeys(email, LoginLocators.Emailfb);

		System.out.println("Enter Facebook password = " + pass);
		sendKeys(pass, LoginLocators.Passfb);

		click(LoginLocators.LoginFbBtn);

		wait(1);

		System.out.println("The User is logged in successfully");

	}

	public void LoginGoogle(String email, String pass) {
		System.out.println("Click on Google Login Button");
		click(LoginLocators.login);

		System.out.println("Login with Google");
		click(LoginLocators.google);

		System.out.println("Enter Google EmailAddress = " + email);
		sendKeys(email, LoginLocators.ggemail);
		click(LoginLocators.Next);

		System.out.println("Enter Google password = " + pass);
		sendKeys(pass, LoginLocators.ggpass);
		click(LoginLocators.passNext);

		System.out.println("The User is logged in successfully");

	}

	public void Logintwitter(String email, String pass) {
		System.out.println("Click on Login Button");
		click(LoginLocators.login);

		System.out.println("Login with Twitter");
		click(LoginLocators.twitter);

		System.out.println("Enter Twitter EmailAddress = " + email);
		sendKeys(email, LoginLocators.TwUsername);

		System.out.println("Enter Twitter password = " + pass);
		sendKeys(pass, LoginLocators.TwPassword);

		click(LoginLocators.TwSignin);

		System.out.println("The User is logged in successfully");

	}

	public void GuestCheckoutLogin() {

		CheckoutLogin();
		match("We have merged a cart from a previous session. Its contents might have changed.");
	}

	public void Logout() {

		match("Logout");
		System.out.println("Logout from " + hosturl);
		navigateTo(hosturl + "/accounts/logout/");
	}

	public void NavigateAllOrdersPage() {

		System.out.println("Navigate to All Orders Page");

		navigateTo(hosturl + "/accounts/orders/");
		match("All Orders");

	}
	
	public void ReturnItem() {
		System.out.println("Return Item");
		
		click(CheckoutLocators.ReturnItem);
		Select(CheckoutLocators.ReturnReason ,"1");
		sendKeys("Return Test Automation" ,CheckoutLocators.Note );
		click(CheckoutLocators.Save);
		match("Return request submitted.");

	}

	public void SearchOrderDates() {

		sendKeys("2019-01-30", CheckoutLocators.DateFrom);
		sendKeys("2019-01-30", CheckoutLocators.DateTo);
		click(CheckoutLocators.Submitfilter);

	}

	public void SearchForSpecificOrder(String Order) {

		sendKeys(Order, CheckoutLocators.OrderNo);
		click(CheckoutLocators.Submitfilter);
		wait(1);

	}
	public void SearchForthePlacedOrder() {

		sendKeys(OrderID, CheckoutLocators.OrderNo);
		click(CheckoutLocators.Submitfilter);
		wait(1);

	}

	public void NavigateToOrderDetailsPage() {

		System.out.println("Navigate to order Details page");
		click(CheckoutLocators.ViewOrder);
		match("Cash On Delivery");
		match("Cash On Delivery (Fees)");
		match("17.85 SAR");
		match("Shipping total");
		match("19.95 SAR");
		match("336.85 SAR");
		match("- 19.95 SAR");
		match("Order total");
		match("Cancel Order");
		match("Automation - Nikai Water Dispenser with Cabinet, 16 Liter, NWD1208, White");
		match("Re-order");

	}

	public void NavigateToOdoo() {

		OrderID();
		navigateTo(Odoo);

		click(OdooLocaters.AswaqERP);
		sendKeys("sysadmin@almanarah.com.sa", OdooLocaters.Username);
		sendKeys("swingP@ssw0rd", OdooLocaters.Password);

		click(OdooLocaters.Login);

		click(OdooLocaters.Sales);

	}
	
	public void SearchAswaqOrder() {
		
		click(OdooLocaters.Qoutations);

		sendKeys(OrderID, OdooLocaters.Search);

		Enter(OdooLocaters.Search);

		click(OdooLocaters.AswaqOrderNum);
		
	}


	
	public void CompletePlaceOrder() {
		
		click(OdooLocaters.Qoutations);

		sendKeys(OrderID, OdooLocaters.Search);

		Enter(OdooLocaters.Search);

		click(OdooLocaters.AswaqOrderNum);
		
		click(OdooLocaters.FinishOrder);
		
		
		ExplicitWait(30 ,OdooLocaters.OrderStatus);
	}

	public void NavigateToMoreThan5Products() {
		System.out.println("Navigate to more than 5 products");

		navigateTo(hosturl + "/market/health-and-beauty/signal-toothpaste-sensitive-expert-gum-care-75ml_4429/");
		navigateTo(hosturl
				+ "/market/health-and-beauty/dove-nutritive-solutions-hair-fall-rescue-oil-replacement-350ml_4712/");
		navigateTo(hosturl + "/market/supermarket/clear-anti-hair-fall-dandruff-shampoo-for-women-400ml_4679/");
		navigateTo(hosturl + "/market/mobile-phones-tablets/samsung-galaxy-s8-dual-sim-64-gb-4g-lte-black_2822/");
		navigateTo(hosturl + "/market/mobile-phones-tablets/samsung-galaxy-s8-dual-sim-64-gb-4g-lte-black_2866/");
		navigateTo(hosturl + "/market/mobile-phones-tablets/lava-r1-dual-sim-16gb-2gb-ram-4g-lte-gold_8552/");

		navigateTo(hosturl);
	}

	public void NavigateToRegisterationPage() {

		navigateTo(hosturl + "/accounts/register/");

	}

	public void CancellingTheOrder() {

		CancelOrder();
	}

	public void NavigateToCompanyRegisterationPage() {

		navigateTo(hosturl + "/accounts/register/");

		click(SignUpLocators.Company);
		match("Business accounts at Aswaq.com allows you to purchase your company needs from our wide selection of electronics");

	}

	public void Registration(String a, String b, String c) {

		System.out.println("Register a new User");

		if (a.equals("empty")) {
			sendKeys("", SignUpLocators.EmailAddress);

		} else {
			System.out.println("Enter Email Address = " + a);
			sendKeys(a, SignUpLocators.EmailAddress);
		}

		if (b.equals("empty")) {
			sendKeys("", SignUpLocators.Password1);

		} else {
			System.out.println("Enter Firt Password =" + b);
			sendKeys(b, SignUpLocators.Password1);
		}
		if (c.equals("empty")) {
			sendKeys("", SignUpLocators.Password2);

		} else {
			System.out.println("Enter Second Password =" + c);
			sendKeys(c, SignUpLocators.Password2);
		}
		
	    Email=driver.findElement(By.id("id_email")).getAttribute("value");

		System.out.println("Click on Sign Up button");
		click(SignUpLocators.SignUp);
		

	}
	
	public void CampaignRegisteration(String a , String b) {
		
		System.out.println("Register a new campaign participant");
		
		Random rand = new Random();
		int rnd = rand.nextInt(899)+100 ;
		
		participantName= a+rnd;
		pariticipantphoneNumber= b+rnd;
        
         
		if (a.equals("empty")) {
			sendKeys("",RamadanCampaign.Name );

		} else {
			sendKeys(participantName,RamadanCampaign.Name );
			System.out.println("Enter Participant Name = " + participantName);
		}

		if (b.equals("empty")) {
			sendKeys("",RamadanCampaign.MobileNumber);

		} else {
			System.out.println("Enter Participant Phone Number =" + pariticipantphoneNumber);
			sendKeys(pariticipantphoneNumber,RamadanCampaign.MobileNumber );
		}
		
	
		
		click(RamadanCampaign.Register);
		wait(2);
	}
	
	
	public void AlreadyCampaignRegistered() {
		
		System.out.println("Enter Participant Name = " + participantName);
		sendKeys(participantName,RamadanCampaign.Name );
		
		System.out.println("Enter Participant Phone Number =" + pariticipantphoneNumber);
		sendKeys(pariticipantphoneNumber,RamadanCampaign.MobileNumber );
		
		click(RamadanCampaign.Register);
		wait(2);
	}
	
	public void NavigateToUnactiveCampaign() {
		
		navigateTo(hosturl + "/en/campaign/shahrazad/");
	}
	
	
	
	public void AddNewAdress() {
		
		navigateTo(hosturl + "/en/accounts/addresses/add/");
		
		System.out.println("");
		sendKeys("Test Automation", Address.Address);
		
		click(Address.SelectCountry);		
		click(Address.SaudiArabia);
		

		click(Address.SelectCity);
		click(Address.Riyadh);

		sendKeys("00962797265624", Address.PhoneNumber);
		
		sendKeys("Riyadh 12215, Saudi Arabia" ,Address.FirstAdress );

		click(Address.Save);
		match("Address 'Test Automation, Riyadh 12215, Saudi Arabia, RUH, Saudi Arabia' created");

	}

	public void addingSomeItemsToCartWithLessThan5000SR() throws Throwable {
		addToCart_productDetails(ProductsUrl.product1, "1");
		addToCart_productDetails(ProductsUrl.product3, "1");

	}

	public void placeAnOrderWithP1Option(String p1) throws Throwable {
		System.out.println("place order with  " + p1);

		placeOrderMethod(p1);
	}
	

	public void theOrderShouldBePlacedSuccessfully() {

		match("Thank You For Your Order");
		match("You will receive an email of your order details");
		match("Note: To confirm your address, you may receive a call from customer service from the number");
		match("(011 813 2000)");
		match("Continue");

	}
	
	public void CreateOnceByoneCop(String cop) {
		
		CreateOncebyOneCoupon(cop);
	}
	
	public void AdjustDatesToExpired() {
		
		wait(1);
		
		navigateTo(hosturl+"/en/accounts/logout/");
		
	    login("mmehdawi@hajeer.com", "mehdawi121189");
		
		navigateTo(hosturl+"/en/dashboard/vouchers/");
		
		sendKeys(Code , Coupons.Code);
		
		click(Coupons.Search);
		
		click(Coupons.NavigateToCoupon);
		
		click(Coupons.Edit);

		sendKeys("2019-05-26 02:30:39" , Coupons.EndDate);
		
		click(Coupons.Save);
		navigateTo(hosturl+"/en/accounts/logout/");
		login(Email, "password1234");
	}

	public void NavigatetoProdutDetails() {

		navigateTo(hosturl + ProductsUrl.product10);
	}

	public void NavigateToUnavailableProductDetails() {

		System.out.println("Navigate to Unavailable product details");
		navigateTo(hosturl + ProductsUrl.product2);

	}

	public void shippingtypes() {

		ShippingTypes();
	}

	public void addingItemsToCartWithMoreThan5000SR() {
		addToCart_productDetails(ProductsUrl.product4, "2");
		addToCart_productDetails(ProductsUrl.product5, "2");

	}

	public void navigateToShoppingCart() {
		System.out.println("Navigate to shopping cart");
		navigateTo(hosturl + "/basket/");

	}

	public void ShoppingCartAssert() {

		System.out.println("Your cart is empty.");
		match("Your cart is empty.");

		System.out.println("Continue shopping");
		match("Continue shopping");

	}

	public void AddoneItemToCart() {

		addToCart_productDetails(ProductsUrl.product10, "1");
		System.out.println("A new Item has been added to your cart Successfully");
		match("A new item has been added to your Cart");
		navigateTo(hosturl + "/basket/");
	}
	
	public void AddOneItemReturn() {
		addToCart_productDetails(ProductsUrl.prdouct11, "1");
		System.out.println("A new Item has been added to your cart Successfully");
		match("A new item has been added to your Cart");
		navigateTo(hosturl + "/basket/");
		
	}

	public void AddingProductWithaFreeItem() {

		addToCart_productDetails(ProductsUrl.product6_freeGift, "1");
		System.out.println("A new Item has been added to your cart Successfully");
		match("A new item has been added to your Cart");
		match("Congratulations, A free gift has been added to your cart");

		System.out.println("Navigate to Shopping cart");
		navigateTo(hosturl + "/basket/");

		match("2599.00 SAR");
		match("-570.48 SAR");

	}
	
	public void AddingBuyOneGetOneOffer() {

		addToCart_productDetails(ProductsUrl.product_BuyOneGetOne, "2");
		System.out.println("A new Item has been added to your cart Successfully");
		match("A new item has been added to your Cart");
		
		System.out.println("Navigate to Shopping cart");
		navigateTo(hosturl + "/basket/");

		match("4058.00 SAR");
		match("4058.00");
		match("-3864.76 SAR");
		match("193.24");
		
	}


	public void AddingUpToThreeItemsInCart() {

		System.out.println("Adding Up to 3 items to Cart");

		addToCart_productDetails(ProductsUrl.product10, "3");
	}

	public void AddtoCartQuickView() {

		System.out.println("ADD item to cart");
		addToCart_QuickView("1");

		System.out.println("A new Item has been added to your cart Successfully");

	}

	public void AddUnQualifiedItem() {

		addToCart_productDetails(ProductsUrl.product_unqualified, "1");
		System.out.println("A new Item has been added to your cart Successfully");
		match("A new item has been added to your Cart");
		navigateTo(hosturl + "/basket/");

	}

	public void CODoptionIsNotDisplayed() {

		navigateTo(hosturl + "/basket/");
		click(CheckoutLocators.checkout_btn);
		click(CheckoutLocators.continue_btn);

		NotDisplayed(CheckoutLocators.cod);
	}

	public void EmptyWishlist() {

		System.out.println("Add Product to Wishlist");

		click(ProductDetails.AddToWishlist);
		sendKeys("", ProductDetails.WishlistName);
		click(ProductDetails.AddToNewWishlist);

	}

	public void EditWishlistPage() {

		EditWishlist();
	}

	public void RemoveWishlists() {

		RemoveWishlist();
	}

	public void RemoveItemFromWishlist() {

		System.out.println("Remove Item from Wishlist");
		click(Wishlist.RemoveItemFromWishlist);

		match("Your wish list is empty.");
		match("Explore more and shortlist some items.");
		match("Shop Now");

	}

	public void AlreadyAddedWishlist() {

		System.out.println("Add Product to Wishlist that is already added");

		click(ProductDetails.AddToWishlist);
		click(ProductDetails.AddedWishlist);

	}
	
	public void ShareProductOnFacebook() {

		System.out.println("Share Product on Facebook");
		click(ProductDetails.ShareOnFb);

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		String parentid = it.next();
		String childid = it.next();

		System.out.println("Switch to Facebook window");
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		System.out.println("Login with facebook");

		System.out.println("Enter Facebook EmailAddress ");
		sendKeys("mmehdawi+fb@hajeer.com", LoginLocators.Emailfb);

		System.out.println("Enter Facebook password ");
		sendKeys("password1234", LoginLocators.Passfb);

		click(LoginLocators.LoginFbBtn);

		wait(1);

		System.out.println("The User is logged in successfully");

		click(ProductDetails.PostOnFb);

		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}

	public void ShareProductOnTwitter() {

		System.out.println("Share Product on Twitter");
		click(ProductDetails.ShareOnTW);

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		String parentid = it.next();
		String childid = it.next();

		System.out.println("Switch to Twitter window");
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		System.out.println("Enter Twitter EmailAddress = ");
		sendKeys("mmehdawi+twitter@hajeer.com", LoginLocators.TwUser);

		System.out.println("Enter Twitter password = ");
		sendKeys("password1234", LoginLocators.TwPass);

		click(LoginLocators.LogAndTweet);

		System.out.println("The User is logged in successfully");

		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}

	public void NavigateToProductDetailsPage() {

		navigateTo(hosturl + ProductsUrl.product10);
	}

	public void Addtowishlist() {

		AddtoWishlist();
	}

	public void ClickOnAddToWishlist() {

		System.out.println("Click on Add to Wishlist");

		click(ProductDetails.AddToWishlist);
	}

	public void IncreaseProductQuantity(String q) {
		IncreaseQuantity(q);
	}

	// This method is related to Adjust quantities from shopping cart scenario
	public void IncreaseUpdated() {

		match("638.00 SAR");
	}

	// remove one item from shopping Cart
	public void RemoveShoppingCart() {

		System.out.println("Remove The item from Shopping cart");
		click(ShoppingCartLocaters.Remove);

	}

	public void theCODOptionShouldNotBeAvailable() {
		navigateTo(hosturl + "/basket/");
		click(CheckoutLocators.checkout_btn);
		click(CheckoutLocators.continue_btn);

		match("Cash On Delivery is not available for some products in your cart");

	}

	public void theCODOptionShouldNotBeAvailableforAbove5000() {
		navigateTo(hosturl + "/basket/");
		click(CheckoutLocators.checkout_btn);
		click(CheckoutLocators.continue_btn);

		match("* Cash On Delivery is not available for orders higher than 5000 SAR");

	}

	public void addUnallowedCODItemToTheCart() {
		addToCart_productDetails(ProductsUrl.product_false_code, "1");

	}

	public void thatAUserWhichCantUseCODIsLoggedToASWAQ() {
		System.out.println("Login with prevented COD user");
		openbrowser();
		navigateTo(hosturl);
		login("mmehdawi+false_cod@hajeer.com", "password1234");
	}

	public void terminateTheSession() {
		System.out.println("terminate the session");
		quit();
		System.out.println("***********************************************");
	}

	public void applyCoupon(String code) {
		System.out.println("Apply code : " + code);
		apply_coupon(code);

	}
	

	public void applyOnceByOneCoupon() {
		System.out.println("Apply code : " + Code);
		apply_coupon(Code);

	}

	public void proceedToCheckout() {
		click(CheckoutLocators.checkout_btn);
	}

	public void NavigatetoAccountDashboard() {

		navigateTo(hosturl + "/accounts/dashboard/");
	}

	public void ProceedToCheckoutPaymentPage() {

		click(CheckoutLocators.checkout_btn);
		click(CheckoutLocators.continue_btn);
	}

	public void addingItemsToCart() {
		addToCart_productDetails(ProductsUrl.product1, "1");
		addToCart_productDetails(ProductsUrl.product10, "1");

	}

	public void addwholeSalaItemToCart() {

		addToCart_productDetails(ProductsUrl.wholesaleProduct, "10");

	}

	public void SelectmoreProduct() {

		SelectMoreItemCart();
	}

	public void DeletemoreItem() {

		DeleteItemsCart();
	}

	public void aswaqHomePage() {
		openbrowser();
		System.out.println("ASWAQ home page");
		navigateTo(hosturl);
	}

	public void NavigateToProfile() {

		System.out.println("Navigate to profile from Top banner");
		click(HomePage.Topbanner);
		click(HomePage.ProfileMenu);

	}

	public void WishlistShoppingCart() {

		System.out.println("Add Product to Wishlist");

		click(ProductDetails.CartWishlist);
		System.out.println("Create new wishlist");
		sendKeys("Autowishlist", ProductDetails.WishlistName);
		click(ProductDetails.AddToNewWishlist);
	}

	public void NavigateToProfileFromSlider() {
		System.out.println("Navigate to profile from Slider");
		click(HomePage.SliderMenu);
		click(HomePage.profile);

	}

	public void NavigateToWishlistFromSlider() {
		System.out.println("Navigate to Wishlist from Slider");
		click(HomePage.SliderMenu);
		click(HomePage.WishlistSlider);

	}

	public void NavigateToWishlistFromMenu() {

		System.out.println("Navigate to Wishlist from User`s Menu ");
		click(HomePage.Topbanner);
		click(HomePage.WishlistMenu);
	}

	public void RemoveCouponCart() {
		System.out.println("Remove Coupon from shopping");
		click(CheckoutLocators.RemoveCoupon);
	}

	public void EditProfileNavigation() {

		click(Profile.editinfo);

	}

	public void Updateprofileinfo(String x, String y, String z) {

		System.out.println("Updating The profile information");
		sendKeys(x, Profile.firstname);
		sendKeys(y, Profile.Lastname);
		sendKeys(z, Profile.IdNumber);
	}

	public void SaveProfileInfo() {
		System.out.println("Saving the profile Information");
		click(Profile.Save);
	}

	public void ProfilePageDisplay() {
		System.out.println("Check the Profile information is displayed");
		match("Email Address");
		match("Gender");
		match("Phone");
		match("Cash On Delivery Status");
		match("Cash On Delivery Limit");

	}

	public void NavigateToProfileAccountDashoard() {

		click(AccountDashboard.ProfileActivated);
	}

	public void NavigateToTotalAmount() {

		click(AccountDashboard.TotalAmount);
	}

	public void NavigateToNumberOfOrders() {

		click(AccountDashboard.Numberoforders);

	}

	public void TheOrderTotalCoupons() {
		System.out.println("The Cart total should be updated successfully");
		match("879.95");
		match("-100.00 SAR");


	}

	public void UpdateChangePassword(String x, String y, String z) {

		System.out.println("Change Password");

		sendKeys(x, Profile.NewPassword);
		sendKeys(y, Profile.PasswordConformation);
		sendKeys(z, Profile.OldPassword);
	}

	public void SearchForAvailableProduct() {

		System.out.println("Search for Available Product");

		sendKeys("Automation", HomePage.SearchBar);
		click(HomePage.Searchbtn);

	}

	public void SubscribeToNewsLetter(String s) {
		
     //   JavascriptExecutor js = (JavascriptExecutor) driver;
        
      //  WebElement s1 = driver.findElement(By.className("newsletter-input-pg"));
        
       //js.executeScript("arguments[0].scrollIntoView();", s1);

		
	//ExplicitWait(20 ,HomePage.SubscribeEmail );
		

		System.out.println("Enter Email Address in Subscribe email");
		click(HomePage.SubscribeEmail);
		sendKeys(s, HomePage.SubscribeEmail);

	}

	public void ClickOnSubscribe() {
		System.out.println("Click on Subscribe Button");
		click(HomePage.SubscribeBtn);
		wait(1);

	}

	public void MouseHoverQuickViewAvailble() {

		System.out.println("Mousehover over Available Product");
		MouseHover(ProductDetails.MHoverQuickViewAvailable);

		System.out.println("Click on QuickView");
		click(ProductDetails.MHoverQuickViewAvailable);

	}



	public void MouseHoverQuickViewNonAvailble() {

		System.out.println("Mousehover over Non Available Product");
		MouseHover(ProductDetails.MHoverQuickViewNonAvailable);

		System.out.println("Click on QuickView");
		click(ProductDetails.MHoverQuickViewNonAvailable);

	}

	public void NavigateToOfferOrderPage() {

		System.out.println("Navigate to Order details page");
		click(CheckoutLocators.OrderId);

		match("Visa");
		match("- 599.00 SAR");
		match("2599.00 SAR");
		match("Cancel Order");
		match("Automation - Samsung Galaxy S9 Dual SIM, 256GB, 4GB RAM, 4G LTE, Titanium Gray");
	}

	public void NavigateToOfferOrderPageForBuyOneGetOne() {

		System.out.println("Navigate to Order details page");
		click(CheckoutLocators.OrderId);

		match("Visa");
		match("- 4058.00 SAR");
		match("4058.00 SAR");
		match("Cancel Order");
		match("Automation - Apple MacBook Dual-Core Intel Core m3, 12 Inch, 1.2GHz, 8GB, 256GB(SSD), English Keyboard, MAC Sierra, Silver, MNYH2");
	}
	
	public void NavigateToForgetPassPage() {

		navigateTo(hosturl + "/password-reset/");
	}

	public void EnterRegisteredEmail(String message) {

		sendKeys(message, LoginLocators.ForgetEmail);

	}

	public void SearchEmptyValue() {

		System.out.println("Search with Empty Value ");
		sendKeys("", HomePage.SearchBar);
		click(HomePage.Searchbtn);
	}

	public void SearchWithUPC(String UPC) {

		System.out.println("Search with UPC");

		sendKeys(UPC, HomePage.SearchBar);
		click(HomePage.Searchbtn);
	}
	
	public void SearchPagePagination() {
		
		System.out.println("Check the search pagination");
		
		SearchPagination();
		
		//SearchScroll(HomePage.SearchPagination);	
		
		//PageDown();

		wait(10);
	}

	public void SearchAllMarkets() {

		System.out.println("Search for White in All markets");

		sendKeys("White", HomePage.SearchBar);
		click(HomePage.Searchbtn);

	}

	public void SearchSubMarket() {

		System.out.println("Search for White in Mobiles Sub market");

		Select(HomePage.SearchMarkets, "11");
		sendKeys("White", HomePage.SearchBar);
		click(HomePage.Searchbtn);
	}

	public void Searchfilters() {

		System.out.println("Click on Necklaces from Fashion");

		click(HomePage.Searchfilter);

	}

	public void ClearAll() {

		System.out.println("Clear All filters");

		click(HomePage.ClearAll);

	}

	public void SearchPagetitle() {

		boolean m = driver.getTitle().contains("White");
		try {
			assertTrue(m);
			System.out.println("The page title is = " + driver.getTitle());

		} catch (Exception e) {
			System.out.println("Wrong search results");
		}

	}

	public void ClickingOnSearchBar() {

		System.out.println("Click on Search Bar");
		click(HomePage.SearchBar);
	}

	public void ChangeLanguage() {

		click(HomePage.ChangeLanguage);
	}

	public void SendResetEmail() {

		click(LoginLocators.ResestEmailbtn);
	}

	public void RegistrationSecuredConnection() {

		SecureConnection();
	}

	public void ViewFullProductDetails() {

		click(ProductDetails.ViewProductDetails);
	}

	public void EmailVerification() {

		EmailVerified();
	}

	public void AccountDashboardNavigation() {

		navigateTo(hosturl + "/accounts/dashboard/");
	}

	public void NavigateToChangePassword() {

		click(Profile.ChangePassword);
	}

	public void UnMatchString(String n) {

		Notmatch(n);
	}

	public void matchString(String s) {
		match(s);
	}
}