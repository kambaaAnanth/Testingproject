package Kam.tanhoda.scheme;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;

public class Scheme_add_successful extends Common_Loginsuccessful_Function {
	@Test
	public void BlockAddsuccessful() throws InterruptedException, AWTException {
		PageFactory.initElements(driver,
				Pagefactory.scheme.Scheme_Function.class);
		Pagefactory.scheme.Scheme_Function.username.sendKeys(property
				.getProperty("username"));
		Pagefactory.scheme.Scheme_Function.password.sendKeys(property
				.getProperty("password"));
		Pagefactory.scheme.Scheme_Function.signinbutton.click();
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
		action1.moveToElement(scheme.get(3)).click();
		action1.build().perform();
		Thread.sleep(2000);
		Pagefactory.scheme.Scheme_Function.addnew.click();
		Pagefactory.scheme.Scheme_Function.schemename
				.sendKeys("National Horticulture Mission");
		Pagefactory.scheme.Scheme_Function.shortname.sendKeys("NHM");
		if (!Pagefactory.scheme.Scheme_Function.scheme_type1.isSelected()) {
			Pagefactory.scheme.Scheme_Function.scheme_type1.click();
		} else if (Pagefactory.scheme.Scheme_Function.scheme_type1.isSelected()) {
			Pagefactory.scheme.Scheme_Function.scheme_type2.click();
		}
		Thread.sleep(1000);
		Pagefactory.scheme.Scheme_Function.district.click();
		// Select select=new
		// Select(Pagefactory.scheme.Scheme_Function.district);
		// select.selectByIndex(0);
		Pagefactory.scheme.Scheme_Function.selectall.click();
		Pagefactory.scheme.Scheme_Function.schemeselection.click();
		Thread.sleep(1000);
		StringSelection selection = new StringSelection(
				"C:\\Users\\kavya\\Downloads\\agriculture.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(selection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Pagefactory.scheme.Scheme_Function.short_description
				.sendKeys("Nothing");
		Pagefactory.scheme.Scheme_Function.editable.sendKeys("Nothing");
		Pagefactory.scheme.Scheme_Function.save.click();
	}

}