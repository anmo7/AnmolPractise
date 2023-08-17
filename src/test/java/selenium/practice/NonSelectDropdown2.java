package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonSelectDropdown2 {

	public static void main(String[] args) {
		NonSelectDropdown2 sel = new NonSelectDropdown2();
		sel.selectCountryFromDropDown("Thailand");
	}
	
	public WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		return dr;
	}
	
	public void selectCountryFromDropDown(String Country)
	{
		WebDriver dr = getDriver();
		dr.get("https://www.airvistara.com/in/en");
		
		dr.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
		
		List<WebElement> countries = dr.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));
		for(WebElement coun: countries)
		{
			if(coun.getText().equalsIgnoreCase(Country)) {
				coun.click();
			}
		}
	}
}
