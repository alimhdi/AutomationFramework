package mainConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Setupbrowserconfiguration {
	String baseUrl = "https://www.linkedin.com/LinkedinloginTest";
	public WebDriver chromeDriver= null;
	WebDriver firefoxDriver= null;
	WebDriver internetExplorerDriver= null;
	
	public void setWebDriver(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	
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
	
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	

}