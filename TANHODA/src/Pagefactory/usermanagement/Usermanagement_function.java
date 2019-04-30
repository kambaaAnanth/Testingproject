package Pagefactory.usermanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Usermanagement_function {
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[@id='form']")
	public static WebElement signinbutton;
	@FindBy(xpath="//span[contains(text(),'User Management')]")
	public static WebElement usermanagement;
	@FindBy(xpath="//button[@class='btn btn-sm btn-icon btn-inverse btn-round']")
	public static WebElement addnew;
	@FindBy(xpath="//select[@id='role']")
	public static WebElement role;
	@FindBy(xpath="//input[@id='username']")
	public static WebElement name;
	@FindBy(xpath="//input[@id='email']")
	public static WebElement email;
	@FindBy(xpath="//input[@id='password']")
	public static WebElement pword;
	@FindBy(xpath="//textarea[@id='address']")
	public static WebElement address;
	@FindBy(xpath="//input[@id='contact_no']")
	public static WebElement contactnumber;
	@FindBy(xpath="//select[@id='district']")
	public static WebElement district;
	@FindBy(xpath="//select[@id='block']") 
	public static WebElement block;
	@FindBy(id="user_type1")
	public static WebElement permission1;
	@FindBy(xpath="")
	public static WebElement permission2;
	@FindBy(id="user_type1")
	public static WebElement scheme;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public static WebElement save1;
	@FindBy(xpath="//tr[1]//td[8]//div[1]//a[1]//button[1]")
	public static WebElement view;
	@FindBy(xpath="//tr[1]//td[8]//div[1]//a[2]//button[1]")
	public static WebElement edit;
	@FindBy(xpath="//tr[1]//td[8]//div[1]//form[1]//button[1]")
	public static WebElement Active;
	@FindBy(xpath="//tr[1]//td[8]//div[1]//form[1]//button[1]")
	public static WebElement Deactive;
	@FindBy(xpath=" //button[@id='confirm']")
	public static WebElement update;
	@FindBy(xpath="//a[@class='form-control btn btn-danger']")
	public static WebElement editprofile;
	@FindBy(xpath="")
	public static WebElement resetpword;
	@FindBy(xpath=" //input[@id='password']")
	public static WebElement newpword;
	@FindBy(xpath="//input[@id='repassword']")
	public static WebElement confirmpword;
	@FindBy(xpath=" //button[@id='confirm']")
	public static WebElement pwordupdate;
	@FindBy(xpath=" //button[@class='btn btn-info']")
	public static WebElement editupdate;
	
}
