package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonSelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.airvistara.com/in/en");

		dr.findElement(By.xpath("//img [contains(@src,'dropdown')]")).click();
		List<WebElement> countries = dr.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));
		
		for(WebElement country: countries)
		{
			if(country.getText().equalsIgnoreCase("Qatar")){
			   country.click();
			}
		}
	}

}
