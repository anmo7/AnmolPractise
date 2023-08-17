package selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingSynchronizationInSelenium2 {
	static WebDriver dr;

	public static void main(String[] args) {

		HandlingSynchronizationInSelenium2 se = new HandlingSynchronizationInSelenium2();
		se.clickmrOptionsButtton();
	}

	public void clickmrOptionsButtton() {
		NonSelectDropdown2 de = new NonSelectDropdown2();
		dr = de.getDriver();

		dr.get("http://omayo.blogspot.com/");

		dr.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) dr;

		WebElement Checkthis = dr.findElement(By.xpath("//button[text()='Check this']"));
		js.executeScript("arguments[0].scrollIntoView(true)", Checkthis);

		Checkthis.click();

		WebElement mrOption = dr.findElement(By.xpath("//input[@id=\"dte\"]"));
		// explicit wait
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(11));
		wait.until(ExpectedConditions.elementToBeClickable(mrOption));

		mrOption.click();

		dr.findElement(By.xpath("//button[@class='dropbtn']")).click();
		WebElement gmaillink = dr.findElement(By.xpath("//a[text()='Gmail']"));
		//wait.until(ExpectedConditions.elementToBeClickable(gmaillink));
		wait.until(ExpectedConditions.visibilityOf(gmaillink));
		gmaillink.click();
		

		//js.executeScript("arguments[0].click();", gmaillink);
		

	}

}