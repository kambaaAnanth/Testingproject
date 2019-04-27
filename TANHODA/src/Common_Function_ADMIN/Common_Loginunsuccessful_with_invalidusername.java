package Common_Function_ADMIN;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common_Loginunsuccessful_with_invalidusername {
	public static WebDriver driver;
	public static Properties property;
	public Properties loadproperties() throws IOException{
		FileInputStream Stream=new FileInputStream("Config.properties.invalidusername"); 
		property=new Properties();
		property.load(Stream);
		return property;
	}
@BeforeSuite
public void launchbrowser() throws IOException{
	loadproperties();
	String username=property.getProperty("username");
	String password=property.getProperty("password");
	String browser=property.getProperty("browser");
	String driverlocation=property.getProperty("driverlocation");
	String url=property.getProperty("url");
	if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("Webdriver.chrome.driver", driverlocation);
		driver=new ChromeDriver();
		
	}else if(browser.equalsIgnoreCase("Firefox")){
		System.setProperty("Webdriver.gecko.driver", driverlocation);
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get(url);
}
@AfterSuite
public void teardown(){
	driver.close();
}
}




