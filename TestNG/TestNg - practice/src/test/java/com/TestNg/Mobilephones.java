package com.TestNg;

import org.testng.annotations.Test;

public class Mobilephones {
	@Test(groups = {"apple"})
	public void apple() {
		System.out.println("apple");
	}
	@Test(groups = {"apple"})
	public void apple1() {
		System.out.println("apple");
	}
	@Test(groups = {"oppo"})
	public void oppo() {
		System.out.println("oppo");
	}
	@Test(groups = {"oppo"})
	public void oppo1() {
		System.out.println("oppo");
	}
	@Test(groups = {"sam"})
	public void samsung() {
		System.out.println("samsung");
	}
	@Test(groups = {"sam"})
	public void samsung1() {
		System.out.println("samsung");
	}
}
