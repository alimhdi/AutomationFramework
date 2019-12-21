package mainConfiguration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Globalconfiguration {
	
	//String baseUrl = "https://www.linkedin.com/LinkedinloginTest";
	public static WebDriver driver;
	public WebDriver chromeDriver= null;
	public WebDriver firefoxDriver= null;
	public WebDriver internetExplorerDriver= null;
	public Properties prop = null;
	
	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\ChromeDriver\\chromedriver.exe");
		chromeDriver  = new ChromeDriver();
		return chromeDriver;
	}
	
	public WebDriver getIEDriver() {
		System.setProperty("webdriver.ie.driver", "C:\\Work\\IEDriver\\IEDriverServer.exe");
		internetExplorerDriver  = new InternetExplorerDriver();
		return internetExplorerDriver;
	}
	
	public WebDriver getFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Work\\FirefoxDriver\\geckodriver.exe");
		firefoxDriver  = new FirefoxDriver();
		return firefoxDriver;
	}
	
	public Properties getProperties() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ali mahdi\\eclipse-workspace\\SeleniumWithTestNG\\src\\test\\java\\executeLoginTest\\globalinput.properties");
		prop.load(fis);
		return prop;
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void lunchBrowser() {
		
		System.out.println("We are now running on " + prop.getProperty("browser"));
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) 
		{
			driver = getChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) 
		{
			driver = getFireFoxDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("IE"))
		{
			driver = getIEDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	public void quitBrowser() {
		driver.close();
		driver.quit();
	}
	
}