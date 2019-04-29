package Pagefactory.Village;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Village_Add {
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[@id='form']")
	public static WebElement signinbutton;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/button")
	public static WebElement Addnew;
	@FindBy(xpath="//select[@id='district']")
	public static WebElement district;
	@FindBy(xpath="//select[@id='block']")
	public static WebElement block;
	@FindBy(xpath=" //input[@id='village']")
	public static WebElement village;
	@FindBy(xpath=" //input[@id='village_code']")
	public static WebElement villagecode;
	@FindBy(xpath=" //button[contains(text(),'Save')]")
	public static WebElement save;
	@FindBy(xpath="//button[@id='1']")
	public static WebElement editbutton1;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	public static WebElement update;
	@FindBy(xpath="//tr[1]//td[6]//div[1]//form[1]//button[1]")
	public static WebElement deactivate;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	public static WebElement Active;
	@FindBy(xpath="//button[@id='confirm']")
	public static WebElement submit;
	
}
