package omayoblog.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	WebElement multiSelectDropDown;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getmultiSelectDropDownlocator() {
		multiSelectDropDown = driver.findElement(By.xpath("//select [@id = 'multiselect1']"));

		return multiSelectDropDown;
	}

	public void clickOnThisBlogIsCreated() {
		try {
			driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		} catch (NoSuchElementException e) {
			System.out.println("Blog created Locator is not avaliable");
		}
	}
}
