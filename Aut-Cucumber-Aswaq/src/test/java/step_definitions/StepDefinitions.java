package step_definitions;

import PageActions.Actionwords;
import PageActions.CommonActions;

import cucumber.api.java.en.*;

public class StepDefinitions {
	public Actionwords actionwords = new Actionwords();

	@Given("^I am logged in ASWAQ$")
	public void iAmLoggedInASWAQ() throws Throwable {
		actionwords.iAmLoggedInASWAQ();
	}

	@Given("^I am logged in ASWAQ with Outside Riyadh$")
	public void i_am_logged_in_aswaq_with_outside_riyadh() {
		actionwords.iAmLoggedInASWAQOutsideRiyadh();
	}

	@Given("^I am on ASWAQ home page$")
	public void i_am_on_ASWAQ_home_page() throws Throwable {

		actionwords.aswaqHomePage();
	}

	@Given("^i am a new User on Aswaq$")
	public void i_am_a_new_user_on_aswaq() {
		actionwords.aswaqHomePage();
		actionwords.NavigateToRegisterationPage();
		actionwords.Registration("mmehdawi+newauto[random]@hajeer.com", "password1234", "password1234");
		actionwords.matchString("Logout");
		actionwords.AddNewAdress();

	}

	@And("^Observe there is no Recently Viewed Section$")
	public void observe_there_is_no_recently_viewed_section() {

		actionwords.UnMatchString("Recently Viewed");
	}

	@And("^The notify me button should be displayed$")
	public void the_notify_me_button_should_be_displayed() {
		actionwords.matchString("Available Soon");
		actionwords.matchString("Notify me");
		actionwords.matchString("You can get an email alert when this product is back in stock.");
	}

	@And("^The notify me button should be displayed for guest users$")
	public void the_notify_me_button_should_be_displayed_for_guest_users() {

		actionwords.matchString("Notify me");
		actionwords.matchString("Available Soon");
		actionwords.matchString("You can get an email alert when this product is back in stock.");
		actionwords.matchString("Send notification to");
	}

	@When("^navigating to more than 5 product details page$")
	public void navigating_to_more_than_5_product_details_page() {

		actionwords.NavigateToMoreThan5Products();
	}

	@When("^Entering an (.+) in Subscribe section$")
	public void entering_an_in_subscribe_section(String emailaddress) {

		actionwords.SubscribeToNewsLetter(emailaddress);
	}

	@And("^click on Subscribe button$")
	public void click_on_subscribe_button() {

		actionwords.ClickOnSubscribe();
	}

	@Then("^the Recently view section should be displayed$")
	public void the_recently_view_section_should_be_displayed() {

		actionwords.matchString("Recently Viewed");
	}

	@When("^Login using valid Emailaddress(.+) and Password(.+)$")
	public void login_using_valid_emailaddress_and_password(String emailaddress, String password) {
		actionwords.LoginWithUsernamePassword(emailaddress, password);
	}

	@When("^Navigate to Aswaq Registration page$")
	public void navigate_to_aswaq_registration_page() {

		actionwords.NavigateToRegisterationPage();
	}

	@When("^Navigate to Aswaq Company Registration page$")
	public void navigate_to_aswaq_company_registration_page() {

		actionwords.NavigateToCompanyRegisterationPage();
	}

	@When("^Login with Facebook with valid (.+) and (.+)$")
	public void login_with_facebook_with_valid_and(String Emailaddress, String password) {

		actionwords.LoginFacebook(Emailaddress, password);
	}

	@When("^register a new user (.+) (.+) (.+)$")
	public void register_a_new_user(String emailaddress, String password1, String password2) {
		actionwords.Registration(emailaddress, password1, password2);
	}

	@Then("^the user should be logged in successfully$")
	public void the_user_should_be_logged_in_successfully() {

		actionwords.matchString("Logout");
	}

	@When("^Login with Google with valid (.+) and (.+)$")
	public void login_with_google_with_valid_and(String emailaddress, String password) {

		actionwords.LoginGoogle(emailaddress, password);

	}

