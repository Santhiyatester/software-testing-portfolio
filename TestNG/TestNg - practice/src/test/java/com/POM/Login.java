package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	@FindBy(how = How.ID,using="username" )
	public static WebElement username;
	@FindBy(id="password")             // convert method to variable
	public static WebElement password;
	@FindBy(id="submit")
	public static WebElement submit;
//	public WebElement username(WebDriver driver) {
//		return driver.findElement(By.id("username"));
//	}
//	public WebElement password(WebDriver driver) {
//		return driver.findElement(By.id("password"));
//	}
//	public WebElement submit(WebDriver driver) {
//		return driver.findElement(By.id("submit"));
//	}
}
