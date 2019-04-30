package Pagefactory.scheme;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;

public class Scheme_Function {
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[@id='form']")
	public static WebElement signinbutton;
	@FindBy(xpath="//button[@class='btn btn-sm btn-icon btn-inverse btn-round']")
	public static WebElement addnew;
	@FindBy(xpath="//input[@id='scheme_name']")
	public static WebElement schemename;
	@FindBy(xpath="//input[@id='short_name']")
	public static WebElement shortname;
	@FindBy(id="scheme_type")
	public static WebElement scheme_type1;
	@FindBy(xpath=" //div[@class='col-md-6']//div[2]//div[1]//input[1]")
	public static WebElement scheme_type2;
	@FindBy(xpath="//span[@class='multiselect-selected-text']")
	public static WebElement district;
	@FindBy(xpath="//label[contains(text(),'Select all')]")
	public static WebElement selectall;
	@FindBy(id="scheme_image")
	public static WebElement schemeselection;
	@FindBy(xpath="//textarea[@id='short_description']")
	public static WebElement short_description;
	@FindBy(xpath="//div[@class='note-editable']")
	public static WebElement editable;
	@FindBy(xpath="//button[@class='btn btn-success']")
	public static WebElement save;
	@FindBy(xpath="//tr[1]//td[5]//div[1]//a[1]//button[1]")
	public static WebElement view;
	@FindBy(xpath="//h1[@class='page-title']")
	public static WebElement viewpage;
	@FindBy(xpath="//tr[1]//td[5]//div[1]//a[1]//button[1]")
	public static WebElement edit;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	public static WebElement active;
	@FindBy(xpath="//tr[1]//td[5]//div[1]//form[1]//button[1]")
	public static WebElement deactive;
	@FindBy(xpath="//button[@class='btn btn-success']")
	public static WebElement editupdate;
	@FindBy(xpath="//button[@id='confirm']")
	public static WebElement update;
}