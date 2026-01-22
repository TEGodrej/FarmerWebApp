package BannerModule;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyCreateNewOrderFunctionalityTest extends BaseClass{
	
	
	@Test
	public void verifyUserShouldBeAbleToCreateNewOrder() {
		int random=(int)(Math.random()*900)+100;
		String name="NewBanner"+random;
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
		driverUtility.threadWait(4);
		bannerPage.clickOnBNGDivision();
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
		int random=(int)(Math.random()*900)+100;
		String name="NewBanner"+random;
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
		bannerPage.clickOnBNGDivision();
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
		int random=(int)(Math.random()*900)+100;
		String name="NewBanner"+random;
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
	public void verifyUserShouldNotBeAbleToCreateBannerWithout_BannerName() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnBannerTab();
		driverUtility.threadWait(2);
		bannerPage.clickOnCreateNewButton();
		driverUtility.threadWait(2);
		bannerPage.uploadImage();
		driverUtility.threadWait(2);
		bannerPage.clickOnBNGDivision();
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
	public void verifyUserShouldNotBeAbleToCreateBannerWithout_ToDate() {
		int random=(int)(Math.random()*900)+100;
		String name="NewBanner"+random;
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
		bannerPage.clickOnBNGDivision();
		driverUtility.threadWait(2);
		bannerPage.selectFromStartDate();
		driverUtility.threadWait(2);
		driverUtility.scrollToElement(bannerPage.getwelcomeTitle());
		driverUtility.threadWait(2);
		bannerPage.clickOnSaveButton();
		bannerPage.verifytoDateWarningMessageDisplay();
		bannerPage.clickOnCancelButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCreateBannerWithout_FromDate() {
		int random=(int)(Math.random()*900)+100;
		String name="NewBanner"+random;
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
		bannerPage.clickOnBNGDivision();
		driverUtility.threadWait(2);
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
