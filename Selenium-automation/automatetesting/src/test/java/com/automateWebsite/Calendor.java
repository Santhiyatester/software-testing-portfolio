package com.automateWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		
		List<WebElement> rows = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		for(int i=0; i<rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(int j=0; j<cols.size()-1; j++) {
				WebElement a = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+(i+1)+"]/td["+(j+1)+"]/div[1]/div[1]/a[1]"));
				String number = a.getText();
				if(number.equals("9")) {
					System.out.println(number);
					cols.get(j).click();
				}
			}
		}
		
		WebElement title = driver.findElement(By.id("j_idt87:title"));
		title.sendKeys("lalalisa");
		WebElement startdate = driver.findElement(By.id("j_idt87:from_input"));
		startdate.click();
		for(int i=1;i<=10;i++) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[2]/div[1]/a[1]")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		WebElement enddate = driver.findElement(By.id("j_idt87:to_input"));
		enddate.click();
		for(int j=1;j<=0;j++) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[2]/div[1]/a[1]")).click();
		}
		for(int z=1;z<=30;z++) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[2]/div[3]/a[1]")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[1]/ul[1]/li[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("j_idt87:addButton")).click();
		
	}

}
