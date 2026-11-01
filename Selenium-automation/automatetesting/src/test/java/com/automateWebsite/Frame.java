package com.automateWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		String insidetext = button1.getText();
		System.out.println(insidetext);
		
		driver.switchTo().defaultContent();
		
		List<WebElement>frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		
		WebElement button = driver.findElement(By.id("Click"));
		button.click();
		String insidetextbtn = button.getText();
		System.out.println(insidetextbtn);
		

	}

}
