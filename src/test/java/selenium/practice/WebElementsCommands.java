package selenium.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		//dr.manage().window().maximize();
		WebElement searchtextbox= dr.findElement(By.xpath("//input [@title = 'search' and @name ='q']"));
		searchtextbox.sendKeys("mobile");
		Thread.sleep(5000);
		searchtextbox.clear();
		
		System.out.println(searchtextbox.getAttribute("class"));
		System.out.println(searchtextbox.isDisplayed());
		System.out.println(dr.findElement(By.cssSelector("div#BlogSearch1")).isDisplayed());
		
		System.out.println(searchtextbox.getAccessibleName());
		System.out.println(searchtextbox.getAriaRole());
		
		System.out.println(dr.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color"));
		System.out.println(dr.findElement(By.cssSelector("button.dropbtn")).getCssValue("border"));
		
		Point p = searchtextbox.getLocation();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		File file = searchtextbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src/test/resources/Screenshot/textboxscreenshot.png"));
		
		System.out.println(searchtextbox.getTagName());
		
		System.out.println(dr.findElement(By.xpath("//button[@id='but2']")).getText());
		System.out.println(dr.findElement(By.xpath("//span[@id='home']")).getText());
		
		Dimension d = searchtextbox.getSize();
		System.out.println(d.height);
		System.out.println(d.width);
	}

}
