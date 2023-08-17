package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://omayo.blogspot.com/");
		
		WebElement maleradio = dr.findElement(By.xpath("//input[@id = 'radio1']"));
		maleradio.click();
		WebElement femaleradio = dr.findElement(By.xpath("//input[@id = 'radio2']"));
		
		System.out.println("male radio is selected =" +maleradio.isSelected());
		System.out.println("female radio is selected =" +femaleradio.isSelected());
		//System.out.println(maleradio.isDisplayed());
		System.out.println("female radio is Displayed =" +femaleradio.isDisplayed());
		
		WebElement colourCheckBox1 = dr.findElement(By.xpath("//input[@id = 'checkbox1' and @value ='orange']"));
		System.out.println("orange colour checkbox is selected =" +colourCheckBox1.isSelected());
		WebElement colourCheckBox2 = dr.findElement(By.xpath("//input[@id = 'checkbox2' and @value ='blue']"));
		System.out.println("blue colour checkbox is selected =" +colourCheckBox2.isSelected());
		System.out.println("blue colour checkbox is Displayed =" +colourCheckBox2.isDisplayed());
		
		System.out.println("Button 1 is =" +dr.findElement(By.xpath("//button[@id = 'but1']")).isEnabled());
		System.out.println("Button 2 is =" +dr.findElement(By.xpath("//button[@id = 'but2']")).isEnabled());
	}

}
