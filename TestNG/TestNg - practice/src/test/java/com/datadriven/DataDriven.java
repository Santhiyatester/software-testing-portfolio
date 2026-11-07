package com.datadriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	String data[][] = {
			{"student", "Password123"}, //both correct
			{"student","password123"}, //username correct
			{"Student","Password123"}, //password correct
			{"Student","password123"} //both incorrect
	};
	@DataProvider(name = "arraydata")
	public String[][] getdata() throws IOException{
		return data;

	}
	
	@Test(dataProvider = "arraydata")
	public void login(String username,String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(5000);
		
	}
}
