package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassInSelenium {
	static WebDriver dr;

	public static void main(String[] args) {
		ActionClassInSelenium a = new ActionClassInSelenium();
		a.actionClass();

	}

	public void actionClass() {

		NonSelectDropdown2 se = new NonSelectDropdown2();

		dr = se.getDriver();

		dr.get("http://omayo.blogspot.com/");

		dr.manage().window().maximize();

		Actions actions = new Actions(dr);

		WebElement blogs = dr.findElement(By.xpath("//span[@id='blogsmenu']"));

		// actions.moveToElement(blogs).build().perform();

		WebElement textArea = dr.findElement(By.xpath("//textarea[@id='ta1']"));
		actions.keyDown(textArea,Keys.SHIFT).keyDown("a").keyUp("a").keyUp(Keys.SHIFT).build().perform();

		// actions.keyUp(textArea, "a").build().perform();

		actions.contextClick(textArea).build().perform();

	}

}
