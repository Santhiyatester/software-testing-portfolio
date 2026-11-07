package com.automateWebsite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement download = driver.findElement(By.id("j_idt93:j_idt95"));
		download.click();
		Thread.sleep(1000);
		File file = new File("C:\\Users\\ELCOT\\Downloads");
		File[] files = file.listFiles();
		for(File fi : files) {
			if(fi.getName().equals("TestLeaf Logo.png")) {
				System.out.println("file download successfullt : " + fi.getName());
				break;
			}
		}
		WebElement upload = driver.findElement(By.id("j_idt88:j_idt89"));
		upload.click();
		Thread.sleep(2000);
		String src = "C:\\Users\\ELCOT\\Downloads\\TestLeaf Logo.png";
		StringSelection file1 = new StringSelection(src);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);
		Thread.sleep(2000);
		
		Robot action = new Robot();
		action.keyPress(KeyEvent.VK_CONTROL);
		action.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		action.keyPress(KeyEvent.VK_ENTER);

	}

}