	@When("^Login with Twitter with valid (.+) and (.+)$")
	public void login_with_twitter_with_valid_and(String emailaddress, String password) {
		actionwords.Logintwitter(emailaddress, password);
	}

	@When("^logout from ASWAQ$")
	public void logout_from_aswaq() {
		actionwords.Logout();
	}

	@Then("^the user should be logout successfully$")
	public void the_user_should_be_logout_successfully() {

		actionwords.matchString("Log In");
	}

	@When("^searching with empty value$")
	public void search_with_empty_value() {

		actionwords.SearchEmptyValue();
	}

	@Then("^The user should be registered successfully$")
	public void the_user_should_be_registered_successfully() {
		actionwords.matchString("Logout");
	}

	@Then("^Registration page should be through secure connection$")
	public void registration_page_should_be_through_secure_connection() {

		actionwords.RegistrationSecuredConnection();
	}

	@Then("^the error (.+) should displayed$")
	public void the_error_should_displayed(String message) {

		actionwords.matchString(message);
	}

	@And("^I forget the password for my account$")
	public void i_forget_the_password_for_my_account() {

		actionwords.matchString("Log In");
	}

	@When("^Navigating to forget password page$")
	public void navigating_to_forget_password_page() {
		actionwords.NavigateToForgetPassPage();
	}

	@And("^Enter UnRegistered Email Address \"([^\"]*)\"$")
	public void enter_Unregistered_email_address_something(String strArg1) {
		actionwords.EnterRegisteredEmail(strArg1);

	}

	@And("^Enter Registered Email Address \"([^\"]*)\"$")
	public void enter_registered_email_address_something(String strArg1) {
		actionwords.EnterRegisteredEmail(strArg1);

	}

	@And("^Click on Send Reset Email$")
	public void click_on_send_reset_email() {
		actionwords.SendResetEmail();
	}

	@Then("^The Reset password email should be sent successfully$")
	public void the_reset_password_email_should_be_sent_successfully() {
		actionwords.matchString(
				"We've e-mailed you instructions for resetting your password. You should be receiving it shortly.");
	}

	@Given("^I am logged in ASWAQ with unverifed user$")
	public void i_am_logged_in_ASWAQ_with_unverifed_user() {
		actionwords.UnverifiedLogin();
	}

	@Given("^I am logged with a company user$")
	public void i_am_logged_with_a_company_user() {
		actionwords.CompanyLogin();
	}

	@When("^Navigating to Account Dashboard$")
	public void navigating_to_Account_Dashboard() {
		actionwords.NavigatetoAccountDashboard();
	}

	@Then("^The Credit Amount and Credit Transaction is displayed for wholesale Users$")
	public void the_Credit_Amount_and_Credit_Transaction_is_displayed_for_wholesale_Users() {

		actionwords.matchString("Credit Amount");
		actionwords.matchString("Credit Transactions");

	}

	@When("^adding wholesale item to shopping cart$")
	public void adding_wholesale_item_to_shopping_cart() {

		actionwords.addwholeSalaItemToCart();
	}

	@And("^Navigating to All orders page$")
	public void navigating_to_all_orders_page() throws Throwable {

		actionwords.NavigateAllOrdersPage();
	}

	@And("^search for order number \"([^\"]*)\"$")
	public void search_for_order_number_something(String strArg1) {

		actionwords.SearchForSpecificOrder(strArg1);
	}

	@And("^the order can be returned successfully$")
	public void the_order_can_be_returned_successfully() {

		actionwords.ReturnItem();

	}

	@And("^search for the placed order$")
	public void search_for_the_placed_order() {

		actionwords.SearchForthePlacedOrder();
	}

	@Then("^the selected order should be displayed$")
	public void the_selected_order_should_be_displayed() {

		actionwords.matchString("Order #836687");
	}

	@And("^Search for orders by providing dates$")
	public void search_for_orders_by_providing_dates() {

		actionwords.SearchOrderDates();
	}

