package selenium.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Utility;

public class UploadFileInSelenium {
	static WebDriver dr;

	public static void main(String[] args) throws IOException {
		UploadFileInSelenium a = new UploadFileInSelenium();
		a.fileupload();
	}
		public void fileupload() throws IOException
		{
			NonSelectDropdown2 se = new NonSelectDropdown2();
			
			dr = se.getDriver();
			dr.get(Utility.getProperty("Url"));
			dr.manage().window().maximize();
			
			WebElement uploadfile = dr.findElement(By.xpath("//input[@id = 'uploadfile']"));
			uploadfile.sendKeys("D:\\User data.xlsx");
		}
}
