package Kam.tanhoda.Village;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;

public class Village_Add_Successfull extends Common_Loginsuccessful_Function {
	@Test
	public void VillageAddSuccessfull() throws InterruptedException {
		PageFactory.initElements(driver, Pagefactory.Village.Village_Add.class);
		Pagefactory.Village.Village_Add.username.sendKeys(property
				.getProperty("username"));
		Pagefactory.Village.Village_Add.password.sendKeys(property
				.getProperty("password"));
		Pagefactory.Village.Village_Add.signinbutton.click();
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
		action1.moveToElement(masterlink.get(2)).click();
		action1.build().perform();
		Thread.sleep(2000);
		Pagefactory.Village.Village_Add.Addnew.click();
		Pagefactory.Village.Village_Add.district.click();
		Select select = new Select(Pagefactory.Village.Village_Add.district);
		select.selectByVisibleText("Dharmapuri");
		Pagefactory.Village.Village_Add.block.sendKeys("Dharmapuri");
		Pagefactory.Village.Village_Add.village.sendKeys("nallampalli");
		Pagefactory.Village.Village_Add.villagecode.sendKeys("636701");
		Pagefactory.Village.Village_Add.save.click();
	}

}
