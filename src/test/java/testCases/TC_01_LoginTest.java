package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_01_LoginTest extends Baseclass
{
	
	@Test
	public void LoginTest()
	{
		logger.info("LoginTest started");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.setUsername("Admin");
		logger.info("Entered text for user field");
		loginpage.setPassword("admin123");
		logger.info("Entered text for password field");
		loginpage.clickLogin();
		logger.info("Clicked on login");
		assertEquals(driver.getTitle(), "OrangeHRM");
		logger.info("Login Test is passed");
	}
	
}
