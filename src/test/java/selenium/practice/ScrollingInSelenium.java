package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollingInSelenium {
	static WebDriver dr;
	public static void main(String[] args) throws InterruptedException {
		
		NonSelectDropdown2 se= new NonSelectDropdown2();
		dr = se.getDriver();
		
		dr.get("http://omayo.blogspot.com/");
		
		//dr.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)dr;
		
		//scroll vertically down
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0, 1000)","");
		Thread.sleep(2000);
		
		//scroll vertically up
		js.executeScript("window.scrollBy(0, -500)","");
		Thread.sleep(2000);
		
		//scroll horizontally right
		js.executeScript("window.scrollBy(100, 0)","");
		Thread.sleep(2000);
		
		//scroll horizontally left
		js.executeScript("window.scrollBy(-100, 0)","");
		Thread.sleep(2000);
		
		//scroll into view
		WebElement link = dr.findElement(By.xpath("//a[text()='Blogger']"));
		js.executeScript("arguments[0].scrollIntoView(true)",link);
		Thread.sleep(2500);
		
		//click using JS
		js.executeScript("arguments[0].click()",link);
		
		

	}

}
