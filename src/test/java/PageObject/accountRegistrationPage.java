package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountRegistrationPage extends BasePage {

	public accountRegistrationPage(WebDriver driver) {
		super(driver);
		}

	@FindBy(xpath="//input[@id=\"input-firstname\"]")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id=\"input-lastname\"]")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement button;
	
	public void setFirstName(String fst) {
		txtFirstname.sendKeys(fst);	
	}
	public void setLastName(String lst) {
		txtLastname.sendKeys(lst);
	}
	public void setEmail(String id) {
		txtEmail.sendKeys(id);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void submitButton() {
		button.click();
	}
}
