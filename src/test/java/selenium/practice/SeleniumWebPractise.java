package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebPractise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		dr.manage().window().maximize();
		
		WebElement male= dr.findElement(By.cssSelector("input[value*=male]"));
		male.click();
		Thread.sleep(5000);
		WebElement female = dr.findElement(By.cssSelector("input[value*=female]"));
		female.click();
		Thread.sleep(5000);
		dr.close();
		
	}

}
