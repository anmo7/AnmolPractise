package selenium.practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utility;

public class ExcelDrivenTest {
	static WebDriver dr;

	public static void main(String[] args) throws IOException {
		ExcelDrivenTest a = new ExcelDrivenTest();
		a.exceldata();
	}

	public void exceldata() throws IOException {

		List<String> dataFromExcel = Utility.readExcel();
		NonSelectDropdown2 se = new NonSelectDropdown2();

		dr = se.getDriver();

		dr.get(Utility.getProperty("demoURL"));

		dr.manage().window().maximize();

		dr.findElement(By.xpath("//input[@name ='firstName']")).sendKeys(dataFromExcel.get(0));
		dr.findElement(By.xpath("//input[@name ='lastName']")).sendKeys(dataFromExcel.get(1));
		dr.findElement(By.xpath("//input[@name ='phone']")).sendKeys(dataFromExcel.get(2));
		dr.findElement(By.xpath("//input[@name ='userName']")).sendKeys(dataFromExcel.get(3));
	}
}
