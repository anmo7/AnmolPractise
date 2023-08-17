package selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class HandlingSynchronizationInJava3 {
	static WebDriver dr;

	public static void main(String[] args) {

		HandlingSynchronizationInJava3 jv = new HandlingSynchronizationInJava3();
		jv.clickbutton();
	}

	public void clickbutton() {
		NonSelectDropdown2 de = new NonSelectDropdown2();
		dr = de.getDriver();

		dr.get("http://omayo.blogspot.com/");

		dr.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) dr;

		WebElement Checkthisbutton = dr.findElement(By.xpath("//button[text()='Check this']"));
		Checkthisbutton.click();

		WebElement mroptionbutton = dr.findElement(By.xpath("//input[@id='dte']"));

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(dr);
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(TimeoutException.class);
		wait.withTimeout(Duration.ofSeconds(11));
		wait.until(ExpectedConditions.elementToBeClickable(mroptionbutton));

		mroptionbutton.click();

	}
}
