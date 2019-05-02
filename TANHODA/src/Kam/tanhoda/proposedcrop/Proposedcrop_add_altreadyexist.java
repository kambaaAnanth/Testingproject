package Kam.tanhoda.proposedcrop;

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
import Pagefactory.proposedcrop.Proposedcrop_function;

public class Proposedcrop_add_altreadyexist extends Common_Loginsuccessful_Function {
	@Test
	public void Proposedcropaddaltreadyexist() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver,
				Proposedcrop_function.class);
		Proposedcrop_function.username.sendKeys(property
				.getProperty("username"));
		Proposedcrop_function.password.sendKeys(property
				.getProperty("password"));
		Proposedcrop_function.signinbutton.click();
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
		Proposedcrop_function.addnew.click(); 
		Proposedcrop_function.cropname.sendKeys("paddy");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(
				src,
				new File(
						"C:\\Users\\kavya\\Desktop\\TANHODA\\Already exist proposedcrop name.png"));

}


}
