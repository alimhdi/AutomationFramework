package executeLoginTest;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import mainConfiguration.Globalconfiguration;

public class Listeners implements ITestListener {

	private static Logger log= LogManager.getLogger(Listeners.class.getName());

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
		log.error("LOG4J-LOGGER: successfully executed fail listener. The name of the failed TC is: " + result.getName());
		log.debug("LOG4J-LOGGER: successfully executed fail listener. The name of the failed TC is: " + result.getName());
		log.info("LOG4J-LOGGER: successfully executed fail listener. The name of the failed TC is: " + result.getName());
		log.fatal("LOG4J-LOGGER: successfully executed fail listener. The name of the failed TC is: " + result.getName());

		//Globalconfiguration.log.debug("LOG4J-LOGGER: Explicit Fail");
		System.out.println("successfully executed fail listener. The name of the failed TC is: " + result.getName());
	}

}