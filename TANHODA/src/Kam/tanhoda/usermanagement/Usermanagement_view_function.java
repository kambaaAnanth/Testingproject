package Kam.tanhoda.usermanagement;

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
import Pagefactory.usermanagement.Usermanagement_function;

public class Usermanagement_view_function extends
		Common_Loginsuccessful_Function {
	@Test
	public void usermanagementviewfunction() throws InterruptedException {
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
		Usermanagement_function.view.click();
		String actual = driver.findElement(
				By.xpath("//h1[@class='page-title']")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, "View User Details");
	}

	@Test
	public void editprofilebuttonworkingfunction() {
		Usermanagement_function.editprofile.click();
		String actual1 = driver.findElement(
				By.xpath(" //h1[@class='page-title']")).getText();
		System.out.println(actual1);
		Assert.assertEquals(actual1, "Edit User Details");
	}

	@Test
	public void enternewpasswordonly() throws IOException {
		Usermanagement_function.resetpword.click();
		driver.switchTo().activeElement();
		Usermanagement_function.newpword.sendKeys("1234");
		Usermanagement_function.pwordupdate.click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(
				"C:\\Users\\kavya\\Desktop\\TANHODA\\resetpassword1.png"));
	}

	@Test
	public void enterconfirmpasswordonly() throws IOException {
		Usermanagement_function.resetpword.click();
		driver.switchTo().activeElement();
		Usermanagement_function.confirmpword.sendKeys("1234");
		Usermanagement_function.pwordupdate.click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(
				"C:\\Users\\kavya\\Desktop\\TANHODA\\resetpassword2.png"));
	}

	@Test
	public void mismatchfunction() {
		Usermanagement_function.resetpword.click();
		driver.switchTo().activeElement();
		Usermanagement_function.confirmpword.sendKeys("1234");
		Usermanagement_function.pwordupdate.click();
		Usermanagement_function.newpword.sendKeys("1234");
		Usermanagement_function.confirmpword.sendKeys("3214");
		Usermanagement_function.pwordupdate.click();
		String actual3 = driver
				.findElement(
						By.xpath("//div[@class='page']//div[@class='alert alert-danger'][contains(text(),'Password doesnot match')]"))
				.getText();
		System.out.println(actual3);
		Assert.assertEquals(actual3, "Password doesnot match");
	}

	@Test
	public void resetpasswordsuccessful() {
		Usermanagement_function.resetpword.click();
		driver.switchTo().activeElement();
		Usermanagement_function.confirmpword.sendKeys("1234");
		Usermanagement_function.pwordupdate.click();
		Usermanagement_function.newpword.sendKeys("1234");
		Usermanagement_function.confirmpword.sendKeys("1234");
		Usermanagement_function.pwordupdate.click();
		String actual4 = driver.findElement(
				By.xpath(" //div[@class='alert alert-success']")).getText();
		System.out.println(actual4);
	}
}
