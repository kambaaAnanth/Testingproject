package Kam.tanhoda.Farmermanagement;

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


public class Farmermanagement_view_Function extends
          Common_Loginsuccessful_Function {
@Test
public void usermanagementviewfunction() throws InterruptedException {
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
Pagefactory.Farmermanagement.Farmermanagement_Function.view.click();{
	String actual = driver.findElement(
			By.xpath("////h1[@class='page-title']")).getText();
	System.out.println(actual);
	Assert.assertEquals(actual, "View Farmer Details");
}
}
@Test
public void editprofilebuttonworkingfunction() {
	Pagefactory.Farmermanagement.Farmermanagement_Function.editprofile.click();
	String actual1 = driver.findElement(
			By.xpath(" //h1[@class='page-title']")).getText();
	System.out.println(actual1);
	Assert.assertEquals(actual1, "Farmer Profile Edit");
}
@Test
public void enternewpasswordonly() throws IOException {
	Pagefactory.Farmermanagement.Farmermanagement_Function.resetpassword.click();
	driver.switchTo().activeElement();
	Pagefactory.Farmermanagement.Farmermanagement_Function.newpword.sendKeys("1234");
	Pagefactory.Farmermanagement.Farmermanagement_Function.pwordupdate.click();
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(src, new File(
			"C:\\Users\\kavya\\Desktop\\TANHODA\\resetpassword1.png"));
}

@Test
public void enterconfirmpasswordonly() throws IOException {
	Pagefactory.Farmermanagement.Farmermanagement_Function.resetpassword.click();
	driver.switchTo().activeElement();
	Pagefactory.Farmermanagement.Farmermanagement_Function.confirmpword.sendKeys("1234");
	Pagefactory.Farmermanagement.Farmermanagement_Function.pwordupdate.click();
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(src, new File(
			"C:\\Users\\kavya\\Desktop\\TANHODA\\resetpassword2.png"));
}

@Test
public void mismatchfunction() {
	Pagefactory.Farmermanagement.Farmermanagement_Function.resetpassword.click();
	driver.switchTo().activeElement();
	Pagefactory.Farmermanagement.Farmermanagement_Function.newpword.sendKeys("1234");
	Pagefactory.Farmermanagement.Farmermanagement_Function.confirmpword.sendKeys("3214");
	Pagefactory.Farmermanagement.Farmermanagement_Function.pwordupdate.click();
	String actual3 = driver
			.findElement(
					By.xpath("//div[@class='page']//div[@class='alert alert-danger'][contains(text(),'Password doesnot match')]"))
			.getText();
	System.out.println(actual3);
	Assert.assertEquals(actual3, "Password doesnot match");
}

@Test
public void resetpasswordsuccessful() {
	Pagefactory.Farmermanagement.Farmermanagement_Function.resetpassword.click();
	driver.switchTo().activeElement();
	Pagefactory.Farmermanagement.Farmermanagement_Function.newpword.sendKeys("1234");
	Pagefactory.Farmermanagement.Farmermanagement_Function.confirmpword.sendKeys("1234");
	Pagefactory.Farmermanagement.Farmermanagement_Function.pwordupdate.click();
	String actual4 = driver.findElement(
			By.xpath(" //div[@class='alert alert-success']")).getText();
	System.out.println(actual4);
}
}

