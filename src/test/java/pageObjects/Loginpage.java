package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage
{
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	//locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txtusername;
	
		
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtpassword;
		
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnlogin;
		
		//Action methods
		public void setUsername(String username)
		{
			txtusername.sendKeys(username);
		}
		
		public void setPassword(String password)
		{
			txtpassword.sendKeys(password);
		}
		
		public void clickLogin()
		{
			btnlogin.click();
		}
		

	}

