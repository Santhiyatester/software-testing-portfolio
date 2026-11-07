package com.automateWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		
		String firstname = driver.findElement(By.id("firstname")).getAttribute("title");
		String lastname = driver.findElement(By.id("lastname")).getAttribute("title");
		String address = driver.findElement(By.id("address")).getAttribute("title");
		System.out.println(firstname + "\n" + lastname + "\n" + address);
		
	}

}
