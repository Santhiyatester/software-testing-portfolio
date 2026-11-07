package com.TestNg;

import org.testng.annotations.Test;

public class TestNg {
	
	@Test(priority = 1)
	public void startTheCar() {
		System.out.println("Start the car");
	}
	
	@Test(priority = 2)
	public void firstgear() {
		System.out.println("First Gear");
	}
	
	@Test(priority = 3,enabled = false)
	public void secondgear() {
		System.out.println("Second Gear");
	}
	
	@Test(priority = 4)
	public void thirdgear() {
		System.out.println("Third Gear");
	}
	
	@Test(priority = 5)
	public void fourthgear() {
		System.out.println("Fourth Gear");
	}
	
	@Test(priority = 6)
	public void stopTheCar() {
		System.out.println("Stop the Car");
	}
}