	@Then("^The Placed order values should displayed properly in All orders page$")
	public void the_placed_order_values_should_displayed_properly_in_all_orders_page() {

		actionwords.matchString("Tracking ");
		actionwords.matchString("Delivered");
		actionwords.matchString("Return Item");

	}

	@And("^All the Order values should displayed properly in All Order page$")
	public void all_the_order_values_should_displayed_properly_in_all_order_page() {

		actionwords.NavigateAllOrdersPage();
		actionwords.SearchForthePlacedOrder();
		actionwords.matchString("Visa");
		actionwords.matchString("123.76 SAR");
		actionwords.matchString("- 599.00 SAR");
		actionwords.matchString("- 19.95 SAR");
		actionwords.matchString("2599.00 SAR");
		actionwords.matchString("Cancel Order");

	}

	@Then("^the all orders page should be displayed$")
	public void the_all_orders_page_should_be_displayed() {

		actionwords.matchString("All Orders");
		actionwords.matchString("Filter Results");
		actionwords.matchString("Submit");

	}

	@And("^click on Total Amount$")
	public void click_on_total_amount() {

		actionwords.NavigateToTotalAmount();
	}

	@When("^Navigating to order details page$")
	public void navigating_to_order_details_page() {

		actionwords.NavigateToOrderDetailsPage();

	}

	@And("^click on Number of orders$")
	public void click_on_number_of_orders() {

		actionwords.NavigateToNumberOfOrders();
	}

	@Given("^Navigate to Odoo Staging$")
	public void navigate_to_odoo_staging() {

		actionwords.NavigateToOdoo();
	}

	@And("^Cancelling the order$")
	public void cancelling_the_order() {

		actionwords.CancellingTheOrder();
	}

	@Then("^All the Order values should displayed properly in Odoo$")
	public void all_the_order_values_should_displayed_properly_in_odoo() {
		actionwords.matchString("Pending");
		actionwords.matchString("2,599.00");
		actionwords.matchString("570.48");
		actionwords.matchString("Visa");

	}

	@And("^Search for Aswaq order number$")
	public void search_for_aswaq_order_number() {

		actionwords.SearchAswaqOrder();
	}

	@Then("^the order should be cancelled successfully$")
	public void the_order_should_be_cancelled_successfully() {

		actionwords.matchString("This order has been canceled");
	}

	@When("^adding some items to cart with less than 5000 SR$")
	public void addingSomeItemsToCartWithLessThan5000SR() throws Throwable {
		actionwords.addingSomeItemsToCartWithLessThan5000SR();
	}

	@When("^place an order with \"(.*)\" payment$")
	public void placeAnOrderWithP1Option(String p1) throws Throwable {
		actionwords.placeAnOrderWithP1Option(p1);
	}

	@Given("^new Once by One \"([^\"]*)\" Coupon has been created$")
	public void new_once_by_onesomethingcoupon_has_been_created(String strArg1) {

		actionwords.CreateOnceByoneCop(strArg1);
	}
	
    @When("^Changing the Coupon dates to expired$")
    public void changing_the_coupon_dates_to_expired()  {
    	
    	actionwords.AdjustDatesToExpired();
    }
    
    @Then("^The expired Coupon code should be removed$")
    public void the_expired_coupon_code_should_be_removed()  {
    	
    	actionwords.UnMatchString("Coupon discount value");
		actionwords.RemoveShoppingCart();

    }

	@Then("^the order should be placed successfully$")
	public void theOrderShouldBePlacedSuccessfully() {
		actionwords.theOrderShouldBePlacedSuccessfully();
	}

	@And("^Complete the placed order$")
	public void complete_the_placed_order() {

		actionwords.CompletePlaceOrder();
	}

	@When("^navigating to shopping cart$")
	public void navigating_to_shopping_cart() {
		actionwords.navigateToShoppingCart();
	}

	@When("^adding one item to cart$")
	public void adding_one_item_to_cart() {

		actionwords.AddoneItemToCart();
	}

	@And("^adding one item to cart for return$")
	public void adding_one_item_to_cart_for_return() {

		actionwords.AddOneItemReturn();
	}

