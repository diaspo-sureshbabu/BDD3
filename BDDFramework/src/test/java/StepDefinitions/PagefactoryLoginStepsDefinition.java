package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PagefactoryLoginStepsDefinition {
	
	static WebDriver driver;
	LoginPageFactory loginPF;
	HomePageFactory homePF;
	
	@Given("when user at login page")
	public void when_user_at_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1");
	    
	}
	
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String user_name, String password1) throws InterruptedException {	   
	
		    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password1);
//		Thread.sleep(2000);
		loginPF = new LoginPageFactory(driver);
		loginPF.enterusername(user_name);
		loginPF.enterpassword(password1);
		loginPF.clickloginbtn();
			
	}	
	
	@And("Click Login button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	@Then("User navigate to Home page")
	public void user_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//*[@id="header_container"]/div[1]/div
		
		//Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).size()>0, "Staus : user landed into Products category page ");
			homePF = new HomePageFactory(driver);
					homePF.isCartDisplayed();
		
	}

	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//driver.close();
		driver.quit();
	}


}
