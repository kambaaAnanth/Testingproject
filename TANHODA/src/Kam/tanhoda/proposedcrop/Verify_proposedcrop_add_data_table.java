package Kam.tanhoda.proposedcrop;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory.proposedcrop.Proposedcrop_function;

public class Verify_proposedcrop_add_data_table extends Common_Loginsuccessful_Function {
	@Test
	public void proposedcropadddatatable() throws InterruptedException, AWTException {
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
		List<WebElement> districtname = driver.findElements(By
				.xpath("//*[@id='posts']/tbody/tr/td[2]"));
		for (WebElement webElement : districtname) {
			String name = webElement.getText();
			System.out.println(name);
			if (webElement.equals("Paddy")) {
				break;
			}
		}

}
}