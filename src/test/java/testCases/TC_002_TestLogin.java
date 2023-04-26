package testCases;

import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import testBase.BaseClass;

public class TC_002_TestLogin extends BaseClass{

	@Test
	public void Test_loin() {
		
		log.info("****TC_002_TestLogin Start*****");
		
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("UserName"));
		lp.setPassword(rb.getString("Password"));
		lp.clickOnLogin();
		
		log.info("****TC_002_TestLogin_End");	
	
	
	
	
	
	
	}
	
	
}
