package testCases;

import org.testng.annotations.Test;

public class TestngPriority {
	
	@Test(priority=2)
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=3)
	public void anmol() {
		System.out.println("anmol");
	}
	
	@Test(priority=4)
	public void ball() {
		System.out.println("ball");
	}
	
	@Test(priority=1)
	public void dog() {
		System.out.println("dog");
	}
}
