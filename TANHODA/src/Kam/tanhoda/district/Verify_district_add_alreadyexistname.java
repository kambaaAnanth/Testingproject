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

import Common_Function_ADMIN.Common_Loginsuccessful_Function;

import com.google.common.io.Files;

public class Verify_district_add_alreadyexistname extends
		Common_Loginsuccessful_Function {

	@Test
	public void districAddedalreadyexist() throws InterruptedException,
			IOException {
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
		Pagefactory.district.District_Add_Function.Addnew.click();
		Thread.sleep(1000);
		Pagefactory.district.District_Add_Function.district
				.sendKeys("Kancheepuram");
		Pagefactory.district.District_Add_Function.districtcode
				.sendKeys("12345");
		Pagefactory.district.District_Add_Function.officeaddress
				.sendKeys("Acharapakkam");
		Pagefactory.district.District_Add_Function.save.click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(
				src,
				new File(
						"C:\\Users\\kavya\\Desktop\\TANHODA\\Already exist district name.png"));
	}
}
