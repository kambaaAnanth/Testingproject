package Kam.tanhoda.usermanagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory.usermanagement.Usermanagement_function;

public class Usermanagement_Active extends Common_Loginsuccessful_Function {
	@Test
	public void Active() throws InterruptedException {
		PageFactory.initElements(driver, Usermanagement_function.class);
		Usermanagement_function.username.sendKeys(property
				.getProperty("username"));
		Usermanagement_function.password.sendKeys(property
				.getProperty("password"));
		Usermanagement_function.signinbutton.click();
		String title = driver.getTitle();
		System.out.println("The title name is : " + title);
		Assert.assertEquals(title, "TANHODA");
		List<WebElement> list = driver.findElements(By
				.xpath("//ul[@class='site-menu']/li"));
		Actions action = new Actions(driver);
		action.moveToElement(list.get(2)).click();
		action.build().perform();
		Thread.sleep(1000);
		Usermanagement_function.Active.click();
		String actual = Usermanagement_function.Deactive.getText();
		System.out.println(actual);
		Assert.assertEquals(actual, "Deactive");
	}

}
