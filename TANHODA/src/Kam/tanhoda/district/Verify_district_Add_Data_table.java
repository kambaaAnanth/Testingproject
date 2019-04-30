package Kam.tanhoda.district;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;

public class Verify_district_Add_Data_table extends
		Common_Loginsuccessful_Function {
	@Test
	public void verifydistricAdd() throws InterruptedException {
		PageFactory.initElements(driver,
				Pagefactory.district.District_Add_Function.class);
		Pagefactory.district.District_Add_Function.username.sendKeys(property
				.getProperty("username"));
		Pagefactory.district.District_Add_Function.password.sendKeys(property
				.getProperty("password"));
		Pagefactory.district.District_Add_Function.signinbutton.click();
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
		Thread.sleep(2000);
		List<WebElement> districtname = driver.findElements(By
				.xpath("//*[@id='posts']/tbody/tr/td[2]"));
		for (WebElement webElement : districtname) {
			String name = webElement.getText();
			System.out.println(name);
			if (webElement.equals("Vellore")) {
				break;
			}
		}

	}
}
