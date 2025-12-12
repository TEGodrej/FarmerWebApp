package ProductOverviewPage;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class verifyUploadAndDownloadFunctionalityTest extends BaseClass{
	
	@Test
	public void verifyUserShouldBeAbleToDownloadFile() {
		driverUtility.implicitlyWait(10);
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.clickOnExportProductButton();
	}

}
