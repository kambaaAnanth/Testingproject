package Kam.tanhoda.login;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory_ADMIN.Successful_login_with_validcredential;

public class Verify_login_successful extends Common_Loginsuccessful_Function {
	@Test
	public void loginsuccessful() {
		PageFactory.initElements(driver,
				Successful_login_with_validcredential.class);
		Successful_login_with_validcredential.username.sendKeys(property
				.getProperty("username"));
		Successful_login_with_validcredential.password.sendKeys(property
				.getProperty("password"));
		Successful_login_with_validcredential.signinbutton.click();
		String title = driver.getTitle();
		System.out.println("The title name is : " + title);
		Assert.assertEquals(title, "TANHODA");
	}
}
