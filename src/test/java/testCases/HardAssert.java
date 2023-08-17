package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Utility;

public class HardAssert {
	Utility util;

	@Test
	public void Verification() throws IOException {

		{
			util = new Utility();
			WebDriver dr = util.getDriver();

			assertEquals(dr.getTitle(), "omayo (QAFox.com)", "Title is eqauls 0");

			assertTrue(dr.getTitle().equals("omayo (QAFox.com)"), "Title is eqauls 1");
			
			System.out.println("before failure");
			
			assertNotEquals(dr.getTitle(), "omayo (QAFox.com)", "Title is eqauls 2");

			System.out.println("after failure 1");

			assertFalse(dr.getTitle().equals("omayo (QAFox.com)"), "Title is eqauls 3");

			System.out.println("after failure 2");
		}

	}

}
