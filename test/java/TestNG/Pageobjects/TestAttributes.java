package TestNG.Pageobjects;

import org.testng.annotations.Test;

public  class TestAttributes {
	@Test(priority=2)
	public void test1() {
		System.out.print("Test is executed");
	}
	@Test(priority=3)
	public void test2() {
		System.out.print("Test is executed");
	}
	@Test(priority=1)
	public void test3() {
		System.out.print("Test is executed");
	}
		
	}


