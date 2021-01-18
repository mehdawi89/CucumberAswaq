package objectRepo;

import org.openqa.selenium.By;

public class ProductDetails {
	public static By quantity = By.id("id_quantity");
	public static By addToCart = By.xpath("//li[contains(text(),'Add to cart']");

	public static By MHoverQuickViewAvailable = By.xpath("//a[@href='/en/market/quick-view/None_3467/']");

	public static By MHoverQuickViewNonAvailable = By.xpath("//a[@href='/en/market/quick-view/None_4679/']");

	public static By AddToWishlist = By.xpath("//button[contains(text(), 'Add to wish list')]");
	
	public static By CartWishlist = By.xpath("//*[contains(text(), 'Add to wish list')]");

	public static By WishlistName = By.name("name");

	public static By AddToNewWishlist = By.xpath("//button[contains(text(), ' Add To New Wishlist')]");

	public static By ViewProductDetails = By.xpath("//a[contains(text(), 'View full product details')]");
	
	public static By AddedWishlist= By.xpath("//a[@class='blocked title-alert']");
	
	public static By ShareOnFb = By.xpath("//div[@class='margin-bottom5']");
	
	public static By ShareOnTW = By.xpath("(//div[@class='margin-bottom5'])[2]");
	
	public static By PostOnFb = By.name("__CONFIRM__");
	

	
}
