package Pagefactory.subcomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subcomponent_function {
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
	@FindBy(xpath=" //select[@id='scheme_id']")
	public static WebElement scheme;
	@FindBy(xpath="//select[@id='category_id']")
	public static WebElement componentname;
	@FindBy(xpath=" //button[@class='btn btn-success']")
	public static WebElement save1;
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	public static WebElement submit;
	@FindBy(xpath="//input[@id='component_name']")
	public static WebElement subcomponent;
	@FindBy(xpath=" //select[@id='unit']")
	public static WebElement maxarea;
	@FindBy(xpath="//input[@id='max_limit']")
	public static WebElement maxlimit;
	@FindBy(xpath=" //input[@id='min_limit']")
	public static WebElement minlimit;
	@FindBy(xpath="//input[@id='subsidy_amount']")
	public static WebElement subsidy_amount;
	@FindBy(xpath="//input[@id='subsidy_percentage']")
	public static WebElement subsidy_percentage;
	@FindBy(xpath="//div[@class='panel-body']//div[1]//span[1]//div[1]//button[1]//span[1]")
	public static WebElement district;
	@FindBy(xpath=" //ul[@class='multiselect-container dropdown-menu pull-right show']//li[@class='multiselect-item multiselect-all']//input  ")
	public static WebElement multiselect;
	@FindBy(xpath="//div[@class='page-content']//div[2]//span[1]//div[1]//button[1]//span[1] ")
	public static WebElement stages;
	@FindBy(xpath="//ul[@class='multiselect-container dropdown-menu pull-right show']//li[@class='multiselect-item multiselect-all']//input")
	public static WebElement multiselect2;
	@FindBy(id="type")
	public static WebElement type1;
	@FindBy(id="type")
	public static WebElement type2;
	@FindBy(id="short_description")
	public static WebElement short_description;
	@FindBy(xpath="//div[@class='note-editable']")
	public static WebElement editable;
	@FindBy(id="image")
	public static WebElement image;
	@FindBy(xpath=" //tr[1]//td[6]//div[1]//a[1]//button[1]")
	public static WebElement view;
	@FindBy(xpath="//h1[@class='page-title']")
	public static WebElement viewpage;
	
	
	
	
}


