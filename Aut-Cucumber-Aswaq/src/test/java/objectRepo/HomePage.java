package objectRepo;

import org.openqa.selenium.By;

public class HomePage {

	
	public static By Topbanner = By.xpath("//a[@class='account_title hidden-sm hidden-xs']");
	
	public static By profile = By.xpath("/html/body/div[2]/ul/li[3]/a");
	
	public static By SliderMenu = By.xpath("//button[@class='navbar-toggle']");
	
	public static By ProfileMenu= By.xpath("//*[contains(text(), 'Profile')]");
	
	public static By SearchBar = By.id("id_q");
	
	public static By Searchbtn= By.id("submit_search");
	
	public static By SearchMarkets= By.id("id_market");
	
	public static By Searchfilter= By.id("id_category_828");
	
	public static By ClearAll = By.className("remove-refinable-all");
	
	public static By ChangeLanguage = By.className("language-switcher");
	
	public static By WishlistMenu=By.xpath("//*[contains(text(), 'Wishlist')]");
	
	public static By WishlistSlider = By.xpath("/html/body/div[2]/ul/li[5]/a");
	
	public static By SubscribeEmail = By.xpath("//*[@id=\"id_email\"]");
	
	public static By SubscribeBtn = By.id("basic-newsletter-btn");
	
	public static By SearchPagination = By.xpath("//button[@class='active']");
	
}
