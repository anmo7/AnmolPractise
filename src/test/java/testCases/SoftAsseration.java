package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Utility;

public class SoftAsseration {
	Utility util;

	SoftAssert verify = new SoftAssert();

	@Test
	public void verifyPageTitle() throws IOException {

		Utility util = new Utility();
		WebDriver dr = util.getDriver();

		verify.assertEquals(dr.getTitle(), "omayo (QAFox.com)", "Title is eqauls 0");

		verify.assertTrue(dr.getTitle().equals("omayo (QAFox.com)"), "Title is eqauls 1");

		verify.assertNotEquals(dr.getTitle(), "omayo (QAFox.com)", "Title is eqauls 2");

		System.out.println("After failure 1");

		verify.assertFalse(dr.getTitle().equals("omayo (QAFox.com)"), "Title is eqauls 3");

		System.out.println("After failure 2");

		verify.assertAll();

	}

}
