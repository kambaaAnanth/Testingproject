package Pagefactory.Farmermanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Farmermanagement_Function {
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[@id='form']")
	public static WebElement signinbutton;
	@FindBy(xpath="//tr[1]//td[8]//div[1]//a[1]//button[1]")
	public static WebElement view;
	@FindBy(xpath=" //button[@id='2']")
	public static WebElement edit;
	@FindBy(xpath="//tr[1]//td[8]//div[1]//form[1]//button[1]")
	public static WebElement Deactive;
	@FindBy(xpath="//tr[1]//td[8]//div[1]//form[1]//button[1]")
	public static WebElement Active;
	@FindBy(xpath="//a[@class='form-control btn btn-danger']")
	public static WebElement editprofile;
	@FindBy(xpath=" //button[contains(@class,'form-control btn btn-info password')]")
	public static WebElement resetpassword;
	@FindBy(xpath="//button[@id='confirm']")
	public static WebElement pwordupdate;
	@FindBy(xpath="//button[@id='confirm']")
	public static WebElement update1;
	@FindBy(xpath="//button[@class='btn btn-info']")
	public static WebElement editupdate;
	@FindBy(xpath="//input[@id='password']")
	public static WebElement newpword;
	@FindBy(xpath="//input[@id='repassword']")
	public static WebElement confirmpword;
	@FindBy(xpath="//select[@id='farmer_type']")
	public static WebElement farmertype;
	@FindBy(xpath="//input[@id='age']")
	public static WebElement age;
}
