package Kam.tanhoda.subcomponent;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory.subcomponent.Subcomponent_function;

public class Subcomponent_edit_alreadyexist  extends Common_Loginsuccessful_Function {
	@Test
	public void Subcomponenteditalreadyexist() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver,
				Subcomponent_function.class);
		Subcomponent_function.username.sendKeys(property
				.getProperty("username"));
		Subcomponent_function.password.sendKeys(property
				.getProperty("password"));
		Subcomponent_function.signinbutton.click();
		String title = driver.getTitle();
		System.out.println("The title name is : " + title);
		Assert.assertEquals(title, "TANHODA");
		List<WebElement> list = driver.findElements(By
				.xpath("//ul[@class='site-menu']/li"));
		Actions action = new Actions(driver);
		action.moveToElement(list.get(4)).click();
		action.build().perform();
		List<WebElement> scheme = driver.findElements(By
				.xpath("//ul[@class='site-menu-sub']/li"));
		Actions action1 = new Actions(driver);
		Thread.sleep(1000);
		action1.moveToElement(scheme.get(5)).click();
		action1.build().perform();
		Thread.sleep(2000);
		Subcomponent_function.edit.click();
		Subcomponent_function.scheme.click();
        Select select=new Select(Subcomponent_function.scheme);
        select.selectByValue("1");
        Subcomponent_function.componentname.click();
        Select select1=new Select(Subcomponent_function.componentname) ;
        select1.selectByValue("1");
        if(Subcomponent_function.subcomponent.isEnabled()){
        	Subcomponent_function.subcomponent.clear();
        	 Subcomponent_function.subcomponent.sendKeys("Hi-Tech Nursery"); 
        }
		 if(Subcomponent_function.maxlimit.isEnabled()){
			 Subcomponent_function.maxlimit.clear();
			 Subcomponent_function.maxlimit .sendKeys("5");
		 }
	        if(Subcomponent_function.minlimit.isEnabled()){
	        	Subcomponent_function.minlimit.clear();
	        	Subcomponent_function.minlimit.sendKeys("3");
	        }	
	       if(Subcomponent_function.subsidy_amount.isEnabled()){
	    	   Subcomponent_function.subsidy_amount.clear();
	    	   Subcomponent_function.subsidy_amount.sendKeys("10000");
	       }
	       Subcomponent_function.save1.click();
	       File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Files.copy(
					src,
					new File(
							"C:\\Users\\kavya\\Desktop\\TANHODA\\edited Already exist subcomponent name .png")); 
}


}
