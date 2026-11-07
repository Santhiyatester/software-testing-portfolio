package com.automateWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student" + Keys.ENTER);
		driver.findElement(By.id("password")).sendKeys("Password123" + Keys.ENTER);
		driver.findElement(By.id("submit")).click();
		String text = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText();
		if(text.equals("Logged In Successfully")) {
			System.out.println("log in successfully");
		}else {
			System.out.println("doesn't log in");
		}
		System.out.println(text);
		Thread.sleep(15000);
		driver.quit();
		
	}

}
