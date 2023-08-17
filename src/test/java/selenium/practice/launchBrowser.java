package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver" ,"src/test/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			//driver.close();
		}

	}


