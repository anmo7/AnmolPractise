package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");

		WebElement multiselect = dr.findElement(By.xpath("//select[@id='multiselect1']"));

		Select dropdown = new Select(multiselect);

		System.out.println(dropdown.isMultiple());

		List<WebElement> option = dropdown.getOptions();

		for (WebElement opt : option) {
			System.out.println(opt.getText());
		}

		dropdown.selectByIndex(0);
		dropdown.selectByValue("swiftx");
		dropdown.selectByVisibleText("Audi");

		System.out.println("########################");

		List<WebElement> allSelectedOptions = dropdown.getAllSelectedOptions();

		for (WebElement a : allSelectedOptions) {
			System.out.println(a.getText());
		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		Thread.sleep(2500);
		dropdown.deselectByIndex(0);
		dropdown.deselectByValue("swiftx");
		dropdown.deselectByVisibleText("Audi");

		Thread.sleep(2500);
		dropdown.selectByIndex(0);
		dropdown.selectByValue("swiftx");
		dropdown.selectByVisibleText("Audi");

		Thread.sleep(2500);
		dropdown.deselectAll();

		Thread.sleep(3000);
		dr.close();
	}

}
