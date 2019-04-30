package Kam.tanhoda.block;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;
import Pagefactory.Block.Block_Add_Successfully;

public class Verify_successful_edit_blockname extends
		Common_Loginsuccessful_Function {
	@Test
	public void Blockeditsuccessful() throws InterruptedException {
		PageFactory.initElements(driver, Block_Add_Successfully.class);
		Block_Add_Successfully.username.sendKeys(property
				.getProperty("username"));
		Block_Add_Successfully.password.sendKeys(property
				.getProperty("password"));
		Block_Add_Successfully.signinbutton.click();
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
		action1.moveToElement(masterlink.get(1)).click();
		action1.build().perform();
		Block_Add_Successfully.editbutton.click();
		Block_Add_Successfully.editdistict.click();
		Select select = new Select(Block_Add_Successfully.editdistict);
		select.selectByIndex(2);
		if (Block_Add_Successfully.editblock.isEnabled()) {
			Block_Add_Successfully.editblock.clear();
			Block_Add_Successfully.editblock.sendKeys("Acharam");
		}
		if (Block_Add_Successfully.editblockcode.isEnabled()) {
			Block_Add_Successfully.editblockcode.clear();
			Block_Add_Successfully.editblockcode.sendKeys("2345");
		}
		Block_Add_Successfully.update.click();
	}
}
