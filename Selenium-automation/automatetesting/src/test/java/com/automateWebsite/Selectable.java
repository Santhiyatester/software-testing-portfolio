package com.automateWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/selectable/serialize.html");
		List<WebElement> dragrelease = driver.findElements(By.xpath("/html[1]/body[1]/ol[1]/li"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(dragrelease.get(0)).click(dragrelease.get(1)).click(dragrelease.get(5));
		Thread.sleep(5000);
		action.clickAndHold(dragrelease.get(0)).moveToElement(dragrelease.get(4)).release(dragrelease.get(4)).build().perform();

	}

}
