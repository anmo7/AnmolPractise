package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		
		WebElement singleSelect = dr.findElement(By.xpath("//select[@id = 'drop1']"));
		Select singleSelectDropDown = new Select(singleSelect);
		
		List<WebElement> a = singleSelectDropDown.getOptions();
		
		for(WebElement b: a)
		{
			System.out.println(b.getText());
		}
		
		System.out.println(singleSelectDropDown.isMultiple());
		
		//singleSelectDropDown.selectByIndex(1);
		
		// singleSelectDropDown.selectByValue("jkl");
		singleSelectDropDown.selectByVisibleText("doc 2");
		
		System.out.println(singleSelectDropDown.getFirstSelectedOption().getText());
		
		//dr.close();
		

	}

}
