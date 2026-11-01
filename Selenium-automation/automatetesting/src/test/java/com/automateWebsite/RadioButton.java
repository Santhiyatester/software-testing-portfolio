package com.automateWebsite;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		List<WebElement> columns = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td"));
		for(WebElement col : columns) {
//			WebElement div = col.findElement(By.tagName("div"));
			WebElement label = col.findElement(By.tagName("label"));
			Thread.sleep(1000);
			if(label.getText().equals("Firefox")) {
				label.click();
				break;
			}
		}
		
		List <WebElement> tcolumns = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td"));
		for(int i=0; i<tcolumns.size(); i++ ) {
			WebElement div = tcolumns.get(i).findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td["+(i+1)+"]/div[1]/div[2]"));
			WebElement label = tcolumns.get(i).findElement(By.tagName("label"));
			@Nullable
			String classtext = div.getAttribute("class");
			if(classtext.contains("active")) {
				System.out.println("this button is active : " + label.getText());
			}
		}
		
		List<WebElement> divs = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div"));
		for(int i=0; i<divs.size(); i++) {
			WebElement subdivs = divs.get(i).findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div["+(i+1)+"]/div[1]/div[2]"));
			WebElement label = divs.get(i).findElement(By.tagName("label"));
			String classtext = subdivs.getAttribute("class");
			if(classtext.contains("active")) {
				continue;
			}
			else {
				System.out.println("unselected : " + label.getText());
			}
		}
		
	}

}
