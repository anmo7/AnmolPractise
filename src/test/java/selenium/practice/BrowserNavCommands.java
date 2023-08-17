package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		dr.manage().window().maximize();
		dr.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(5000);
		dr.navigate().back();//omayo blogspot
		Thread.sleep(5000);
		dr.navigate().forward();//make my trip
		dr.navigate().refresh();
		Thread.sleep(5000);
		//dr.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com");
		dr.close();
		//dr.quit();          

	}

}
