package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Utility;

public class DataDriven {
	WebDriver dr;

	@BeforeMethod
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		dr = new ChromeDriver();
		dr.get(Utility.getProperty("url3"));
		dr.manage().window().maximize();
	}

	@Test(dataProvider = "usrData")

	public void validLoginwithDifferentUsers(String name, String pass) {

		dr.findElement(By.xpath("//input[@name = 'userName']")).sendKeys(name);
		dr.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pass);
		dr.findElement(By.xpath("//input[@name = 'submit']")).click();

		WebElement loginSuccessfully = dr.findElement(By.xpath("//h3[text()= 'Login Successfully']"));

		assertEquals(loginSuccessfully.getText(), "Login Successfully", "User not Login Successfully");

	}

	@DataProvider(name = "usrData")
	public String[][] userDatabase() {
		String username[][] = { { "user1", "password1" }, { "user2", "password2" }, { "user3", "password3" } };

		return username;
	}

	@AfterMethod

	public void closebrowser() {
		dr.close();
	}
}
