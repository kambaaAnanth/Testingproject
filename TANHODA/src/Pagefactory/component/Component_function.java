package Pagefactory.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Component_function {
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[@id='form']")
	public static WebElement signinbutton;
	@FindBy(xpath="//button[@class='btn btn-sm btn-icon btn-inverse btn-round']")
	public static WebElement addnew;
	public static WebElement edit;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	public static WebElement active;
	@FindBy(xpath="//tr[1]//td[5]//div[1]//form[1]//button[1]")
	public static WebElement deactive;
	@FindBy(xpath=" //select[@id='scheme']")
	public static WebElement scheme;
	@FindBy(id="category_name")
	public static WebElement componentname;
	@FindBy(xpath="//button[@class='btn btn-success']")
	public static WebElement save1;
	@FindBy(xpath="//tr[7]//td[4]//div[1]//a[1]//button[1]")
	public static WebElement editbutton;
	@FindBy(xpath=" //div[@class='col-md-2']")
	public static WebElement save2;
	@FindBy(xpath="//button[@id='confirm']")
	public static WebElement submit;
}
