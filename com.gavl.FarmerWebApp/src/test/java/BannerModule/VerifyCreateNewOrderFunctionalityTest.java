package BannerModule;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyCreateNewOrderFunctionalityTest extends BaseClass{
	
	
	@Test
	public void verifyUserShouldBeAbleToCreateNewOrder() {
		String name="NewBanner";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnBannerTab();
		driverUtility.threadWait(2);
		bannerPage.clickOnCreateNewButton();
		driverUtility.threadWait(2);
		bannerPage.uploadImage();
		driverUtility.threadWait(2);
		bannerPage.sendkeyToBannerNameTextField(name);
		driverUtility.threadWait(2);
		bannerPage.clickOnBgnDivision();
		driverUtility.threadWait(2);
		bannerPage.selectFromStartDate();
		driverUtility.threadWait(2);
		bannerPage.selectToDate();
		driverUtility.threadWait(2);
		driverUtility.scrollToElement(bannerPage.getwelcomeTitle());
		driverUtility.threadWait(2);
		bannerPage.clickOnSaveButton();
		
		
		
	}
	
	@Test
	public void verifyUserShouldBeAbleToCreateNewOrderWithMultipleDivisionSelect() {
		String name="NewBanner";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnBannerTab();
		driverUtility.threadWait(2);
		bannerPage.clickOnCreateNewButton();
		driverUtility.threadWait(2);
		bannerPage.uploadImage();
		driverUtility.threadWait(2);
		bannerPage.sendkeyToBannerNameTextField(name);
		driverUtility.threadWait(2);
		bannerPage.clickOnBgnDivision();
		bannerPage.clickOnbngDivision();
		bannerPage.clickOnTestDivision();
		driverUtility.threadWait(2);
		bannerPage.selectFromStartDate();
		driverUtility.threadWait(2);
		bannerPage.selectToDate();
		driverUtility.threadWait(2);
		driverUtility.scrollToElement(bannerPage.getwelcomeTitle());
		driverUtility.threadWait(2);
		bannerPage.clickOnSaveButton();
	}
	
	@Test
	public void verifyUserShouldBeAbleToCancelProcess() {
		String name="NewBanner";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnBannerTab();
		driverUtility.threadWait(2);
		bannerPage.clickOnCreateNewButton();
		driverUtility.threadWait(2);
		bannerPage.uploadImage();
		driverUtility.threadWait(2);
		bannerPage.sendkeyToBannerNameTextField(name);
		bannerPage.clickOnCancelButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCerateBannerWithout_BannerName() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnBannerTab();
		driverUtility.threadWait(2);
		bannerPage.clickOnCreateNewButton();
		driverUtility.threadWait(2);
		bannerPage.uploadImage();
		driverUtility.threadWait(2);
		driverUtility.threadWait(2);
		bannerPage.clickOnBgnDivision();
		driverUtility.threadWait(2);
		bannerPage.selectFromStartDate();
		driverUtility.threadWait(2);
		bannerPage.selectToDate();
		driverUtility.threadWait(2);
		driverUtility.scrollToElement(bannerPage.getwelcomeTitle());
		driverUtility.threadWait(2);
		bannerPage.clickOnSaveButton();
		bannerPage.verifyBannerNameWarningMessageDisplay();
		bannerPage.clickOnCancelButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCerateBannerWithout_ToDate() {
		String name="NewBanner";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnBannerTab();
		driverUtility.threadWait(2);
		bannerPage.clickOnCreateNewButton();
		driverUtility.threadWait(2);
		bannerPage.uploadImage();
		driverUtility.threadWait(2);
		bannerPage.sendkeyToBannerNameTextField(name);
		driverUtility.threadWait(2);
		bannerPage.clickOnBgnDivision();
		driverUtility.threadWait(2);
		bannerPage.selectFromStartDate();
		driverUtility.threadWait(2);
		driverUtility.threadWait(2);
		driverUtility.scrollToElement(bannerPage.getwelcomeTitle());
		driverUtility.threadWait(2);
		bannerPage.clickOnSaveButton();
		bannerPage.verifytoDateWarningMessageDisplay();
		bannerPage.clickOnCancelButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCerateBannerWithout_FromDate() {
		String name="NewBanner";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnBannerTab();
		driverUtility.threadWait(2);
		bannerPage.clickOnCreateNewButton();
		driverUtility.threadWait(2);
		bannerPage.uploadImage();
		driverUtility.threadWait(2);
		bannerPage.sendkeyToBannerNameTextField(name);
		driverUtility.threadWait(2);
		bannerPage.clickOnBgnDivision();
		driverUtility.threadWait(2);
//		bannerPage.selectFromStartDate();
		driverUtility.threadWait(2);
		bannerPage.selectToDate();
		driverUtility.threadWait(2);
		driverUtility.scrollToElement(bannerPage.getwelcomeTitle());
		driverUtility.threadWait(2);
		bannerPage.clickOnSaveButton();
		bannerPage.verifyFromDateWarningMessageDisplay();
		bannerPage.clickOnCancelButton();
	}
	

}
