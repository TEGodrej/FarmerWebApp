package ServiceRequest;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyuserabletoApplyFilter extends BaseClass{

	@Test
	public void userApplyDatefilter() {
	loginPage.clickOn_SSO_Option();
	driverUtility.threadWait(2);
    filterPage.clickOnserviceRequestTab();
    filterPage.clickOnfilteroption();
	filterPage.selectStartDate();
	filterPage.select_ToDate();
	filterPage.clickOnApplyButton();
	}
	
	@Test
	public void userApplyDivisionfilter() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		 filterPage.clickOnserviceRequestTab();
	 filterPage.clickOnfilteroption();
		filterPage.clickOn_VZG_Division();
		filterPage.clickOnApplyButton();
	
	}
	
	@Test
	public void userApply_CC_filter() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		 filterPage.clickOnserviceRequestTab();
		filterPage.clickOnfilteroption();
		filterPage.clickOnSelect_CC_DropDown();
		filterPage.clickOnFirst_CC_Option();
		filterPage.clickOnApplyButton();
	}
	
	@Test
	public void userApply_DFP_filter() {
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		 filterPage.clickOnserviceRequestTab();
		    filterPage.clickOnfilteroption();
		filterPage.clickOnSelect_DFP_DropDown();
		filterPage.clickOnSecondName();
		filterPage.clickOnApplyButton();
	}
	
	@Test
	public void userApply_ServiceID_filter() {
		String service="SR_200126_00005";
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		 filterPage.clickOnserviceRequestTab();
		filterPage.clickOnfilteroption();
		filterPage.sendkeyToserviceIDTextfield(service);
		filterPage.clickOnApplyButton();	
	}
}
