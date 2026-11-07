package com.automateWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement button1 = driver.findElement(By.id("j_idt88:j_idt91"));
		button1.click();
		driver.switchTo().alert().accept();
		WebElement span = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]"));
		System.out.println(span.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement button2 = driver.findElement(By.id("j_idt88:j_idt93"));
		button2.click();
		driver.switchTo().alert().accept();
		WebElement alertmsg = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[2]/span[1]"));
		System.out.println(alertmsg.getText());
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		button2 = driver.findElement(By.id("j_idt88:j_idt93"));
		button2.click();
		driver.switchTo().alert().dismiss();
		WebElement alertmsg2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[2]/span[1]"));
		System.out.println(alertmsg.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement button3 = driver.findElement(By.id("j_idt88:j_idt95"));
		button3.click();
		WebElement notifymsg = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/p[1]"));
		System.out.println(notifymsg.getText());
		WebElement dismiss = driver.findElement(By.id("j_idt88:j_idt98"));
		dismiss.click();
		
		driver.switchTo().defaultContent();
		
		WebElement button4 = driver.findElement(By.id("j_idt88:j_idt100"));
		button4.click();
		Thread.sleep(1000);
		WebElement notify = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/p[1]"));
		System.out.println(notify.getText());
		WebElement cancel = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/a[1]"));
		cancel.click();
		
		driver.switchTo().defaultContent();
		
		WebElement button5 = driver.findElement(By.id("j_idt88:j_idt104"));
		button5.click();
		driver.switchTo().alert().sendKeys("lisa" + Keys.ENTER);
		driver.switchTo().alert().accept();
		WebElement label = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[1]/span[1]"));
		System.out.println(label.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement button6 = driver.findElement(By.id("j_idt88:j_idt106"));
		button6.click();
		WebElement yes = driver.findElement(By.id("j_idt88:j_idt108"));
		yes.click();
		WebElement no = driver.findElement(By.id("j_idt88:j_idt109"));
		no.click();
		
		driver.switchTo().defaultContent();
		

	}

}
