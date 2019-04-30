package Kam.tanhoda.usermanagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory.usermanagement.Usermanagement_function;

public class Usermanagement_edit_successful extends
		Common_Loginsuccessful_Function {
	@Test
	public void usermanagementedit() throws InterruptedException {
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
		Usermanagement_function.edit.click();
		Usermanagement_function.role.click();
		Select role = new Select(Usermanagement_function.role);
		role.selectByIndex(2);
		if (Usermanagement_function.name.isEnabled()) {
			Usermanagement_function.name.clear();
			Usermanagement_function.name.sendKeys("vanitha");
		}
		if (Usermanagement_function.pword.isEnabled()) {
			Usermanagement_function.pword.clear();
			Usermanagement_function.pword.sendKeys("1234");
		}
		Usermanagement_function.address.sendKeys("coimbatore");
		Usermanagement_function.contactnumber.sendKeys("8765432109");
		Usermanagement_function.district.click();
		Select district = new Select(Usermanagement_function.district);
		district.selectByIndex(2);
		Usermanagement_function.block.click();
		Select block = new Select(Usermanagement_function.block);
		block.selectByIndex(2);

		Usermanagement_function.editupdate.click();
	}
}
