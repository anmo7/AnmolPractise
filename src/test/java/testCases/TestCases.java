package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Utility;

public class TestCases {

	//Utility util;

	@Test
	public void verifyPageTitle() throws IOException {
		Utility util = new Utility();
		WebDriver dr = util.getDriver();

		//Assert.assertEquals(dr.getTitle(),"omayo (QAFox.com)");
		Assert.assertEquals(dr.getTitle( ), "omayo(QAFox.com");
	}

}
