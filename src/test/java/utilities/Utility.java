package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public WebDriver getDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.get(getProperty("url"));
		dr.manage().window().maximize();
		return dr;
	}

	public static String getProperty(String Key) throws IOException {

		File file = new File("src/test/resources/Master.properties");
		FileInputStream fileInputStream = new FileInputStream(file);

		java.util.Properties properties = new java.util.Properties();
		properties.load(fileInputStream);

		return properties.getProperty(Key);
	}

	public static List<String> readExcel() throws IOException {

		List<String> exceldata = new ArrayList<String>();
		File file = new File("src/test/resources/User data.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		XSSFWorkbook xxsfWorkbook = new XSSFWorkbook(fileInputStream);

		XSSFSheet sheet = xxsfWorkbook.getSheet("Sheet1");

		int lastRow = sheet.getLastRowNum();

		for (int i = 1; i <= lastRow; i++) {
			XSSFRow row = sheet.getRow(i);

			int lastCellNum = row.getLastCellNum();

			for (int j = 0; j < lastCellNum; j++) {
				exceldata.add(row.getCell(j).toString());
			}
		}
		xxsfWorkbook.close();
		return exceldata;
	}

	public static ArrayList<String> selectOptionfromDropdown(WebElement dropdown, String[] options) {

		Select select = new Select(dropdown);
		ArrayList<String> selectedOptions = new ArrayList<>();

		for (String option : options) {
			select.selectByVisibleText(option);
		}

		List<WebElement> selectedOptionsByCode = select.getAllSelectedOptions();

		for (WebElement element : selectedOptionsByCode) {
			selectedOptions.add(element.getText());
		}
		return selectedOptions;
	}

	public static String switchToNewWindow(WebDriver driver) {
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {

			if (!(handle.equals(currentWindowHandle))) {
				driver.switchTo().window(handle);
			}
		}
		return currentWindowHandle;
	}

	public static void switchToWindow(WebDriver driver, String windowHandle) {

		driver.switchTo().window(windowHandle);
	}

	public static ArrayList<String> getALLTableData(WebDriver driver, String table) {
		List<WebElement> tableOptions = driver.findElements(By.xpath(table));
		ArrayList<String> allTableData = new ArrayList<>();
		for (WebElement option : tableOptions) {
			allTableData.add(option.getText());
		}
		return allTableData;
	}
}