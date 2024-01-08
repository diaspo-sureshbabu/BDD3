//package StepDefinitions;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import baseObjects.LoginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class POMStepDefinition {
//
//	static WebDriver driver;	
//	LoginPage loginpage;
////	LoginPagefactory loginpagefact;
//	
//	
//	@Given("when user at login page")
//	public void when_user_at_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver = new ChromeDriver();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com/v1");
//	    
//	}
//	
//	
//	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_and(String user_name, String password1) throws InterruptedException {	   
//	
//		    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		/*driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password1);
//		Thread.sleep(2000);
//		*/
//		loginpage = new LoginPage(driver);
//		loginpage.enterusername(user_name);
//		loginpage.enterpassword(password1);	
//	
//	}	
//	
//	@And("Click Login button")
//	public void click_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//	
//		loginpage.clickloginbutton();
//	}
//
//	@Then("User navigate to Home page")
//	public void user_navigate_to_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		//*[@id="header_container"]/div[1]/div
//		
//		//Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).size()>0, "Staus : user landed into Products category page ");
//		loginpage.logo_present();
//			
//		
//	}
//
//	@And("close the browser")
//	public void close_the_browser() {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new io.cucumber.java.PendingException();
//		driver.close();
//		//driver.quit();
//	}
//	
//}
