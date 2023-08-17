package omayo.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import omayoblog.pages.HomePage;
import omayoblog.pages.Selenium143Page;
import utilities.Utility;

public class VerifyPageNavigation extends BaseTest {

	HomePage page;
	Selenium143Page selenium143page;

	@Test
	public void VerifyNavigation() {
		page = new HomePage(driver);
		selenium143page = new Selenium143Page(driver);
		page.clickOnThisBlogIsCreated();
		String parentWindowHandle = Utility.switchToNewWindow(driver);
		assertEquals(selenium143page.getWhatisSeleniumLinkText(), "What is Selenium");
		driver.close();
		Utility.switchToWindow(driver, parentWindowHandle);
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}

}
