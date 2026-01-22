package serviceRequestModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyFilterFunctionalityTest extends BaseClass{
	
	
	@Test
	public void verifyUserShouldBeAbleToApplyFilterDivisionWiseFor_AI() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(4);
		serviceRequestPage.clickOnServiceRequestTab();
		driverUtility.threadWait(2);
		serviceRequestPage.clickOnFilterButton();
		driverUtility.threadWait(2);
		filterPage.clickOn_VZG_Division();
		driverUtility.threadWait(2);
		filterPage.clickOnApplyButton();
		driverUtility.threadWait(5);
		
		String expectedValue = "VZG";
		int statusColumnIndex = 5; // 0-based index

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
	
	@Test
	public void verifyUserShouldBeAbleToApplyFilterByServiceIDFor_AI() {
		String service_ID="SR_200126_00005";
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(4);
		serviceRequestPage.clickOnServiceRequestTab();
		driverUtility.threadWait(2);
		serviceRequestPage.clickOnFilterButton();
		driverUtility.threadWait(2);
		filterPage.sendkeyToServiceIdTextfield(service_ID);
		driverUtility.threadWait(2);
		filterPage.clickOnApplyButton();
		driverUtility.threadWait(5);
		
		String expectedValue = "SR_200126_00005";
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
		    System.out.println("Found: "+actualValue);
		}
	}
	
	@Test
	public void verifyUserAbleToFilterData_CC_wise() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(4);
		serviceRequestPage.clickOnServiceRequestTab();
		driverUtility.threadWait(2);
		serviceRequestPage.clickOnFilterButton();
		driverUtility.threadWait(2);
		filterPage.clickOnSelect_CC_DropDown();
		filterPage.clickOnAnaicutOption();
		filterPage.clickOnApplyButton();
		driverUtility.threadWait(8);
		
		String expectedValue="Anaicut";
		int statusColumnIndex=6;
		
		List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		Assert.assertTrue(rows.size() > 0,"No data displayed after filter");
		
		for(WebElement row:rows) {
			List<WebElement>columns=row.findElements(By.tagName("td"));
			String actualValue= columns.get(statusColumnIndex).getText().trim();
			
			Assert.assertEquals(actualValue, expectedValue,"Filter msmatch in row: "+row.getText());
		}
	}

}
