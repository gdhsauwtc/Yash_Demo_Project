package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		}
     @FindBy(xpath="//input[@id='input-email']")
     WebElement mail;
     
     @FindBy(xpath="//input[@id='input-password']")
     WebElement password;
     
     @FindBy(xpath="//button[text()='Login']")
     WebElement login;
     
     public void setEmail(String Em ) {
    	 mail.sendKeys(Em);
     }
	
	public void setPassword(String Pw) {
		password.sendKeys(Pw);
	}
	public void clickOnLogin(){
		login.click();
	}
	
	
}
