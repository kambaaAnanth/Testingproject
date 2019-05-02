package Pagefactory.proposedcrop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Proposedcrop_function {
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[@id='form']")
	public static WebElement signinbutton;
	@FindBy(xpath="//button[@class='btn btn-sm btn-icon btn-inverse btn-round']")
	public static WebElement addnew;
	@FindBy(xpath="//tr[1]//td[6]//div[1]//a[2]//button[1]")
	public static WebElement edit;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	public static WebElement active;
	@FindBy(xpath="//tr[1]//td[5]//div[1]//form[1]//button[1]")
	public static WebElement deactive;
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	public static WebElement submit;
	@FindBy(xpath=" //button[contains(text(),'Update')]")
	public static WebElement save1;
	@FindBy(xpath=" //tr[1]//td[6]//div[1]//a[1]//button[1]")
	public static WebElement view;
	@FindBy(xpath="//h1[@class='page-title']")
	public static WebElement viewpage;
	@FindBy(id="crop_name")
	public static WebElement cropname;
}
