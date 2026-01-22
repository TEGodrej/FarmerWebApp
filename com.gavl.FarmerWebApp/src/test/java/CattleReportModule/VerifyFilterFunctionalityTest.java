package CattleReportModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyFilterFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserAbleToFilterDataOnDivisionBasis() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(6);
		cattelReportPage.clickOnCattleReportTab();
		driverUtility.threadWait(2);
		cattelReportPage.clickOnFilterButton();
	
		filterPage.clickOn_VZG_Division();
		driverUtility.threadWait(2);
		filterPage.clickOnApplyButton();
		driverUtility.threadWait(5);
		
		String expectedValue = "VZG";
		int statusColumnIndex = 4; // 0-based index

		List<WebElement> rows = driver.findElements(
		        By.xpath("//table/tbody/tr")
		);

		Assert.assertTrue(rows.size() > 0, "No data displayed after filter");

		for (WebElement row : rows) {
		    List<WebElement> columns = row.findElements(By.tagName("td"));
		    String actualValue = columns.get(statusColumnIndex).getText().trim();

		    Assert.assertEquals(actualValue, expectedValue,
		            "Filter mismatch in row: " + row.getText());
		}

	}
//	 date has to set >>>>>>>>>
	@Test
	public void verifyUserAbleToFilterDataOnDateBasis() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(6);
		cattelReportPage.clickOnCattleReportTab();
		driverUtility.threadWait(2);
		cattelReportPage.clickOnFilterButton();
		driverUtility.threadWait(2);
		filterPage.clickOnStartDateCalender();
		filterPage.selectStartDate();
		filterPage.select_ToDate();
		driverUtility.threadWait(2);
		filterPage.clickOnApplyButton();
	}
	
	
	@Test
	public void verifyUserAbleToFilterDataOnPlantwise() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(6);
		cattelReportPage.clickOnCattleReportTab();
		driverUtility.threadWait(2);
		cattelReportPage.clickOnFilterButton();
		driverUtility.threadWait(2);
		filterPage.clickOnSelectPlantDropDown();
		filterPage.clickOnAnaicutOption();
		filterPage.clickOnApplyButton();
		driverUtility.threadWait(8);
		
		String expectedValue="Anaicut";
		int statusColumnIndex=5;
		
		List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		Assert.assertTrue(rows.size() > 0,"No data displayed after filter");
		
		for(WebElement row:rows) {
			List<WebElement>columns=row.findElements(By.tagName("td"));
			String actualValue= columns.get(statusColumnIndex).getText().trim();
			
			Assert.assertEquals(actualValue, expectedValue,"Filter msmatch in row: "+row.getText());
		}
		
		
	}
	
	@Test
	public void verifyUserAbleToFilterDataOn_DFP_Basis() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(6);
		cattelReportPage.clickOnCattleReportTab();
		driverUtility.threadWait(2);
		cattelReportPage.clickOnFilterButton();
		driverUtility.threadWait(2);
		filterPage.clickOnSelect_DFP_DropDown();;
		filterPage.clickOnDFP_Option_one();
		filterPage.clickOnApplyButton();
		driverUtility.threadWait(8);
		
		String expectedValue="KARAKA DEVI";
		int statusColumnIndex=6;
		
		List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		Assert.assertTrue(rows.size() > 0,"No data displayed after filter");
		
		for(WebElement row:rows) {
			List<WebElement>columns=row.findElements(By.tagName("td"));
			String actualValue= columns.get(statusColumnIndex).getText().trim();
			
			Assert.assertEquals(actualValue, expectedValue,"Filter msmatch in row: "+row.getText());
		}
	}
	
	
	@Test
	public void verifyUserAbleToSearchData() {
		String key="Naidumangalam";
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(6);
		cattelReportPage.clickOnCattleReportTab();
		driverUtility.threadWait(2);
		cattelReportPage.sendkeyToSearchTextfield(key);
		
		String expectedValue="Naidumangalam";
		int statusColumnIndex=5;
		
		List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		Assert.assertTrue(rows.size() > 0,"No data displayed after filter");
		
		for(WebElement row:rows) {
			List<WebElement>columns=row.findElements(By.tagName("td"));
			String actualValue= columns.get(statusColumnIndex).getText().trim();
			
			Assert.assertEquals(actualValue, expectedValue,"Filter msmatch in row: "+row.getText());
		}
	}
}
