package objectRepo;

import org.openqa.selenium.By;

public class ShoppingCartLocaters {

	public static By CartQuantity = By.id("id_form-0-quantity");
	public static By Remove=By.xpath("//*[contains(text(), 'Remove')]");
	
	public static By CheckFstProduct = By.xpath("//input[@class='basket-item-checbox']");
	public static By Check2ndProduct = By.xpath("(//input[@class='basket-item-checbox'])[2]");
	
	public static By Delete = By.id("delete_multi_product");

}
