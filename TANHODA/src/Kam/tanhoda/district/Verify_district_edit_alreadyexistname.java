package Kam.tanhoda.district;

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
import Pagefactory.district.District_edit;

public class Verify_district_edit_alreadyexistname extends
		Common_Loginsuccessful_Function {

	@Test
	public void districeditalraedyexist() throws InterruptedException,
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
		District_edit.editbutton.click();

		if (District_edit.districtname.isEnabled()) {
			District_edit.districtname.clear();
			District_edit.districtname.sendKeys("kanchipuram");
		}
		if (District_edit.districtcode.isEnabled()) {
			District_edit.districtcode.clear();
			District_edit.districtcode.sendKeys("1234");

		}
		if (District_edit.districtoffice.isEnabled()) {
			District_edit.districtoffice.clear();
			District_edit.districtoffice.sendKeys("Acharapakkam");
		}
		District_edit.update.click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(
				src,
				new File(
						"C:\\Users\\kavya\\Desktop\\TANHODA\\Already exist edited district name.png"));
	}

}
