package Kam.tanhoda.subcomponent;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_Function_ADMIN.Common_Loginsuccessful_Function;

import Pagefactory.subcomponent.Subcomponent_function;


public class Subcomponent_add_successful extends Common_Loginsuccessful_Function {
	@Test
	public void Subcomponentaddsuccessful() throws InterruptedException, AWTException {
		PageFactory.initElements(driver,
				Subcomponent_function.class);
		Subcomponent_function.username.sendKeys(property
				.getProperty("username"));
		Subcomponent_function.password.sendKeys(property
				.getProperty("password"));
		Subcomponent_function.signinbutton.click();
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
		Thread.sleep(1000);
		action1.moveToElement(scheme.get(5)).click();
		action1.build().perform();
		Thread.sleep(2000);
		Subcomponent_function.addnew.click(); 
		Subcomponent_function.scheme.click();
        Select select=new Select(Subcomponent_function.scheme);
        select.selectByValue("1");
        Subcomponent_function.componentname.click();
        Select select1=new Select(Subcomponent_function.componentname) ;
        select1.selectByValue("1");
        Subcomponent_function.subcomponent.sendKeys("Hi-Tech Nursery"); 
        Subcomponent_function.maxarea.click();
        Select select2=new Select(Subcomponent_function.maxarea);
        select2.selectByIndex(1);
        Subcomponent_function.maxlimit.sendKeys("5");
        Subcomponent_function.minlimit.sendKeys("3");
        Subcomponent_function.subsidy_amount.sendKeys("10000");
        Subcomponent_function.subsidy_percentage.sendKeys("12");
        Subcomponent_function.district.click();
    List<WebElement> districtlist=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu pull-right show']/li"));
    Actions action2 = new Actions(driver);
	action2.moveToElement(districtlist.get(1)).click();
	action2.build().perform();
	Subcomponent_function.stages.click();
	 List<WebElement> stagestlist=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu pull-right show']/li"));
	    Actions action3 = new Actions(driver);
		action3.moveToElement(stagestlist.get(1)).click();
		action3.build().perform();
   if(!Subcomponent_function.type1.isSelected()){
	   Subcomponent_function.type1.click();
   }else if(Subcomponent_function.type1.isSelected()){
	   Subcomponent_function.type2.click();  
   }
   Subcomponent_function.short_description.sendKeys("Nothing");
   Subcomponent_function.editable.sendKeys("nothing");
   Subcomponent_function.image.click();
   StringSelection selection=new StringSelection("C:\\Users\\kavya\\Downloads\\agriculture.jpg");
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
   Robot robot=new Robot();
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   Subcomponent_function.save1.click();
       
}


}
