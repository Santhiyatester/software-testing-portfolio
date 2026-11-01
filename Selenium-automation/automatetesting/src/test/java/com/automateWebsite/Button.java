package com.automateWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement click = driver.findElement(By.id("j_idt88:j_idt90"));
		click.click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		driver.navigate().back();
		
		//method 1
		WebElement disablebutton = driver.findElement(By.id("j_idt88:j_idt92"));
		if(disablebutton.isEnabled()) {
			System.out.println("the button is enabled");
		}else {
			System.out.println("the button is not enable");
		}
		//method 2
		WebElement disablebutton2 = driver.findElement(By.id("j_idt88:j_idt92"));
		String checkdisable = disablebutton2.getAttribute("class");
		if(checkdisable.contains("disable")) {
			System.out.println("the button is disable");
		}else {
			System.out.println("the button is enable");
		}
		
		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
		Point location = position.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		Thread.sleep(1000);
		WebElement style = driver.findElement(By.id("j_idt88:j_idt96"));
		String css = style.getCssValue("background-color");
		System.out.println(css);
		
		WebElement hightwidth = driver.findElement(By.id("j_idt88:j_idt98"));
		String height = hightwidth.getCssValue("height");
		String width = hightwidth.getCssValue("width");
		System.out.println("height : " + height + " width :" + width);
		//another method 
		Dimension dimension= hightwidth.getSize();
		System.out.println("height :" + dimension.height + " width : " + dimension.width);
		
		WebElement hovercolorcheck = driver.findElement(By.id("j_idt88:j_idt100"));
		String beforebgcolor = hovercolorcheck.getCssValue("background-color");
		System.out.println("before hover " + beforebgcolor);
		Actions action = new Actions(driver);
		action.moveToElement(hovercolorcheck).build().perform();
		Thread.sleep(2000);
		WebElement afterhovercolorcheck = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']//span[@class='ui-button-text ui-c'][normalize-space()='Success']"));
		String afterbgcolor = afterhovercolorcheck.getCssValue("background-color");
		System.out.println("after hover " + afterbgcolor);
		if(!beforebgcolor.equals(afterbgcolor)) {
			System.out.println("colors are changed");
		}else {
			System.out.println("colors are not changed");
		}
		
		WebElement clickbutton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		clickbutton.click();
		Thread.sleep(1000);
		WebElement clickhide = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']//span[@class='ui-button-text ui-c'][normalize-space()='Success']"));
		clickhide.click();
		
		List<WebElement> buttons = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[4]/button"));
		System.out.println(buttons.size());
	}

}
