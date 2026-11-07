package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenBrowser {
	long starttime;
	long endtime;
	long totalduration;
	WebDriver driver = new ChromeDriver();
	@BeforeSuite
	public void beforeSuit() {
		starttime = System.currentTimeMillis();
	}
	@Test
	public void google() {
		driver.get("https://google.co.in/");
		System.out.println("opengoogle");
	}
	
	@Test
	public void bing() {
		driver.get("http://bing.com/");
		System.out.println("openbing");
	}
	
	@Test
	public void yahoo() {
		driver.get("https://yahoo.com/");
		System.out.println("openyahoo");
	}
	
	@AfterSuite
	public void aftersuit() {
		endtime = System.currentTimeMillis();
		driver.quit();
		endtime = System.currentTimeMillis();
		totalduration = endtime - starttime;
		System.out.println("total duration is: " + totalduration);
	}
}
