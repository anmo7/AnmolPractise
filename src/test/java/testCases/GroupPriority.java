package testCases;

import org.testng.annotations.Test;

public class GroupPriority {
	
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = {"sanity"})
	public void anmol() {
		System.out.println("anmol");
	}
	
	@Test(groups = {"smoke","regression"})
	public void ball() {
		System.out.println("ball");
	}
	
	@Test(groups = {"sanity","system"})
	public void cat() {
		System.out.println("cat");
	
	}

}
