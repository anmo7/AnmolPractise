package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTestPlan() {
		System.out.println("Before Plan");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@org.testng.annotations.Test
	public void Test() {
		System.out.println("Test");
	}
	
	@org.testng.annotations.Test
	public void Test1() {
		System.out.println("Test_1");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Class");
	}

}
