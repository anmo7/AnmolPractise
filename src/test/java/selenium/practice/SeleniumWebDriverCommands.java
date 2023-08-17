package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		dr.manage().window().maximize();
		
		WebElement malebutton= dr.findElement(By.xpath("//input[@id='radio1']"));
		malebutton.click();
		
		Thread.sleep(5000);
		
		//WebElement female button = dr.findElement(By.xpath("//input[@value='female']"));
		WebElement femalebutton = dr.findElement(By.id("radio2"));
		femalebutton.click();

	}

}
