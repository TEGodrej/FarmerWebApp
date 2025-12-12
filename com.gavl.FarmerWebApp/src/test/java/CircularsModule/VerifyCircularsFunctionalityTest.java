package CircularsModule;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyCircularsFunctionalityTest extends BaseClass{

	@Test
	public void verifyUserShouldBeAbleToCreateNewCircular() {
		String name="NewCircular";
		String link="www.google.com";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnCircularsTab();
		circularsPage.clickOnCreateNewButton();
		circularsPage.uploadImage();
		circularsPage.sendkeyToCircularNameTextfield(name);
		circularsPage.clickOnGujDivision();
		circularsPage.selectStartDate();
		driverUtility.threadWait(2);
		circularsPage.select_ToDate();
		circularsPage.sendkeyToLinkTextField(link);
		circularsPage.sendkeyToFileUploadButton();
		circularsPage.clickOnSaveButton();
	}
	
	
	@Test
	public void verifyUserShouldBeAbleToCreateNewCircularWithOut_LinkURL() {
		String name="NewCircular";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnCircularsTab();
		circularsPage.clickOnCreateNewButton();
		circularsPage.uploadImage();
		circularsPage.sendkeyToCircularNameTextfield(name);
		circularsPage.clickOnGujDivision();
		circularsPage.selectStartDate();
		driverUtility.threadWait(2);
		circularsPage.select_ToDate();
		circularsPage.sendkeyToFileUploadButton();
		circularsPage.clickOnSaveButton();
	}
	
	
	@Test
	public void verifyUserShouldBeAbleToCreateNewCircularWith_MultipleDivisions() {
		String name="NewCircular";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnCircularsTab();
		circularsPage.clickOnCreateNewButton();
		circularsPage.uploadImage();
		circularsPage.sendkeyToCircularNameTextfield(name);
		circularsPage.clickOnGujDivision();
		circularsPage.clickOnBgnDivision();
		circularsPage.selectStartDate();
		driverUtility.threadWait(2);
		circularsPage.select_ToDate();
		circularsPage.sendkeyToFileUploadButton();
		circularsPage.clickOnSaveButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCreateNewCircularWithOut_CircularName() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnCircularsTab();
		circularsPage.clickOnCreateNewButton();
		circularsPage.uploadImage();
		circularsPage.clickOnGujDivision();
		circularsPage.selectStartDate();
		driverUtility.threadWait(2);
		circularsPage.select_ToDate();
		circularsPage.sendkeyToFileUploadButton();
		circularsPage.clickOnSaveButton();
		circularsPage.verifyCircularNameWarningMessage();
		circularsPage.clickOnCancelButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCreateNewCircularWithOut_SelectingDivision() {
		String name="NewCircular";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnCircularsTab();
		circularsPage.clickOnCreateNewButton();
		circularsPage.uploadImage();
		circularsPage.sendkeyToCircularNameTextfield(name);
//		circularsPage.clickOnGujDivision();
		circularsPage.selectStartDate();
		driverUtility.threadWait(2);
		circularsPage.select_ToDate();
		circularsPage.sendkeyToFileUploadButton();
		circularsPage.clickOnSaveButton();
		circularsPage.verifyDivisionSelectionMessage();
		circularsPage.clickOnCancelButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCreateNewCircularWithOut_SelectingFromDate() {
		String name="NewCircular";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnCircularsTab();
		circularsPage.clickOnCreateNewButton();
		circularsPage.uploadImage();
		circularsPage.sendkeyToCircularNameTextfield(name);
		circularsPage.clickOnGujDivision();
//		circularsPage.selectStartDate();
		driverUtility.threadWait(2);
		circularsPage.select_ToDate();
		circularsPage.sendkeyToFileUploadButton();
		circularsPage.clickOnSaveButton();
		circularsPage.verifyFromDateWarningMessage();
		circularsPage.clickOnCancelButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCreateNewCircularWithOut_SelectingToDate() {
		String name="NewCircular";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnCircularsTab();
		circularsPage.clickOnCreateNewButton();
		circularsPage.uploadImage();
		circularsPage.sendkeyToCircularNameTextfield(name);
		circularsPage.clickOnGujDivision();
		circularsPage.selectStartDate();
		driverUtility.threadWait(2);
		circularsPage.sendkeyToFileUploadButton();
		circularsPage.clickOnSaveButton();
		circularsPage.verifyToDateWarningMessage();
		circularsPage.clickOnCancelButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToCreateNewCircularWithOut_UploadingPDF() {
		String name="NewCircular";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		driverUtility.threadWait(2);
		productOverviewPage.clickOnCircularsTab();
		circularsPage.clickOnCreateNewButton();
		circularsPage.uploadImage();
		circularsPage.sendkeyToCircularNameTextfield(name);
		circularsPage.clickOnGujDivision();
		circularsPage.selectStartDate();
		driverUtility.threadWait(2);
		circularsPage.select_ToDate();
		circularsPage.clickOnSaveButton();
		circularsPage.verifyfileWarningMessage();
		circularsPage.clickOnCancelButton();
	}
}
