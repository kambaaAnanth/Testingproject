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

public class Verify_usermanagement_add_Data_Table extends
		Common_Loginsuccessful_Function {
	@Test
	public void verifyusermanegementAddeddata() throws InterruptedException {
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
		List<WebElement> districtname = driver.findElements(By
				.xpath("//*[@id='posts']/tbody/tr/td[4]"));
		for (WebElement webElement : districtname) {
			String name = webElement.getText();
			System.out.println(name);
			if (webElement.equals("vanitha@kambaa.com")) {
				break;
			}
		}
	}
}