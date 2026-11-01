package com.automateWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		String countries[] = {"Japan","Italy","Spain","India","United Kingdom"};
		List <WebElement> rows = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr"));
		for(String country : countries) {
			for(int i =0; i<rows.size(); i++) {
				WebElement column = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+(i+1)+"]/td[2]/span[3]"));
				String coltext = column.getText();
				if(coltext.equals(country)) {
					WebElement col1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+(i+1)+"]/td[1]"));
//					String col1name = col1.findElement(By.tagName("span")).getText();
//					System.out.println(col1name);
					System.out.println(country + ":" + col1.getText());
				}
			}
		};

	}

}