	@When("^adding one item to cart from Quickview$")
	public void adding_one_item_to_cart_from_quickview() {

		actionwords.AddtoCartQuickView();

	}

	@And("^adding up to 3 in Quantity to cart$")
	public void adding_up_to_3_in_quantity_to_cart() {

		actionwords.AddingUpToThreeItemsInCart();
	}

	@Then("^The product should be added successfully$")
	public void the_product_should_be_added_successfully() {

		actionwords.matchString("A new item has been added to your Cart");
	}

	@Then("^the item should be added to the shopping cart$")
	public void the_item_should_be_added_to_the_shopping_cart() {

		actionwords.matchString("A new item has been added to your Cart");
	}

	@And("^add item to wishlist$")
	public void add_item_to_wishlist() {
		actionwords.Addtowishlist();
	}

	@And("^click on view full product details$")
	public void click_on_view_full_product_details() {
		actionwords.ViewFullProductDetails();
	}

	@Then("^The product details page should be displayed$")
	public void the_product_details_page_should_be_displayed() {

		actionwords.matchString("Trending Items");
		actionwords.matchString("Description");
		actionwords.matchString("Information");
		actionwords.matchString("RATING");

	}

	@When("^searching for UPC \"([^\"]*)\"$")
	public void search_for_upc_something(String strArg1) {

		actionwords.SearchWithUPC(strArg1);
	}

	@Then("^The Search Results should be retrieved successfully$")
	public void the_search_results_should_be_retrieved_successfully() {

		actionwords.matchString("Automation - Dove Nutritive Solutions Hair Fall Rescue Oil Replacement, 350ml");
		actionwords.matchString("  ( 1 Results)");
	}

	@When("^searching for White in the all markets$")
	public void searching_for_white_in_the_all_markets() {

		actionwords.SearchAllMarkets();
	}

	@When("^searching for White in the mobiles sub market$")
	public void searching_for_white_in_the_mobiles_sub_market() {

		actionwords.SearchSubMarket();
	}

	@And("^click on Necklaces from fashion$")
	public void click_on_necklaces_from_fashion() {

		actionwords.Searchfilters();
	}

	@Then("^the filters should be applied properly$")
	public void the_filters_should_be_applied_properly() {

		actionwords.matchString("  ( 93 Results)");
	}

	@And("^click on clear all$")
	public void click_on_clear_all() {

		actionwords.ClearAll();
	}

	@When("^clicking on search bar$")
	public void clicking_on_search_bar() {

		actionwords.ClickingOnSearchBar();
	}

	@And("^change the language to Arabic$")
	public void change_the_language_to_arabic() {

		actionwords.ChangeLanguage();
	}

	@Then("^The returned results are from all markets in arabic$")
	public void the_returned_results_are_from_all_markets_in_arabic() {

		actionwords.matchString("  ( 897 من النتائج)");
	}

	@Then("^the suggested search terms should be displayed$")
	public void the_suggested_search_terms_should_be_displayed() {

		actionwords.matchString("trending_item_1");
		actionwords.matchString("trending_item_2");
	}

	@Then("^the page title should be the same as the term$")
	public void the_page_title_should_be_the_same_as_the_term() {

		actionwords.SearchPagetitle();
	}

	@Then("^The returned results are from all markets$")
	public void returned_results_are_from_all_markets() {

		actionwords.matchString("white");
		actionwords.matchString("  ( 897 Results)");
	}

	@Then("^The returned results are from mobiles sub market$")
	public void the_returned_results_are_from_mobiles_sub_market() {

		actionwords.matchString("  ( 126 Results)");
		actionwords.matchString("white");
	}

	@And("^Share the product on facebook$")
	public void share_the_product_on_facebook() {

		actionwords.ShareProductOnFacebook();
	}

	@And("^Share the product on Twitter$")
	public void share_the_product_on_twitter() {

		actionwords.ShareProductOnTwitter();
	}

