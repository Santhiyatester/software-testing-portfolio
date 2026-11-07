package com.automateWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
//		WebElement drag = driver.findElement(By.id("form:conpnl"));
		Actions action = new Actions(driver);
//		action.dragAndDropBy(drag, 500, 0).perform();
//		
//		WebElement dragable = driver.findElement(By.id("form:drag"));
//		WebElement drop = driver.findElement(By.id("form:drop"));
//		action.clickAndHold(dragable).dragAndDrop(dragable, drop).build().perform();
//		
//		WebElement dropc = driver.findElement(By.id("form:j_idt94:j_idt95"));
//		WebElement dragc = driver.findElement(By.id("form:j_idt94:j_idt97"));
//		action.dragAndDrop(dragc, dropc).build().perform();
//		
//		WebElement dropr = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]"));
//		WebElement dragr = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]"));
//		action.dragAndDrop(dragr, dropr).build().perform();
//		
//		WebElement start = driver.findElement(By.id("form:j_idt119"));
//		start.click();
//		Thread.sleep(5000);
//		WebElement progress = driver.findElement(By.xpath("//div[@class='ui-progressbar-label']"));
//		System.out.println(progress.getText());
		
//		WebElement div1 = driver.findElement(By.id("form:j_idt125"));
//		WebElement span1  = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[1]"));
//		System.out.println("style" + span1.getAttribute("style"));
//		action.dragAndDropBy(span1, 80, 0).perform();
//		System.out.println("style" + span1.getAttribute("style"));
//		Thread.sleep(1000);
//		WebElement span2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[2]"));
//		System.out.println("style" + span2.getAttribute("style"));
//		action.dragAndDropBy(span2, 100, 0).perform();
//		System.out.println("style" + span2.getAttribute("style"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement span1  = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[1]"));
		System.out.println("style" + span1.getAttribute("style"));
		js.executeScript("arguments[0].style.left='50%';", span1);
//		js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2]);",span1,"style","left :50%;");
		System.out.println("style" + span1.getAttribute("style"));
		
		Thread.sleep(1000);
		
		WebElement span2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[2]"));
		System.out.println("style" + span2.getAttribute("style"));
		js.executeScript("arguments[0].style.left='100%';", span2);
		System.out.println("style" + span2.getAttribute("style"));
		
		//method1
		WebElement img = driver.findElement(By.id("form:logo"));
		js.executeScript("arguments[0].style.width='500px';", img);
		js.executeScript("arguments[0].style.height='250px';", img);
		
		
	}

}
