package selenium.practice;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		
		//to find web element
		WebElement element = dr.findElement(By.name("userid"));
		element.sendKeys("example");
		Thread.sleep(2000);
		element.clear();
		//dr.close();
		
		//by local strategy 
		WebElement element2 = dr.findElement(By.id("but1"));
		System.out.println(element2.getText());
		
		//by Class name
		//System.out.println(dr.findElement(By.className("post - title entry - title")).getText());
	
		//link text
		//dr.findElement(By.linkText("Posts (Atom)")).click();

		//by partial link text
		dr.findElement(By.partialLinkText("(Atom)")).click();
	
		//by tag name 
		List<WebElement> link = dr.findElements(By.tagName("a"));
		
		System.out.println("Numbaer of link on page = " +link.size());
	}
}

