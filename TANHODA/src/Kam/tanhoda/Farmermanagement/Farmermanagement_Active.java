package Kam.tanhoda.Farmermanagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;

public class Farmermanagement_Active extends Common_Loginsuccessful_Function {
	@Test
	public void FarmermanagementActivebutton() throws InterruptedException {
	PageFactory.initElements(driver, Pagefactory.Farmermanagement.Farmermanagement_Function.class);
	Pagefactory.Farmermanagement.Farmermanagement_Function.username.sendKeys(property
		.getProperty("username"));
	Pagefactory.Farmermanagement.Farmermanagement_Function.password.sendKeys(property
		.getProperty("password"));
	Pagefactory.Farmermanagement.Farmermanagement_Function.signinbutton.click();
	String title = driver.getTitle();
	System.out.println("The title name is : " + title);
	Assert.assertEquals(title, "TANHODA");
	List<WebElement> list = driver.findElements(By
		.xpath("//ul[@class='site-menu']/li"));
	Actions action = new Actions(driver);
	action.moveToElement(list.get(3)).click();
	action.build().perform();
	Thread.sleep(1000);
	Pagefactory.Farmermanagement.Farmermanagement_Function.Active.click();
	String actual=Pagefactory.Farmermanagement.Farmermanagement_Function.Deactive.getText();
	System.out.println(actual);
	Assert.assertEquals(actual, "Deactive");
}


}
