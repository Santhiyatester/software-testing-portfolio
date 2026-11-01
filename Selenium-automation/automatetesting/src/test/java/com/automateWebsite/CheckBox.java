package com.automateWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		Thread.sleep(1000);
		WebElement basiccheckbox = driver.findElement(By.id("j_idt87:j_idt89"));
		basiccheckbox.click();
		
		WebElement notify = driver.findElement(By.id("j_idt87:j_idt91"));
		notify.click();
		
		
		String langs[] = {"Java","Python","Javascript"};
		List<WebElement> columns = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td"));
		for(String lang : langs) {
		for(int i=0;i<columns.size(); i++) {
			WebElement div = columns.get(i).findElement(By.tagName("div"));
			WebElement label = columns.get(i).findElement(By.tagName("label"));
			String language = label.getText();
			if(language.equals(lang)) {
				div.click();
				System.out.println(lang);
				break;	
				
				}
			}
		}	
		
		for(int i=0; i<3; i++) {
			WebElement tristate = driver.findElement(By.id("j_idt87:ajaxTriState"));
			tristate.click();
			Thread.sleep(1000);
			String notify1 = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/p[1]")).getText();
			System.out.println(notify1);
		}
		
		WebElement toggle = driver.findElement(By.id("j_idt87:j_idt100"));
		String classtext = toggle.getAttribute("class");
		if(classtext.contains("checked")) {
			System.out.println("toggles switch is on");
		}else {
			System.out.println("toggle off");
		}
		toggle.click();
		Thread.sleep(1000);
		String afterclasstext = toggle.getAttribute("class");
		if(afterclasstext.contains("checked")) {
			System.out.println("toggles switch is on");
		}else {
			System.out.println("off");
		}
		
		WebElement disable = driver.findElement(By.id("j_idt87:j_idt102_input"));
		String text = disable.getAttribute("disabled");
		System.out.println(text);
		if(!disable.isEnabled()) {
			System.out.println("check box is disable");
		}else {
			System.out.println("checkbox is enable");
		}
		

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[3]/div[1]/ul[1]")).click();
		String countries[] = {"Miami","London", "Paris"};
		List<WebElement> lists = driver.findElements(By.xpath("/html[1]/body[1]/div[7]/div[2]/ul[1]/li"));
		for(String country : countries) {
			for(WebElement list : lists) {
				WebElement div = list.findElement(By.tagName("div"));
				WebElement label = list.findElement(By.tagName("label"));
				String labeltext = label.getText();
				if(labeltext.equals(country)) {
					div.click();
					System.out.println(labeltext);
					break;
				}
				
				
			}
		}
		
	}

}
