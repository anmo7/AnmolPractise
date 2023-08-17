package selenium.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoHandleMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		
		dr.findElement(By.xpath("//a[@id='selenium143']")).click();
		
		String currentWindowhandle = dr.getWindowHandle();
		
		Set<String> allwindows = dr.getWindowHandles();
		
		for(String handle: allwindows)
		{
			if(!(handle.equals(currentWindowhandle)))
			{
				dr.switchTo().window(handle);
			}
		}
		
		System.out.println(dr.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());
		
		dr.switchTo().newWindow(currentWindowhandle);
		dr.findElement(By.cssSelector("input#radio1")).click();

}
}