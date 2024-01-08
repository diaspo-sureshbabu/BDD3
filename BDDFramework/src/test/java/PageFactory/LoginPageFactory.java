package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	
	public LoginPageFactory (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="user-name")
	WebElement txtuser_name;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login-button")
	WebElement btnlogin;
	
	public void enterusername(String username) {
		txtuser_name.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		txtpassword.sendKeys(password);		
	}
	
	public void clickloginbtn() {
		btnlogin.click();
	}
	
	
	
}
