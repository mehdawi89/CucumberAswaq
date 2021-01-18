package objectRepo;

import org.openqa.selenium.By;


public class CheckoutLocators {
	
	//Shopping Cart
	public static By checkout_btn = By.xpath("//a[@href=\"/en/checkout/\"]");
	
	
	//CheckOutDetails
	public static By continue_btn = By.xpath("//button[contains(text(), 'Continue')]");
	
	
	// url = /checkout/preview/
	public static By onlinePayment = By.id("visa_label");
	public static By cod = By.xpath("//*[@id=\"cash_on_delivery_label\"]");
	public static By Wallet = By.id("use_my_credit_label");

	public static By MasterConfirmation = By.id("Secure3dsForm_password");
	public static By MasterSubmit = By.id("submit-simulator");

	
	public static By placeOrder_form = By.xpath("//form[@id=\"place_order_form\"]");
	public static By placeOrder = By.xpath("//*[contains(text(), 'Place Order')]");
	public static By placeOrderbtn = By.xpath("//button[@class='btn btn-default btn-green-bg btn-font-fff-bold payment-trg']");
   
	public static By coupon = By.xpath("//input[@id=\"id_code\"]");
	public static By applyCoupon = By.xpath("//button[contains(text(), 'apply coupon')]");
	public static By RemoveCoupon = By.xpath("//*[contains(text(), '(Remove)')]");
	
	//Visa Info
	public static By cardNo = By.name("card_number");
	public static By CardHolder= By.name("card_holder_name");
	public static By ExpiryMM= By.id("fort_expiry_month");
	public static By ExpiryYY= By.id("fort_expiry_year");
	public static By expDate = By.xpath("//input[@type=\"tel\"]");
	public static By ccv = By.name("card_security_code");
	public static By givenName = By.name("customer.givenName");
	public static By surname = By.name("customer.surname");
	
	//Cancel Order
	public static By ViewOrder = By.linkText("View");
	
	public static By OrderId = By.partialLinkText("Order ID");
	
	public static By CancelOrder = By.xpath("//*[contains(text(), 'Cancel Order')]");
	public static By CancelReason = By.id("id_cancel_reason");
	public static By Note=By.id("id_note");
	public static By ConfirmCancel = By.id("cancel-btn");
	
	//All orders page
	
	public static By DateFrom = By.id("id_date_from");  
	public static By DateTo = By.id("id_date_to");
	public static By OrderNo = By.id("id_order_number");
	public static By Submitfilter = By.xpath("//*[contains(text(),'Submit')]");
	
	//Return
	public static By ReturnItem = By.xpath("//a[contains(text(), 'Return Item')]");
	public static By ReturnReason = By.id("id_return_reason");
    public static By Save = By.xpath("//button[contains(text(), 'Save')]");
		
}