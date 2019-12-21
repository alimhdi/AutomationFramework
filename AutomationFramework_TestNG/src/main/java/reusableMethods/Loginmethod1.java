package reusableMethods;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import linkedinInputData.Loginpageinputdata;
import linkedinUIElementLocator.Loginuielementlocator;

public class Loginmethod1 {
	
	Loginuielementlocator loginLocators = new Loginuielementlocator();
	//Loginpageinputdata loginInputData = new Loginpageinputdata();
	//Setuppropertiesconfiguration globalProperties = new Setuppropertiesconfiguration();
	
	
	public void processLogin (WebDriver driver, Properties prop, Loginuielementlocator loginLocators) {
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(loginLocators.getUsernameWebElement())).clear();
		driver.findElement(By.id(loginLocators.getPasswordWebElement())).clear();
		driver.findElement(By.id(loginLocators.getUsernameWebElement())).sendKeys(prop.getProperty("username"));
		//driver.findElement(By.id(loginLocators.getUsernameWebElement())).sendKeys(loginInputData.getUsername());
		//driver.findElement(By.id(loginLocators.getPasswordWebElement())).sendKeys(loginInputData.getPassword());
		driver.findElement(By.id(loginLocators.getPasswordWebElement())).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(loginLocators.getSubmitButtonWebElement())).click();
		
	}
	
	
	
	
	
}