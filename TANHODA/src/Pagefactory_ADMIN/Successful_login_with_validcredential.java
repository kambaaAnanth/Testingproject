package Pagefactory_ADMIN;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Successful_login_with_validcredential {
	@FindBy(id="username")
	public static WebElement username;
	@FindBy(id="password")
	public static WebElement password;
	@FindBy(xpath="//button[@id='form']")
	public static WebElement signinbutton;
}


