package Kam.tanhoda.scheme;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;

public class Scheme_edit_already_exist  extends Common_Loginsuccessful_Function {
	@Test
	public void Schemeeditsuccessful() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver,
				Pagefactory.scheme.Scheme_Function.class);
		Pagefactory.scheme.Scheme_Function.username.sendKeys(property
				.getProperty("username"));
		Pagefactory.scheme.Scheme_Function.password.sendKeys(property
				.getProperty("password"));
		Pagefactory.scheme.Scheme_Function.signinbutton.click();
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
		action1.moveToElement(scheme.get(3)).click();
		action1.build().perform();
		Thread.sleep(2000);
		Pagefactory.scheme.Scheme_Function.edit.click();
		if(Pagefactory.scheme.Scheme_Function.schemename.isEnabled()){
			Pagefactory.scheme.Scheme_Function.schemename.clear();
			Pagefactory.scheme.Scheme_Function.schemename.sendKeys("National Horticulture Mission");
		}
        if(Pagefactory.scheme.Scheme_Function.shortname.isEnabled()){
        	Pagefactory.scheme.Scheme_Function.shortname.clear();
        	Pagefactory.scheme.Scheme_Function.shortname.sendKeys("NHM");
        	Pagefactory.scheme.Scheme_Function.editupdate.click();
        	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    		Files.copy(
    				src,
    				new File(
    						"C:\\Users\\kavya\\Desktop\\TANHODA\\Already exist edited scheme name.png"));
        }
        
}


}
