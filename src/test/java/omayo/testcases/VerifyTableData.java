package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import utilities.Utility;

public class VerifyTableData extends BaseTest {

	@Test
	public void VerifyTableDataOfApplication() {
		ArrayList<String> expectedTableData = new ArrayList<>();
		expectedTableData.add("Kishore");
		expectedTableData.add("22");
		expectedTableData.add("Delhi");
		expectedTableData.add("Manish");
		expectedTableData.add("25");
		expectedTableData.add("Pune");
		expectedTableData.add("Praveen");
		expectedTableData.add("29");
		expectedTableData.add("Bangalore");
		expectedTableData.add("Dheepthi");
		expectedTableData.add("31");
		expectedTableData.add("Mumbai");
		assertEquals(Utility.getALLTableData(driver, "//table[@id='table1']/tbody/tr//td"), expectedTableData);
		//assertEquals(Utility.getALLTableData(driver , "//table[@id='table1']/tbody/tr//td"))
	}
}