	@Then("^The product should be shared on facebook successfully$")
	public void the_product_should_be_shared_on_facebook_successfully() {

	}

	@When("^Navigating to a product details page$")
	public void navigating_to_a_product_details_page() {

		actionwords.NavigateToProductDetailsPage();
	}

	@And("^Add a Product to wishlsit that is already added$")
	public void add_a_product_to_wishlsit_that_is_already_added() {
		actionwords.AlreadyAddedWishlist();
	}

	@And("^Add the Product to wishlsit$")
	public void add_the_product_to_wishlsit() {

		actionwords.Addtowishlist();
	}

	@When("^navigating to an unavailable product details page$")
	public void navigating_to_an_unavailable_product_details_page() {

		actionwords.NavigateToUnavailableProductDetails();
	}

	@And("^add a product to wishlist with an empty wishlist name$")
	public void add_a_product_to_wishlist_with_an_empty_wishlist_name() {

		actionwords.EmptyWishlist();
	}

	@And("^Click on Add to wishlist$")
	public void click_on_add_to_wishlist() {

		actionwords.ClickOnAddToWishlist();
	}

	@When("^navigating to wishlist page from Users menu$")
	public void navigating_to_wishlist_page_from_users_menu() {

		actionwords.NavigateToWishlistFromMenu();
	}

	@Then("^The wishlist page should be displayed$")
	public void the_wishlist_page_should_be_displayed() {

		actionwords.matchString("Wishlists");
	}

	@And("^click on edit wishlist button$")
	public void click_on_edit_wishlist_button() {

		actionwords.EditWishlistPage();
	}

	@When("^Click on Remove item button$")
	public void click_on_Remove_item_button() {

		actionwords.RemoveItemFromWishlist();
	}

	@When("^Click on Remove wishlist button$")
	public void click_on_Remove_wishlist_button() throws Throwable {

		actionwords.RemoveWishlists();
	}

	@Then("^the updates should apply successfully$")
	public void the_updates_should_apply_successfully() {

		actionwords.matchString("You don't have any wish lists yet.");

	}

	@Then("^the item should be added to wishlist successfully$")
	public void the_item_should_be_added_to_wishlist_successfully() {

		actionwords.matchString("This item has been added to your newly created wishlist");
	}

	@When("^Navigate to quick view page for any item$")
	public void navigate_to_quick_view_page_for_any_item() {

		actionwords.MouseHoverQuickViewAvailble();
	}

	@When("^Navigate to quick view page for unavailable item$")
	public void navigate_to_quick_view_page_for_unavailable_item() {

		actionwords.MouseHoverQuickViewNonAvailble();
	}

	@Then("^The quick view page should be displayed$")
	public void the_quick_view_page_should_be_displayed() {

		actionwords.matchString("View full product details");
	}

	@When("^searching for available product$")
	public void searching_for_available_product() {

		actionwords.SearchForAvailableProduct();
	}

	@And("^searching for unavailable product$")
	public void searching_for_unavailable_product() {

		actionwords.SearchForAvailableProduct();
	}

	@Then("^notify me button should be displayed$")
	public void notify_me_button_should_be_displayed() {

		actionwords.matchString("Notify me");

	}

	@Then("^The your cart is empty message and Continue shopping link should be displayed$")
	public void the_your_cart_is_empty_message_and_Continue_shopping_link_should_be_displayed() throws Throwable {

		actionwords.ShoppingCartAssert();

	}

	@When("^adding items to the shopping cart$")
	public void adding_items_to_the_shopping_cart() throws Throwable {
		actionwords.addingItemsToCart();
	}

	@When("^Increase the quantity of the product to \"([^\"]*)\"$")
	public void increase_the_quantity_of_the_product_to(String arg1) throws Throwable {

		actionwords.IncreaseProductQuantity(arg1);
	}

	@When("^Click on Remove button$")
	public void click_on_Remove_button() throws Throwable {
		actionwords.RemoveShoppingCart();
	}

	@When("^select more than an item from shopping cart$")
	public void select_more_than_an_item_from_shopping_cart() throws Throwable {

		actionwords.SelectmoreProduct();
	}

