package objectRepo;

import org.openqa.selenium.By;

public class Coupons {
	
	public static By CouponName = By.id("id_name");
	
	public static By Code = By.id("id_code");
	
	public static By Search = By.xpath("//button[@class='btn btn-primary']");
	
	public static By NavigateToCoupon = By.xpath("//a[contains(text(),'OncebyoneFix')]");
	
	public static By Edit = By.xpath("//a[contains(text(),'Edit')]");

	public static By StartDate= By.id("id_start_datetime");
	
	public static By EndDate=By.id("id_end_datetime");
	
	public static By Usage= By.id("s2id_id_usage");
	
	public static By CouponType = By.xpath("//div[contains(text(),'Can be used once by one customer')]");
	
	public static By DiscountProducts = By.id("s2id_id_benefit_range");
	
	public static By ProductType =By.xpath("//div[contains(text(),'All products')]");
	
	public static By Discount= By.id("s2id_id_benefit_type");
	
	public static By DiscountTypePercentage = By.xpath("//div[contains(text(),'Percentage off of products in range')]");
	
	public static By DiscountTypeFixed = By.xpath("//div[contains(text(),'Fixed amount off of products in range')]");
	
	public static By DiscountValue = By.id("id_benefit_value");
	
	public static By NumberOfCode=By.id("id_number_of_codes");
	
	public static By Maxlimit = By.id("id_max_limit");
	
	public static By AccountNumber=By.id("id_account_number");
	
	public static By Save = By.xpath("//button[contains(text(),'Save')]");

}
