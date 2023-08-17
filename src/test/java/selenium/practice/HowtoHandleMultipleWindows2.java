package selenium.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoHandleMultipleWindows2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");

		dr.findElement(By.xpath("//a[@id='selenium143']")).click();
		
		String currentTab= dr.getWindowHandle();
		
		Set<String> allTabs= dr.getWindowHandles();
		
		for(String a: allTabs)
		{
			if(a.equals(currentTab))
			{
				continue;
			}
			else 
				dr.switchTo().window(a);
		}
		
		System.out.println(dr.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());

		dr.switchTo().window(currentTab);
		dr.findElement(By.cssSelector("input#checkbox2")).click();
	}

}
