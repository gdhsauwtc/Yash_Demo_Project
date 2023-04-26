package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.accountRegistrationPage;
import testBase.BaseClass;

public class TC_001_TestRegistration extends BaseClass {
	@Test
	public void test_account_Registration() throws InterruptedException
	{
		log.info("****TC_001_TestRegistration start*****  ");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		hp.clickRegister();
		
		accountRegistrationPage regpage=new accountRegistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		
		regpage.setLastName(randomeString().toUpperCase());
		
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
	
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		
		
		regpage.submitButton();
		log.info("**** click on submit button***" );
		}
		catch(Exception e)
		{   log.error("test fail");
			Assert.fail();
		}
		log.info("*****finish this TC_001_TestRegistration test***");
	}
	
	
}
