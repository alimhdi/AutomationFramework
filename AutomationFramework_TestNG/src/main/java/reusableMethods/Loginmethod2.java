package reusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import linkedinUIElementLocator.Loginuielementlocator;

public class Loginmethod2 {

	public static WebDriver driver = null;
	Loginuielementlocator loginLocators = new Loginuielementlocator();

	
	public void loginInterface() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ali mahdi\\eclipse-workspace\\SeleniumWithTestNG\\src\\test\\java\\executeLoginTest\\globalinput.properties");
		prop.load(fis);

		/*if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else { (prop.getProperty("browser").equals("IE"))
			driver = new InternetExplorerDriver();
		}*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(loginLocators.getUsernameWebElement())).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id(loginLocators.getPasswordWebElement())).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(loginLocators.getSubmitButtonWebElement())).click();
		
	}

}