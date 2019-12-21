package executeLoginTest;

import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import reusableMethods.Loginmethod2;

//@Listeners(executeTest.Listeners.class)

public class Linkedinlogin2Test extends Loginmethod2{
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void loginUsingInheritence1() throws IOException {
		loginInterface();
		System.out.println("Finnished running the first loginmethod1 testcase");

	}
	
	@Test
	public void loginUsingInheritence2() throws IOException {
		loginInterface();
		System.out.println("Explicitly Failing loginInheritence2 to demonstrate screenshot feature");
		Assert.assertTrue(false);
	}


}

