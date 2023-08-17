package selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");

		dr.findElement(By.xpath("//input[@id = 'prompt' ]")).click();
		
		Alert alt = dr.switchTo().alert();
		
		System.out.println(alt.getText());
		
		Thread.sleep(5000);
		
		//alt.accept();
		
		alt.dismiss();

	}

}
