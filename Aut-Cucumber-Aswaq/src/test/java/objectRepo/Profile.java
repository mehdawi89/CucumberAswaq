package objectRepo;

import org.openqa.selenium.By;

public class Profile {
	
	
	public static By editinfo = By.xpath("//*[contains(text(),'Edit Info')]");

	public static By firstname = By.id("id_first_name");
	
	public static By Lastname = By.id("id_last_name");
	
	public static By IdNumber = By.id("id_id_number");
	
	public static By Save = By.xpath("//button[@class='btn btn-block btn-red-bg btn-font-fff-bold']");
	
	public static By ChangePassword = By.xpath("//*[contains(text(),'Change password')]");
	
	public static By NewPassword= By.id("id_new_password1");
	
	public static By PasswordConformation = By.id("id_new_password2");
	
	public static By OldPassword = By.id("id_old_password");
	
	public static By verifyemail = By.id("id_resend_email");
	
	
	
	
}
