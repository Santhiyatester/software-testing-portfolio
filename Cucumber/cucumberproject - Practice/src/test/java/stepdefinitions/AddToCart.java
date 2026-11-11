package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	WebDriver driver;
	@Before
	public void beforestart() {
		driver= new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
	}
	@Given("User click the login button and enter the user name {string}")
	public void userClickTheLoginButtonAndEnterTheUserName(String username) throws InterruptedException {
	    driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
	}
	@Given("User enter the passwords {string}")
	public void userEnterThePasswords(String password) {
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}
	@When("User clciks the login button")
	public void userClciksTheLoginButton() throws InterruptedException {
	   driver.findElement(By.xpath("//input[@value='Log in']")).click();
	   Thread.sleep(1000);
	}
	@Then("User should able to see the logout button")
	public void userShouldAbleToSeeTheLogoutButton() throws InterruptedException {
	   String text = driver.findElement(By.xpath("//a[normalize-space()='Log out']")).getText();
	   Assert.assertEquals(text, "Log out");
	   
	   if(driver!=null) {
		  Thread.sleep(2000);
//		  driver.quit();
	   }
	}
	
	@Given("User enter the product {string} in the search box")
	public void userEnterTheProductInTheSearchBox(String book) {
	    driver.findElement(By.name("q")).sendKeys(book);
	}
	@Given("Click the search button")
	public void clickTheSearchButton() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
	@When("user click the add to cart button")
	public void userClickTheAddToCartButton() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")).click();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/input[2]")).click();
	}
	@When("user check the shopping cart number")
	public void userCheckTheShoppingCartNumber() throws InterruptedException {
		Thread.sleep(1000);
	  String qty =  driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
	  String qtynum = qty.substring(1,qty.length()-1);
	  System.out.println(qtynum);
	}
	@When("User click the shopping cart and clicks the product check box")
	public void userClickTheShoppingCartAndClicksTheProductCheckBox() throws InterruptedException {
	   driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
	   
	}
	@When("Clear the Shopping cart")
	public void clearTheShoppingCart() {
	    driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	}
	@When("User click the logout button")
	public void userClickTheLogoutButton() {
	   driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
	}
	@Then("User able to see the login button")
	public void userAbleToSeeTheLoginButton() throws InterruptedException {
	  String text =  driver.findElement(By.xpath("//a[normalize-space()='Log in']")).getText();
	  Assert.assertEquals(text, "Log in");
	  
	}
	@After
	public void teardown(Scenario scenario) throws InterruptedException {
//		if(scenario.isFailed()) {
//			byte[] screenshot = ((RemoteWebDriver)driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot, "png/image", "Failure: " + scenario.getName());
//		}
			if(driver!=null) {
			  Thread.sleep(2000);
			  driver.quit();
		  }
	}
}