	@When("^click on Delete button$")
	public void click_on_Delete_button() throws Throwable {

		actionwords.DeletemoreItem();
	}

	@Then("^should get back to shopping cart when logged in successfully$")
	public void should_get_back_to_shopping_cart_when_logged_in_successfully() {

		actionwords.GuestCheckoutLogin();

	}

	@Given("^navigating to change password page$")
	public void navigating_to_change_password_page() {
		actionwords.NavigateToChangePassword();
	}

	@When("^Entering New Password(.+)New confirmation Password(.+)and OldPassword(.+)$")
	public void entering_new_passwordnew_confirmation_passwordand_oldpassword(String newpassword,
			String newconfirmationpassword, String oldpassword) {

		actionwords.UpdateChangePassword(newpassword, newconfirmationpassword, oldpassword);
	}

	@Then("^The item should be removed successfully$")
	public void the_item_should_be_removed_successfully() throws Throwable {
		actionwords.ShoppingCartAssert();

	}

	@Then("^The quantity should be updated$")
	public void the_quantity_should_be_updated() throws Throwable {
		actionwords.IncreaseUpdated();
	}

	@When("^proceed to checkout$")
	public void proceed_to_checkout() throws Throwable {

		actionwords.proceedToCheckout();
	}

	@When("^proceed to checkout payment page$")
	public void proceed_to_checkout_payment_page() throws Throwable {

		actionwords.ProceedToCheckoutPaymentPage();
	}

	@And("^adding a product with a free gift offer$")
	public void adding_a_product_with_a_free_gift_offer() {

		actionwords.AddingProductWithaFreeItem();
	}

	@And("^adding a product with Buy one get one offer$")
	public void adding_a_product_with_buy_one_get_one_offer() {
		
		actionwords.AddingBuyOneGetOneOffer();
	}

	@And("^applying the coupon code(.+)$")
	public void applying_the_coupon_code(String coupon) {

		actionwords.applyCoupon(coupon);
	}

	@When("^applying the coupon code$")
	public void applying_the_coupon_code() {

		actionwords.applyOnceByOneCoupon();
	}

	@And("^the order total updated successfully for fixed Coupons$")
	public void the_order_total_updated_successfully_for_fixed_coupons() {

		actionwords.TheOrderTotalCoupons();

	}

	@And("^the order total updated successfully for percentage coupons$")
	public void the_order_total_updated_successfully_for_percentage_coupons() {

		actionwords.matchString("255.20 SAR");
		actionwords.matchString("275.15");
		actionwords.matchString("-60.76 SAR");
		actionwords.matchString("13.10");

	}

	@And("^the order total updated successfully for percentage coupons with max limit$")
	public void the_order_total_updated_successfully_for_percentage_coupons_with_max_limit() {

		actionwords.matchString("214.00 SAR");
		actionwords.matchString("233.95");
		actionwords.matchString("-100.00 SAR");
		actionwords.matchString("11.14");
	}

	@And("^the order total updated successfully for Once by one customer Percentage Coupon$")
	public void the_order_total_updated_successfully_for_once_by_one_customer_percentage_coupon() {
		actionwords.matchString("159.50 SAR");
		actionwords.matchString("179.45");
		actionwords.matchString("-151.90 SAR");
		actionwords.matchString("8.54");

	}

	@And("^the order total updated successfully for Once by one customer Percentage Coupon with max limit$")
	public void the_order_total_updated_successfully_for_once_by_one_customer_percentage_coupon_with_max_limit() {

		actionwords.matchString("214.00 SAR");
		actionwords.matchString("233.95");
		actionwords.matchString("-100.00 SAR");
		actionwords.matchString("11.14");
	}

	@And("^the order total updated successfully for Once by one customer fixed$")
	public void the_order_total_updated_successfully_for_once_by_one_customer_fixed() {

		actionwords.matchString("214.00 SAR");
		actionwords.matchString("233.95");
		actionwords.matchString("-100.00 SAR");
		actionwords.matchString("11.14");
	}

