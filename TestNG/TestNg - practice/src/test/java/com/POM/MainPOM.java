package com.POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.datadriven.DataDrivenPOI;

public class MainPOM {
	@DataProvider(name = "arraydata")
	public String[][] getdata() throws IOException{
		return new DataDrivenPOI().getdata();
	}
	
	@Test(dataProvider = "arraydata")
	public void login(String username,String password) throws InterruptedException {
		Login login = new Login();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		PageFactory.initElements(driver, Login.class);  //pom
		
		login.username.sendKeys(username);
		login.password.sendKeys(password);
		login.submit.click();
		
		Thread.sleep(15000);
		driver.quit();
	}
}
