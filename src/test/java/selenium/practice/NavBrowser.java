package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		dr.manage().window().maximize();
		dr.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		dr.navigate().back();
		Thread.sleep(5000);
		dr.navigate().forward();
		Thread.sleep(5000);
		dr.close();
		
	}

}
