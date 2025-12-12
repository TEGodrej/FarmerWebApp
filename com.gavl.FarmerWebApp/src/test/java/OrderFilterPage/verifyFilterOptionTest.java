package OrderFilterPage;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class verifyFilterOptionTest extends BaseClass{
	
	@Test
	public void verifyFilterWithFirstCC_And_FirstDFP_Name() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnOrderTab();
		orderOverviewPage.clickOnFilterOption();
		driverUtility.threadWait(2);
		filterPage.selectStartDate();
		driverUtility.threadWait(2);
		filterPage.clickOnendDateCalender();
		driverUtility.threadWait(2);
		filterPage.select_ToDate();
		driverUtility.threadWait(2);
		filterPage.clickOnChennaiDivision();
		filterPage.clickOnSelect_CC_DropDown();
		filterPage.clickOnFirst_CC_Option();
		filterPage.clickOnSelect_DFP_DropDown();
		filterPage.clickOnFirstName();
		filterPage.clickOnApplyButton();
	}
	
	@Test
	public void verifyFilterWithSecondCC_And_SecondDFP_Name() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnOrderTab();
		orderOverviewPage.clickOnFilterOption();
		driverUtility.threadWait(2);
		filterPage.selectStartDate();
		driverUtility.threadWait(2);
		filterPage.clickOnendDateCalender();
		driverUtility.threadWait(2);
		filterPage.select_ToDate();
		driverUtility.threadWait(2);
		filterPage.clickOnChennaiDivision();
		filterPage.clickOnSelect_CC_DropDown();
		filterPage.clickOnSecond_CC_Option();
		filterPage.clickOnSelect_DFP_DropDown();
		filterPage.clickOnSecondName();
		filterPage.clickOnApplyButton();
	}
	
	@Test
	public void verifyFilterWithThirdCC_And_ThirdDFP_Name() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnOrderTab();
		orderOverviewPage.clickOnFilterOption();
		driverUtility.threadWait(2);
		filterPage.selectStartDate();
		driverUtility.threadWait(2);
		filterPage.clickOnendDateCalender();
		driverUtility.threadWait(2);
		filterPage.select_ToDate();
		driverUtility.threadWait(2);
		filterPage.clickOnChennaiDivision();
		filterPage.clickOnSelect_CC_DropDown();
		filterPage.clickOnThird_CC_Option();
		filterPage.clickOnSelect_DFP_DropDown();
		filterPage.clickOnThirdName();
		filterPage.clickOnApplyButton();
	}
	
	@Test
	public void verifyUserShouldBeAbleToClearFilteringBetweenTheProcess() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnOrderTab();
		orderOverviewPage.clickOnFilterOption();
		filterPage.clickOnClearButton();
	}
	
	@Test
	public void verifyUserShouldBeAbleToClickOnCrossButton() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnOrderTab();
		driverUtility.threadWait(4);
		orderOverviewPage.clickOnFilterOption();
		filterPage.clickOnStartDateCalender();
		driverUtility.threadWait(2);
		filterPage.selectStartDate();
		driverUtility.threadWait(2);
		filterPage.clickOnendDateCalender();
		driverUtility.threadWait(2);
		filterPage.select_ToDate();
		driverUtility.threadWait(2);
		filterPage.clickOncrossButton();
	}

}
