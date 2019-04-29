package Pagefactory.district;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class District_edit {
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[@id='form']")
	public static WebElement signinbutton;
	@FindBy(xpath="//button[@id='3']")
	public static WebElement editbutton;
	@FindBy(id="editdistrict")
	public static WebElement districtname;
	@FindBy(id="editdistrict_code")
	public static WebElement districtcode;
	@FindBy(id="editoffice_address")
	public static WebElement districtoffice;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	public static WebElement update;
	@FindBy(xpath="//tr[1]//td[5]//div[1]//form[1]//button[1]")
	public static WebElement deactivate;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	public static WebElement Active;
	@FindBy(xpath="//button[@id='confirm']")
	public static WebElement submit;
}

