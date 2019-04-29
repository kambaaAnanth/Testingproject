package Pagefactory.Block;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Block_Add_Successfully {
	@FindBy(id = "username")
	public static WebElement username;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[@id='form']")
	public static WebElement signinbutton;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/button")
	public static WebElement Addnew;
	@FindBy(id="district")
	public static WebElement district;
	@FindBy(id="block")
	public static WebElement block;
	@FindBy(id="block_code")
	public static WebElement blockcode;
	@FindBy(xpath="//*[@id='form_submit']/div[2]/button[2]")
	public static WebElement save;
	@FindBy(xpath=" //button[@id='1']")
	public static WebElement editbutton;
	@FindBy(id="editdistrict")
	public static WebElement editdistict;
	@FindBy(id="editblock")
	public static WebElement editblock;
	@FindBy(id="editblock_code")
	public static WebElement editblockcode;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	public static WebElement update;
	@FindBy(xpath="//tr[1]//td[5]//div[1]//form[1]//button[1]")
	public static WebElement deactive;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	public static WebElement active;
	@FindBy(xpath="//button[@id='confirm']")
	public static WebElement save1;
	
}
