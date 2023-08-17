package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Utility;

public class Parallelexecution {

	WebDriver dr;

	@BeforeMethod

	public void webstarter() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		dr = new ChromeDriver();
		dr.get(Utility.getProperty("url3"));
		//dr.manage().window().maximize();
	}

	@Test

	public void LoginVerifcationwithDifferentUsers() throws InterruptedException {

		dr.findElement(By.xpath("//input[@name = 'userName']")).sendKeys("user1");
		dr.findElement(By.xpath("//input[@name = 'password']")).sendKeys("password1");
		dr.findElement(By.xpath("//input[@name = 'submit']")).click();

		WebElement loginSuccessfully = dr.findElement(By.xpath("//h3[text()= 'Login Successfully']"));

		assertEquals(loginSuccessfully.getText(), "Login Successfully", "User not Login Successfully");
		Thread.sleep(2000);

	}

	@Test

	public void Pagetitle() {

		assertEquals(dr.getTitle(), "Welcome: Mercury Tours");
	}

	@Test

	public void CurrentUrl() {

		assertEquals(dr.getCurrentUrl(), "https://demo.guru99.com/test/newtours/index.php");
	}

	@AfterMethod

	public void closewebbrowser() {
		dr.close();
	}
}
