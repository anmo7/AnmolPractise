package omayo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BaseTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {
		Utility utililty = new Utility();
		driver = utililty.getDriver();
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}
