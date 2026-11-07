package com.automateWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
//		element.click();
		Select choose = new Select(element);
//		choose.selectByIndex(1);
		choose.selectByVisibleText("Selenium");
		
		WebElement choosecountry = driver.findElement(By.id("j_idt87:country_label"));
		choosecountry.click();
		List<WebElement> countries = driver.findElements(By.xpath("/html[1]/body[1]/div[5]/div[1]/ul[1]/li"));
		for(WebElement country : countries) {
			if(country.getText().equals("India")) {
				country.click();
				break;
			}
		}
		Thread.sleep(1000);
		WebElement input = driver.findElement(By.id("j_idt87:city_label"));
		input.click();
		List<WebElement> cities = driver.findElements(By.xpath("/html[1]/body[1]/div[8]/div[1]/ul[1]/li"));
		for(WebElement city : cities) {
			if(city.getText().equals("Bengaluru")) {
				city.click();
				break;
			}
		}
		
		WebElement autoCompleteElement = driver.findElement(By.id("j_idt87:auto-complete_input"));
		autoCompleteElement.click();
		String lang[] = {"Selenium WebDriver", "Playwright", "PostMan"};
		
		
		for(int i=0; i<lang.length; i++) {
			autoCompleteElement.sendKeys(lang[i]);
			Thread.sleep(1000);
			List<WebElement>courses = driver.findElements(By.xpath("/html[1]/body[1]/span[1]/ul[1]/li"));
			for(WebElement course : courses) {
				if(course.getText().equals(lang[i])) {
					course.click();
				}
			}
		}
	}

}
