package executeLoginTest;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import mainConfiguration.Globalconfiguration;

public class Listeners implements ITestListener {
	
	Globalconfiguration globalConf = new Globalconfiguration();

	
	public void onTestFailure(ITestResult result) {
		//result.getName();
		//driver = browse.getChromeDriver();
		File src = ((TakesScreenshot) globalConf.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File("C:\\Work\\" + result.getName() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("successfully executed fail listener. The name of the failed TC is: " + result.getName());
	}

}