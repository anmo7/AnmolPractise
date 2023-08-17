package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownComingSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		
		WebElement multipleselection= dr.findElement(By.xpath("//select[@id = 'multiselect1']"));

		Select dropDownSelection = new Select(multipleselection);
		
		System.out.println(dropDownSelection.isMultiple());
		
		List<WebElement> options = dropDownSelection.getOptions();
		
		for(WebElement opt : options)
		{
			System.out.println(opt.getText());
		}
		
		dropDownSelection.selectByIndex(0);
		dropDownSelection.selectByValue("Hyundaix");
		dropDownSelection.selectByVisibleText("Audi");
		
		Thread.sleep(2500);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(dropDownSelection.getFirstSelectedOption().getText());
		
		dropDownSelection.deselectAll();
		
		Thread.sleep(2500);
		
		dropDownSelection.selectByIndex(0);
		dropDownSelection.selectByValue("Hyundaix");
		dropDownSelection.selectByVisibleText("Audi");
		
		Thread.sleep(2500);
		
		dropDownSelection.deselectByIndex(0);
		dropDownSelection.deselectByValue("Hyundaix");
		dropDownSelection.deselectByVisibleText("Audi");
		
		
	
	}

}
