package executeLoginTest;

//import org.testng.annotations.Test;
///import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import linkedinInputData.Loginpageinputdata;
import linkedinUIElementLocator.Loginuielementlocator;
import mainConfiguration.Globalconfiguration;
import reusableMethods.Loginmethod1;

@Listeners(executeLoginTest.Listeners.class)

public class LinkedinabstractlonginTest extends Globalconfiguration{
	
	Loginmethod1 loginmethod1 = new Loginmethod1();
	Loginuielementlocator loginLocators = new Loginuielementlocator();
	//Loginpageinputdata loginInputData = new Loginpageinputdata();



	@BeforeTest
	public void setupTestConfiguration() throws IOException {
		getProperties();
		lunchBrowser();
		
	}
	
	@AfterTest
	public void tearDown() {
		quitBrowser();
		
	}
	
	@Test
	public void iWantToLogin1() {
		//lunchBrowser();
		loginmethod1.processLogin(driver, prop, loginLocators);
		System.out.println("Abstraction LOGIN ONE successfully initiated");
		//System.out.println("INPUT DATA" + loginInputData.getUsername());
	}
	
	@Test
	public void iWantToLogin2() {
		//lunchBrowser();
		loginmethod1.processLogin(driver, prop, loginLocators);
		System.out.println("Abstractio LOGIN TWO successfully initiated");
		Assert.assertTrue(false);
		
	}
}