package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import omayoblog.pages.HomePage;
import utilities.Utility;

public class VerificationofMultiSelectFunctionofDropDown extends BaseTest {

	HomePage page;
	@Test
	public void verificationofMultiSelectFunctionofDropDown() {
		
		page = new HomePage(driver);
		String [] options = {"Audi","Volvo"};
		ArrayList<String> selectedOptions= Utility.selectOptionfromDropdown(page.getmultiSelectDropDownlocator(), options);
		
		assertEquals(selectedOptions, Arrays.asList("Volvo","Audi") );

	}

}
