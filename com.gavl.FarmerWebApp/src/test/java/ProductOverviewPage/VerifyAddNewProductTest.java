package ProductOverviewPage;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyAddNewProductTest extends BaseClass{

	
	@Test
	public void verifyUserIsAbleToAddNewProduct() {
		String productName="Automation";
		String SkuCode="testGavl";
		String actualPrice="120";
		String offerPrice="100";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.uploadImage();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
//		
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.sendkeyTounitTextField("KG");
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnActiveOption();
		editProductPage.clickOnselectDivisionDropDown();
		driverUtility.scrollIntoView(editProductPage.getvkpDivisionOption());
		editProductPage.clickOn_VZG_DivisionOption();
		editProductPage.clickOnselectPlantDropDown();
		editProductPage.clickOnBatajangalapalemOption();
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.clickOnsaveButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void UserShouldNotBeAbleToCoatOfferPriceMoreThan_MRP() {
		String productName="Automation";
		String SkuCode="test";
		String actualPrice="120";
		String offerPrice="100";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.verifyofferPriceWarningMessage();
		editProductPage.clickOnsaveButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToAddNewProductWithout_ProductName() {
		String SkuCode="test";
		String actualPrice="120";
		String offerPrice="100";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnActiveOption();
		editProductPage.clickOnsaveButton();
		editProductPage.verifyProductNameWarningMessage();
		editProductPage.clickOnCrossButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToAddNewProductWithout_SKU_Code() {
		String productName="Automation";
		String actualPrice="120";
		String offerPrice="100";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnActiveOption();
		editProductPage.clickOnsaveButton();
		editProductPage.verifyskuWarningMessage();
		editProductPage.clickOnCrossButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToAddNewProductWithout_Division() {
		String productName="Automation";
		String SkuCode="test";
		String actualPrice="120";
		String offerPrice="100";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.uploadImage();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnActiveOption();
		editProductPage.clickOnsaveButton();
		editProductPage.verifydivisionWarningMessage();
		editProductPage.clickOnCrossButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToAddNewProductWithout_Actual_MRP() {
		String productName="Automation";
		String SkuCode="test";
		String offerPrice="100";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.uploadImage();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnActiveOption();
		editProductPage.clickOnsaveButton();
		editProductPage.verify_MRP_WarningMessage();
		editProductPage.clickOnCrossButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToAddNewProductWithout_OfferPrice() {
		String productName="Automation";
		String SkuCode="test";
		String actualPrice="120";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.uploadImage();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnActiveOption();
		editProductPage.clickOnsaveButton();
		editProductPage.verifyofferPriceEmptyMessage();
		editProductPage.clickOnCrossButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserShouldNotBeAbleToAddNewProductWithout_NetWeight() {
		String productName="Automation";
		String SkuCode="test";
		String actualPrice="120";
		String offerPrice="100";
//		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.uploadImage();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
//		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnActiveOption();
		editProductPage.clickOnsaveButton();
		editProductPage.verifyWeightWarningMessage();
		editProductPage.clickOnCrossButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void VerifyUserAbleToAddNewProductWith_InActiveState() {
		String productName="Automation";
		String SkuCode="test";
		String actualPrice="120";
		String offerPrice="100";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.uploadImage();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnInActiveOption();
		editProductPage.clickOnsaveButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserIsAbleToAddNewProductWithMultipleDivision() {
		String productName="Automation";
		String SkuCode="test";
		String actualPrice="120";
		String offerPrice="100";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.uploadImage();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.clickOn_HJY_DivisionOption();
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnActiveOption();
		editProductPage.clickOnsaveButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserIsAbleToAddNewProductWithMultipleDivisionAsInactive() {
        String productName="Automation";
		String SkuCode="test34";
		String actualPrice="120";
		String offerPrice="100";
		String netWeight= "10";
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.uploadImage();
		editProductPage.clickOncategoryDropDown();
		editProductPage.clickOnCategory_001_Option();
		editProductPage.sendkeyToProductNameTextField(productName);
		editProductPage.sendkeyToSkuCodeTextField(SkuCode);
		editProductPage.clickOn_BGN_DivisionOption();
		editProductPage.clickOn_HJY_DivisionOption();
		editProductPage.sendkeyToActualPriceTextField(actualPrice);
		editProductPage.sendkeyToOfferPriceTextField(offerPrice);
		editProductPage.sendkeyToNetWeightTextField(netWeight);
		editProductPage.clickOnselectStatusDropDown();
		editProductPage.clickOnInActiveOption();
		editProductPage.clickOnsaveButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
	
	@Test
	public void verifyUserShouldBeAbleToCancelAddingNewProduct() {
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
		productOverviewPage.clickOnProductTab();
		productOverviewPage.verifyproductOverviewTitle();
		productOverviewPage.clickOnAddNewProductButton();
		editProductPage.clickOnCancelButton();
		productOverviewPage.clickOnAdminDropDown();
		productOverviewPage.clickOnLogoutButton();
	}
}
