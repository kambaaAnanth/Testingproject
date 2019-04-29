package Pagefactory.district;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class District_Add_Function {
	
		@FindBy(id = "username")
		public static WebElement username;
		@FindBy(id = "password")
		public static WebElement password;
		@FindBy(xpath = "//button[@id='form']")
		public static WebElement signinbutton;
		@FindBy(xpath = "/html/body/div[2]/div[1]/div/button")
		public static WebElement Addnew;
		@FindBy(id = "district")
		public static WebElement district;
		@FindBy(id = "district_code")
		public static WebElement districtcode;
		@FindBy(id = "office_address")
		public static WebElement officeaddress;
		@FindBy(xpath = "//button[contains(text(),'Save')]")
		public static WebElement save;
//		@FindBy(xpath = "//select[@name='posts_length']")
//		public static WebElement totaldata;
	}

