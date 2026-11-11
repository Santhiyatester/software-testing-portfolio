package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver = new ChromeDriver();
	@Given("User enters the username {string}")
	public void userEntersTheUsername(String username) {
		 driver.get("https://practicetestautomation.com/practice-test-login/");
		 driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("User enters the password {string}")
	public void userEntersThePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("User clicks the submit button")
	public void userClicksTheSubmitButton() {
	   driver.findElement(By.id("submit")).click();
	}
	@Then("User should see the dashboard")
	public void userShouldSeeTheDashboard() throws InterruptedException {
	   String text =  driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']")).getText();
	   Assert.assertEquals(text, "Logged In Successfully");
	   
	   if(driver!=null) {
		   Thread.sleep(2000);
		   driver.quit();
	   }
	}
	
	@When("User should not see the dashboard")
	public void userShouldNotSeeTheDashboard() throws InterruptedException {
		 String text =  driver.findElement(By.id("error")).getText();
		 if(text.equals("Your username is invalid!")) {
			 System.out.println("your username is invalid");
		 }else if(text.equals("Your password is invalid!")) {
			 System.out.println("your password is invalid");
		 }
		   
		   if(driver!=null) {
			   Thread.sleep(2000);
			   driver.quit();
		   }
	}
	
}