	@And("^the order total updated successfully for Once per customer percentage Coupon$")
	public void the_order_total_updated_successfully_for_once_per_customer_percentage_coupon() {
		actionwords.matchString("159.50 SAR");
		actionwords.matchString("179.45");
		actionwords.matchString("-151.90 SAR");
		actionwords.matchString("8.54");
		actionwords.matchString("OncePerCustomer%(Automation - Please do not edit or remove) ");
	}

	@And("^the order total updated successfully for Once per customer percentage Coupon with max limit$")
	public void the_order_total_updated_successfully_for_once_per_customer_percentage_coupon_with_max_limit() {
		actionwords.matchString("214.00 SAR");
		actionwords.matchString("233.95");
		actionwords.matchString("-100.00 SAR");
		actionwords.matchString("11.14");
		actionwords.matchString("OncePerCusMax%(Automation - Please do not edit or remove) ");

	}

	@And("^the order total updated successfully for Once per customer Fixed Coupon$")
	public void the_order_total_updated_successfully_for_once_per_customer_fixed_coupon() throws Throwable {
		actionwords.matchString("214.00 SAR");
		actionwords.matchString("233.95");
		actionwords.matchString("-100.00 SAR");
		actionwords.matchString("11.14");
		actionwords.matchString("OncePerCusFix(Automation - Please do not edit or remove) ");
	}

	@When("^click on Remove Coupon$")
	public void click_on_Remove_Coupon() {

		actionwords.RemoveCouponCart();
	}

	@When("^adding an undiscountable item to cart$")
	public void adding_an_undiscountable_item_to_cart() {
		actionwords.AddUnQualifiedItem();
	}

	@Then("^the message(.+)should be displayed$")
	public void the_message_should_be_displayed(String message) {

		actionwords.matchString(message);
	}

	@Then("^website should redirect user to login page$")
	public void website_should_redirect_user_to_login_page() throws Throwable {
		actionwords.matchString("You Dont Have An Account?");
	}

	@When("^navigating to My Profile from Top banner$")
	public void navigating_to_My_Profile_from_Top_banner() {

		actionwords.NavigateToProfile();
	}

	@Given("^navigating to Edit profile info$")
	public void navigating_to_Edit_profile_info() {

		actionwords.EditProfileNavigation();
	}

	@When("^navigating to my profile page from slider Menu$")
	public void navigating_to_my_profile_page_from_slider_Menu() {
		actionwords.NavigateToProfileFromSlider();

	}

	@And("^the offer values should be displayed properly in All orders page$")
	public void the_offer_values_should_be_displayed_properly_in_all_orders_page() {

		actionwords.NavigateToOfferOrderPage();
	}
	
    @And("^the offer values should be displayed properly in All orders page for BuyOneGetOne offer$")
    public void the_offer_values_should_be_displayed_properly_in_all_orders_page_for_buyonegetone_offer() {
    	
    	actionwords.NavigateToOfferOrderPageForBuyOneGetOne();
    }

	@When("^navigating to wishlist from slider menu$")
	public void navigating_to_wishlist_from_slider_menu() throws Throwable {

		actionwords.NavigateToWishlistFromSlider();
	}

	@When("^updating the profile info firstname (.+) lastname(.+) and Idnumber(.+)$")
	public void updating_the_profile_info_firstname_lastname_and_idnumber(String firstname, String lastname,
			String idnumber) {

		actionwords.Updateprofileinfo(firstname, lastname, idnumber);
	}

	@Then("^My profile page should be displayed successfully$")
	public void my_profile_page_should_be_displayed_successfully() {
		actionwords.ProfilePageDisplay();

	}

	@Then("^the profile should be updated successfully$")
	public void the_profile_should_be_updated_successfully() {

		actionwords.matchString("Profile updated");

	}

	@And("^The page pagination should work properly$")
	public void the_page_pagination_should_work_properly() {

		actionwords.SearchPagePagination();
	}

