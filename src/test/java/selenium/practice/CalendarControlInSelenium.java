package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendarControlInSelenium {
	static WebDriver dr;

	public static void main(String[] args) throws InterruptedException {
		CalendarControlInSelenium a = new CalendarControlInSelenium();
		a.selectDate("1", "20");
	}

	/**
	 * 
	 * @param month pass month as string and it will 1 or 2
	 * @param Date  pass date as String and it will be as per your calendar date 1
	 *              or 30.
	 * @throws InterruptedException
	 */

	public void selectDate(String month, String Date) throws InterruptedException {
		NonSelectDropdown2 se = new NonSelectDropdown2();

		dr = se.getDriver();

		dr.get("https://www.makemytrip.com/");

		dr.manage().window().maximize();

		Thread.sleep(20000);

		dr.findElement(By.xpath("//input[@id='departure']/../span")).click();

		Thread.sleep(3000);

		dr.findElement(By.xpath("//div[@class ='DayPicker']//div[@class = 'DayPicker-Month'][" + month
				+ "]//div[@class='DayPicker-Day']//p[text()='" + Date + "']")).click();
	}

}
