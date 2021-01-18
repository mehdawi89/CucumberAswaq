package objectRepo;

import org.openqa.selenium.By;

public class OdooLocaters {

	
	public static By Username = By.id("login");
	
	public static By Password = By.id("password");
	
	public static By AswaqERP = By.xpath("//a[contains(text(), 'ASWAQ-ERP-STAGING')]");
	
	public static By Login = By.xpath("//button[@class='btn btn-primary']");
	
	public static By Sales = By.xpath("//a[@href='/web#menu_id=88&action=']");
	
	public static By SalesOrder = By.xpath("//a[@href='/web#menu_id=175&action=241']");
	
	public static By Qoutations = By.xpath("//a[@href='/web#menu_id=179&action=244']");

	public static By AswaqOrderNum = By.xpath("//td[@data-field='aswaq_order_num']");
	
	public static By Search = By.className("o_searchview_input");
	
	public static By FinishOrder = By.xpath("//button[@class='btn btn-sm oe_highlight']");

	public static By Loading = By.className("oe_throbber_message");
	
	public static By OrderStatus = By.xpath("//span[contains(text(),'Completed')]");


}
