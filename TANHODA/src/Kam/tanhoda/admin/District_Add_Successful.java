package Kam.tanhoda.admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory_ADMIN.District_Add_Function;
import Pagefactory_ADMIN.Successful_login_with_validcredential;

public class District_Add_Successful extends Common_Loginsuccessful_Function {
@Test
public void districAdd() throws InterruptedException{
	PageFactory.initElements(driver,District_Add_Function.class);
	District_Add_Function.username.sendKeys(property.getProperty("username"));
	District_Add_Function.password.sendKeys(property.getProperty("password"));
	District_Add_Function.signinbutton.click();
	String title=driver.getTitle();
	System.out.println("The title name is : " +title );
	Assert.assertEquals(title, "TANHODA");
	List<WebElement>list=driver.findElements(By.xpath("//ul[@class='site-menu']/li"));
	Actions action=new Actions(driver);
	action.moveToElement(list.get(1)).click();
	action.build().perform();
	List<WebElement> masterlink=driver.findElements(By.xpath("//ul[@class='site-menu-sub']/li"));
	Actions action1=new Actions(driver);
	action1.moveToElement(masterlink.get(0)).click();
	action1.build().perform();
	Thread.sleep(2000);
	District_Add_Function.Addnew.click();
	District_Add_Function.district.sendKeys("CHENNAI");
	District_Add_Function.districtcode.sendKeys("600028");
	District_Add_Function.officeaddress.sendKeys("Tambaram");
	District_Add_Function.save.click();
}

}