	@Then("^The Account Dashboard page is displayed properly$")
	public void the_account_dashboard_page_is_displayed_properly() {

		actionwords.matchString("Profile Activated ");
		actionwords.matchString("Total Amount ");
		actionwords.matchString("Number Of Orders  ");
		actionwords.matchString("Refund Credit ");
		actionwords.matchString("Notifications");

	}

	@And("^click on Profile Activated$")
	public void click_on_profile_activated() {

		actionwords.NavigateToProfileAccountDashoard();
	}

	@And("^Navigating to Account dashboard$")
	public void navigating_to_account_dashboard() {

		actionwords.AccountDashboardNavigation();
	}

	@When("^Click on save button$")
	public void click_on_save_button() {

		actionwords.SaveProfileInfo();
	}

	@When("^adding items to cart with more than 5000 SR$")
	public void addingItemsToCartWithMoreThan5000SR() throws InterruptedException {
		actionwords.addingItemsToCartWithMoreThan5000SR();
	}

	@Then("^the COD option should not be available$")
	public void theCODOptionShouldNotBeAvailable() {
		actionwords.theCODOptionShouldNotBeAvailableforAbove5000();
	}

	@Then("^the COD option should not be available for unallowed COD products$")
	public void the_cod_option_should_not_be_available_for_unallowed_products() {

		actionwords.theCODOptionShouldNotBeAvailable();

	}

	@Then("^The verify button should not be displayed$")
	public void the_verify_button_should_not_be_displayed() throws Throwable {

		actionwords.EmailVerification();

	}

	@And("^Add the Product to wishlsit from shopping cart$")
	public void add_the_product_to_wishlsit_from_shopping_cart() {

		actionwords.WishlistShoppingCart();
	}

	@Then("^The verify button should be displayed$")
	public void the_verify_button_should_be_displayed() {

		actionwords.EmailVerification();
	}

	@Then("^the shipping periods should be from date to date$")
	public void the_shipping_periods_should_be_from_date_to_date() {
		CommonActions.ShippingPeriods();
	}

	@When("^Navigating to product details page$")
	public void navigating_to_product_details_page() {
		actionwords.NavigatetoProdutDetails();
	}
	
    @Given("^I am on Ramadan campaign Landing page$")
    public void i_am_on_ramadan_campaign_landing_page() {
    	
    	actionwords.RamadanCampaignHomePage();
    }
    
    @When("^Register an already added campaign participant$")
    public void register_an_already_added_campaign_participant()  {
    	actionwords.AlreadyCampaignRegistered();
    	
    }
    
    @When("^Register a new campaign participant Name(.+)and MobileNumber(.+)$")
    public void register_a_new_campaign_participant_nameand_mobilenumber(String name, String mobilenumber)  {
    	
    	actionwords.CampaignRegisteration(name, mobilenumber);
    }
    
    @When("^navigating to unactive campaign$")
    public void navigating_to_unactive_campaign()  {
    	
    	actionwords.NavigateToUnactiveCampaign();
    }

    
    @Then("^the confirmation message(.+)should be displayed$")
    public void the_confirmation_messageshould_be_displayed(String message)  {
    	
    	actionwords.matchString(message);
    }

	@Then("^the shipping periods should be displayed successfully$")
	public void the_shipping_periods_should_be_displayed_successfully() throws Throwable {

		actionwords.shippingtypes();
	}

	@When("^add unallowed COD item to the cart$")
	public void addUnallowedCODItemToTheCart() {
		actionwords.addUnallowedCODItemToTheCart();
	}

	@Given("^that a user which can't use COD is logged to ASWAQ$")
	public void thatAUserWhichCantUseCODIsLoggedToASWAQ() {
		actionwords.thatAUserWhichCantUseCODIsLoggedToASWAQ();
	}

	@Then("^the COD option should not be displayed$")
	public void the_cod_option_should_not_be_displayed() {
		actionwords.CODoptionIsNotDisplayed();
	}

	@Then("^the session is terminated$")
	public void terminateTheSession() {
		actionwords.terminateTheSession();

	}

}