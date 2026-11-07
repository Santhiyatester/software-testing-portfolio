package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OpenWebsite {
	@Test
	@Parameters({"username", "password"})
	public void openwebsite(String username,String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		String text = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText();
//		if(text.equals("Logged In Successfully")) {
//			System.out.println("log in successfully");
//		}else {
//			System.out.println("doesn't log in");
//		}
		
		Assert.assertEquals(text, "Logged In Successfully");
		Assert.assertNotEquals(text, "Logged Successfully");
		System.out.println(text);
		Thread.sleep(15000);
		driver.quit();
	}
}
