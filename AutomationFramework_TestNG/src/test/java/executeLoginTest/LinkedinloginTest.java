package executeLoginTest;

//import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import linkedinInputData.Loginpageinputdata;
import linkedinUIElementLocator.Loginuielementlocator;

import org.testng.annotations.Listeners;
import mainConfiguration.Setupbrowserconfiguration;
import reusableMethods.Loginmethod1;

//@Listeners(executeTest.Listeners.class)

public class LinkedinloginTest {
	Setupbrowserconfiguration browseUrl = new Setupbrowserconfiguration();
	
	
	Loginmethod1 loginmethod1 = new Loginmethod1();
	Loginuielementlocator loginLocators = new Loginuielementlocator();
	//Loginpageinputdata loginInputData = new Loginpageinputdata();


	public static WebDriver driver;
	public static Properties prop;

	
	public void lunchBrowserAndLogin() {
		
	}
	
	@BeforeTest
	public void getBrowserSetupConfiguration() throws IOException {
	
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ali mahdi\\eclipse-workspace\\SeleniumWithTestNG\\src\\test\\java\\executeLoginTest\\globalinput.properties");
		prop.load(fis);
		System.out.println("We are now running on " + prop.getProperty("browser"));
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) 
		{
			driver = browseUrl.getChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) 
		{
			driver = browseUrl.getFireFoxDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("IE"))
		{
			driver = browseUrl.getIEDriver();
		}
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void processLogin0() {
		loginmethod1.processLogin(driver, prop, loginLocators);
		System.out.println("I i read from the properties");

	}
	
	@Test
	public void processLogin1() {
		loginmethod1.processLogin(driver, prop, loginLocators);
		System.out.println("I i read from the properties");

	}
	
	@Test
	public void processLogin2() {
		driver.get(browseUrl.getBaseUrl());
		Assert.assertTrue(false);
	}
	

}