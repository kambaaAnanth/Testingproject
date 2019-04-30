package Kam.tanhoda.login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Common_Function_ADMIN.Common_Loginunsuccessful_with_invalidpassword;
import Pagefactory_ADMIN.Successful_login_with_validcredential;

public class Verify_login_with_invalidpassword extends
		Common_Loginunsuccessful_with_invalidpassword {
	@Test
	public void invalidpassword() throws IOException {
		PageFactory.initElements(driver,
				Successful_login_with_validcredential.class);
		Successful_login_with_validcredential.username.sendKeys(property
				.getProperty("username"));
		Successful_login_with_validcredential.password.sendKeys(property
				.getProperty("password"));
		Successful_login_with_validcredential.signinbutton.click();
		String Alert = driver.findElement(
				By.xpath("//div[@class='alert alert-danger']")).getText();
		System.out.println(Alert);
		Assert.assertEquals(Alert, "Invalid Username or Password");
	}
}
