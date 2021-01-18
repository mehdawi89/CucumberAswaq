package objectRepo;

import org.openqa.selenium.By;

public class Wishlist {

	
	public static By EditWishlist = By.id("edit-wishlist");
	
	public static By DeleteWishlist = By.id("remove-wishlist");
	
	public static By RemoveItemFromWishlist = By.xpath("//button[@class='wishlist-option remove-btn-wishlist']");
	
	public static By EditField = By.name("name");
	
	public static By Done = By.xpath("//*[contains(text(), 'Done')]");
	
	public static By Wishlistdropdown = By.id("select-wishlist");
	
	public static By Delete = By.xpath("//*[contains(text(), 'Delete')]");
	
	
}
