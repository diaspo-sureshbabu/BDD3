package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePageFactory 
{
	WebDriver driver2;
		
	@FindBy(xpath="//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']" )
	WebElement lb1_cart;
	
	public HomePageFactory(WebDriver driver) {
		this.driver2 = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void isCartDisplayed()
	{	
		System.out.print("displayed or not" + 	lb1_cart.isDisplayed());
		
	}	
		
	
	
}	
