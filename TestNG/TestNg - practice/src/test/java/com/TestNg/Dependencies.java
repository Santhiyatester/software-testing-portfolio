package com.TestNg;

import org.testng.annotations.Test;

public class Dependencies {
	@Test
	public void sslcstandard() {
		System.out.println("10th standard");
	}
	
	@Test(dependsOnMethods = "sslcstandard")
	public void highersecondary() {
		System.out.println("10th standard");
	}
	
	@Test(dependsOnMethods = "highersecondary" )
	public void college() {
		System.out.println("10th standard");
	}
}
