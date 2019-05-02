package Kam.tanhoda.component;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory.component.Component_function;

public class Verify_component_Add_data_table   extends Common_Loginsuccessful_Function {
	@Test
	public void componentAdddatatable() throws InterruptedException, AWTException {
		PageFactory.initElements(driver,
				Component_function.class);
		Component_function.username.sendKeys(property
				.getProperty("username"));
		Component_function.password.sendKeys(property
				.getProperty("password"));
		Component_function.signinbutton.click();
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
		action1.moveToElement(scheme.get(4)).click();
		action1.build().perform();
		Thread.sleep(2000);
		 List<WebElement> districtname = driver.findElements(By
					.xpath("//*[@id='posts']/tbody/tr/td[3]"));
			for (WebElement webElement : districtname) {
				String name = webElement.getText();
				System.out.println(name);
				if (webElement.equals("Drip Irrigations")) {
					break;
				}
			}

}
}