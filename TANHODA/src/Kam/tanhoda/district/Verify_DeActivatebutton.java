package Kam.tanhoda.district;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory.district.District_edit;

public class Verify_DeActivatebutton extends Common_Loginsuccessful_Function {
	@Test
	public void districdeactivebutton() throws InterruptedException,
			IOException {
		PageFactory.initElements(driver, District_edit.class);
		District_edit.username.sendKeys(property.getProperty("username"));
		District_edit.password.sendKeys(property.getProperty("password"));
		District_edit.signinbutton.click();
		String title = driver.getTitle();
		System.out.println("The title name is : " + title);
		Assert.assertEquals(title, "TANHODA");
		List<WebElement> list = driver.findElements(By
				.xpath("//ul[@class='site-menu']/li"));
		Actions action = new Actions(driver);
		action.moveToElement(list.get(1)).click();
		action.build().perform();
		List<WebElement> masterlink = driver.findElements(By
				.xpath("//ul[@class='site-menu-sub']/li"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(masterlink.get(0)).click();
		action1.build().perform();
		District_edit.deactivate.click();
		Thread.sleep(1000);
		District_edit.submit.click();
		String actual = driver.findElement(
				By.xpath("//button[@class='btn btn-warning']")).getText();
		Assert.assertEquals(actual, "Active", "Successful");
	}
}