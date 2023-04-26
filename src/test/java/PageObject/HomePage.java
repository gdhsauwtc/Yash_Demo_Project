package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);}
		
		
	@FindBy (xpath="//span[text()='My Account']	")
	WebElement Myaccount;
		
	@FindBy(linkText="Register")
	WebElement Regs;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement lg;

	public void clickmyaccount(){
		Myaccount.click();
	}
	
	public void clickRegister() {
		Regs.click();
	}
	 public void clickLogin() {
		 lg.click();
	 }
	
}
