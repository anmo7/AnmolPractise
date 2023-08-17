package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		dr.manage().window().maximize();

		List<WebElement> buttonList = dr.findElements(By.tagName("button"));
		System.out.println("The no. of button in the page = " +buttonList.size());
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getPageSource());
		System.out.println(dr.getTitle());		
	}
}
