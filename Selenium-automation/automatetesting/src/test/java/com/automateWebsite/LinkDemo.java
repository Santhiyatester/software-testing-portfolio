package com.automateWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01dm97q8v3wescbdchcbven6d42212603.node0");
		WebElement godashboard = driver.findElement(By.xpath("//div[@class='grid ui-fluid']//div[1]//div[1]//div[1]//div[1]//a[1]"));
		godashboard.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		
		String href = driver.findElement(By.xpath("//a[normalize-space()='Find the URL without clicking me.']")).getAttribute("href");
		System.out.println(href);
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Broken?']"));
		element.click();
		String broken = driver.getTitle();
		System.out.println(broken);
		if(broken.contains("404")) {
			System.out.println("it is broken");
		}else {
			System.out.println("it is not broken");
		}
		driver.navigate().back();
		
		//count link in this page
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//count link in this layout
		List<WebElement> elements = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[3]")).findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		
		
		

	}

}
