package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoHandleFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@id='navbar-iframe']")));
		
		System.out.println(dr.findElement(By.xpath("//a[@id = 'b-getorpost']")).getText());

		dr.switchTo().defaultContent();
		
		//dr.findElement(By.cssSelector("input#checkbox2")).click();
	
		dr.findElement(By.cssSelector("input#radio1")).click();
		
	}

}
