package objectRepo;

import org.openqa.selenium.By;

public class CancelOrderLocators {
	
	//Shopping Cart
	public static By checkout_btn = By.xpath("//a[@href=\"/en/checkout/\"]");
	
	
	//CheckOutDetails
	public static By continue_btn = By.xpath("//button[contains(text(), 'Continue')]");
		
	// url = /checkout/preview/
	public static By visa = By.xpath("//input[@id=\"visa_label\"]");
	public static By cod = By.xpath("//*[@id=\"cash_on_delivery_label\"]");
	public static By mastercart= By.xpath("//input[@id=\"master_label\"]");
	public static By americanExpress = By.xpath("//input[@id=\"amex_label\"]");
	public static By sadad = By.xpath("//input[@value=\"sadad\"]");
	

	
	public static By placeOrder_form = By.xpath("//form[@id=\"place_order_form\"]");
	public static By placeOrder = By.xpath("//*[contains(text(), 'Place Order')]");
	
	public static By coupon = By.xpath("//input[@id=\"id_code\"]");
	public static By applyCoupon = By.xpath("//button[contains(text(), 'apply coupon')]");
	
	
	//Visa Info
	public static By cardNo = By.name("card.number");
	public static By expDate = By.xpath("//input[@type=\"tel\"]");
	public static By ccv = By.name("card.cvv");
	public static By givenName = By.name("customer.givenName");
	public static By surname = By.name("customer.surname");

			

}