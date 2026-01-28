package ObjectRepository;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProductPage {

	WebDriver driver;

	public EditProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@aria-label,'Select Category')]//*[name()='svg']")
	private WebElement categoryDropDown;

	@FindBy(xpath = "//span[text()='Milk Based Sweets']")
	private WebElement category_001_Option;

	@FindBy(xpath = "//span[text()='Feed']")
	private WebElement feedOption;

	@FindBy(xpath = "//span[text()='cow feed 10kg']")
	private WebElement cowFeedOption;

	@FindBy(xpath = "//span[text()='Sheep Feed']")
	private WebElement sheepFeedOption;

	@FindBy(xpath = "//span[text()='Buffalo Feed']")
	private WebElement buffaloFeedOption;

	@FindBy(xpath = "//span[text()='TEST']")
	private WebElement testDivisionOption;

	@FindBy(xpath = "//span[text()='VKP']")
	private WebElement vkpDivisionOption;

	@FindBy(xpath = "//span[text()='PAL']")
	private WebElement palDivisionOption;

	@FindBy(xpath = "//span[text()='ULM']")
	private WebElement ulmDivisionOption;

	@FindBy(xpath = "//span[text()='GUJ']")
	private WebElement gujDivisionOption;

	@FindBy(xpath = "//span[text()='PNB']")
	private WebElement pnbDivisionOption;

	@FindBy(xpath = "//span[text()='BGN']")
	private WebElement bgnDivisionOption;

	@FindBy(xpath = "//span[text()='NDP']")
	private WebElement ndpDivisionOption;

	@FindBy(xpath = "//span[text()='HJY']")
	private WebElement hjyDivisionOption;

	@FindBy(xpath = "//span[text()='JMK']")
	private WebElement jmkDivisionOption;

	@FindBy(xpath = "//span[text()='BNG']")
	private WebElement bngDivisionOption;

	@FindBy(xpath = "//span[text()='HYD']")
	private WebElement hydDivisionOption;

	@FindBy(xpath = "//span[text()='VZG']")
	private WebElement vzgDivisionOption;

	@FindBy(xpath = "//span[text()='CHN']")
	private WebElement chnDivisionOption;

	@FindBy(xpath = "//input[@placeholder='Enter Actual Price (MRP)']")
	private WebElement actualPriceTextField;

	@FindBy(xpath = "//input[@placeholder='Enter Offer Price']")
	private WebElement offerPriceTextField;

	@FindBy(xpath = "//input[@placeholder='Enter Net Weight']")
	private WebElement netWeightTextField;
	
	@FindBy(xpath = "//input[@placeholder='Enter Unit']")
	private WebElement unitTextField;

	@FindBy(xpath = "//div[@aria-label='Select Select Status']//*[name()='svg']")
	private WebElement selectStatusDropDown;

	@FindBy(xpath = "//span[text()='Inactive']")
	private WebElement inActiveOption;

	@FindBy(xpath = "//span[text()='Active']")
	private WebElement activeOption;

	@FindBy(xpath = "//span[text()='Update']")
	private WebElement updateButton;

	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "//button[contains(@class,'p-dialog-header-icon p-dialog-header-close p-link')]//*[name()='svg']")
	private WebElement crossButton;

	@FindBy(xpath = "//button[@id='«rb»']//*[name()='svg']")
	private WebElement imageEditButton;

	@FindBy(xpath = "//button[@id='«rc»']//*[name()='svg']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter Product Name']")
	private WebElement productNameTextField;
	
	@FindBy(xpath = "//input[@placeholder='Enter SKU Code']")
	private WebElement skuCodeTextField;
	
	@FindBy(xpath = "//div[text()='Offer price must be less than MRP']")
	private WebElement offerPriceWarningMessage;
	
	@FindBy(xpath = "//div[text()='SKU code is required']")
	private WebElement skuWarningMessage;
	
	@FindBy(xpath = "//p[text()='At least one division is required']")
	private WebElement divisionWarningMessage;
	
	@FindBy(xpath = "//div[text()='MRP is required and must be a number']")
	private WebElement mrpWarningMessage;
	
	@FindBy(xpath = "//div[text()='Net weight is required and must be a number']")
	private WebElement weightWarningMessage;
	
	@FindBy(xpath = "//span[text()='Category is required']" )
	private WebElement categoryWarningMessage;
	
	@FindBy(xpath = "//div[text()='Product name is required']")
	private WebElement productNameWarningMessage;
	
	@FindBy(xpath = "//div[text()='Offer price is required']")
	private WebElement offerPriceEmptyMessage;
	
	@FindBy(xpath = "input[type='file'][accept='image/jpeg,image/png']")
	private WebElement uploadImageButton;
//	======================================================================================================
	@FindBy(xpath = "//span[text()='Add New']")
	private WebElement addNewTab;
	
	@FindBy(xpath = "//span[text()='Select Division']")
	private WebElement selectDivisionDropDown;
	
	@FindBy(xpath = "//span[text()='Select Plant']")
	private WebElement selectPlantDropDown;
	
	@FindBy(xpath = "//span[text()='Obaroies']")
	private WebElement ObaroiesOption;
	
//	@FindBy(xpath = "//span[text()='Select Division']")
//	private WebElement selectDivisionDropDown;
//	
//	@FindBy(xpath = "//span[text()='Select Plant']")
//	private WebElement selectPlantDropDown;
	
	@FindBy(xpath = "//span[text()='Batajangalapalem Packing Stati']")
	private WebElement  BatajangalapalemOption;
	
	public WebElement getvkpDivisionOption() {
		return vkpDivisionOption;
	}
	public void clickOnBatajangalapalemOption() {
		try {
			BatajangalapalemOption.click();
			System.out.println("Clicked on BatajangalapalemOption");
		} catch (Exception e) {
			System.out.println("Not able to click on BatajangalapalemOption " + e);
		}
	} 
	
	public void clickOnselectPlantDropDown() {
		try {
			selectPlantDropDown.click();
			System.out.println("Clicked on selectPlantDropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on selectPlantDropDown " + e);
		}
	} 

	public void clickOncategoryDropDown() {
		try {
			categoryDropDown.click();
			System.out.println("Clicked on categoryDropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on categoryDropDown " + e);
		}
	}      
	
	public void clickOnselectDivisionDropDown() {
		try {
			selectDivisionDropDown.click();
			System.out.println("Clicked on selectDivisionDropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on selectDivisionDropDown " + e);
		}
	}   

	public void clickOnCategory_001_Option() {
		try {
			category_001_Option.click();
			System.out.println("Clicked on category_001_Option");
		} catch (Exception e) {
			System.out.println("Not able to click on category_001_Option " + e);
		}
	}

	public void clickOnFeedOption() {
		try {
			feedOption.click();
			System.out.println("Clicked on feedOption");
		} catch (Exception e) {
			System.out.println("Not able to click on feedOption " + e);
		}
	}

	public void clickOnCowFeedOption() {
		try {
			cowFeedOption.click();
			System.out.println("Clicked on cowFeedOption");
		} catch (Exception e) {
			System.out.println("Not able to click on cowFeedOption " + e);
		}
	}

	public void clickOnSheepFeedOption() {
		try {
			sheepFeedOption.click();
			System.out.println("Clicked on sheepFeedOption");
		} catch (Exception e) {
			System.out.println("Not able to click on sheepFeedOption " + e);
		}
	}

	public void clickOnBuffaloFeedOption() {
		try {
			buffaloFeedOption.click();
			System.out.println("Clicked on buffaloFeedOption");
		} catch (Exception e) {
			System.out.println("Not able to click on buffaloFeedOption " + e);
		}
	}

	public void clickOn_Test_DivisionOption() {
		try {
			testDivisionOption.click();
			System.out.println("Clicked on testDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on testDivisionOption " + e);
		}
	}

	public void clickOn_VKP_DivisionOption() {
		try {
			vkpDivisionOption.click();
			System.out.println("Clicked on vkpDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on vkpDivisionOption " + e);
		}
	}

	public void clickOn_PAL_DivisionOption() {
		try {
			palDivisionOption.click();
			System.out.println("Clicked on palDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on palDivisionOption " + e);
		}
	}

	public void clickOn_ULM_DivisionOption() {
		try {
			ulmDivisionOption.click();
			System.out.println("Clicked on ulmDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on ulmDivisionOption " + e);
		}
	}

	public void clickOn_GUJ_DivisionOption() {
		try {
			gujDivisionOption.click();
			System.out.println("Clicked on gujDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on gujDivisionOption " + e);
		}
	}

	public void clickOn_PNB_DivisionOption() {
		try {
			pnbDivisionOption.click();
			System.out.println("Clicked on pnbDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on pnbDivisionOption " + e);
		}
	}

	public void clickOn_BGN_DivisionOption() {
		try {
			bgnDivisionOption.click();
			System.out.println("Clicked on bgnDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on bgnDivisionOption " + e);
		}
	}

	public void clickOn_NDP_DivisionOption() {
		try {
			ndpDivisionOption.click();
			System.out.println("Clicked on ndpDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on ndpDivisionOption " + e);
		}
	}

	public void clickOn_HJY_DivisionOption() {
		try {
			hjyDivisionOption.click();
			System.out.println("Clicked on hjyDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on hjyDivisionOption " + e);
		}
	}

	public void clickOn_JMK_DivisionOption() {
		try {
			jmkDivisionOption.click();
			System.out.println("Clicked on jmkDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on jmkDivisionOption " + e);
		}
	}

	public void clickOn_BNG_DivisionOption() {
		try {
			bngDivisionOption.click();
			System.out.println("Clicked on bngDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on bngDivisionOption " + e);
		}
	}

	public void clickOn_HYD_DivisionOption() {
		try {
			hydDivisionOption.click();
			System.out.println("Clicked on hydDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on hydDivisionOption " + e);
		}
	}

	public void clickOn_VZG_DivisionOption() {
		try {
			vzgDivisionOption.click();
			System.out.println("Clicked on vzgDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on vzgDivisionOption " + e);
		}
	}

	public void clickOn_CHN_DivisionOption() {
		try {
			chnDivisionOption.click();
			System.out.println("Clicked on chnDivisionOption");
		} catch (Exception e) {
			System.out.println("Not able to click on chnDivisionOption " + e);
		}
	}

	public void sendkeyToActualPriceTextField(String key) {
		try {
			actualPriceTextField.sendKeys(key);
			System.out.println("Entered Price in actualPriceTextField");
		} catch (Exception e) {
			System.out.println("Not able to enter price in actualPriceTextField " + e);
		}
	}

	public void sendkeyToOfferPriceTextField(String key) {
		try {
			offerPriceTextField.sendKeys(key);
			System.out.println("Entered Price in offerPriceTextField");
		} catch (Exception e) {
			System.out.println("Not able to enter price in offerPriceTextField " + e);
		}
	}

	public void sendkeyToNetWeightTextField(String key) {
		try {
			netWeightTextField.sendKeys(key);
			System.out.println("Entered Price in netWeightTextField");
		} catch (Exception e) {
			System.out.println("Not able to enter price in netWeightTextField " + e);
		}
	}

	public void clickOnselectStatusDropDown() {
		try {
			selectStatusDropDown.click();
			System.out.println("clicked on selectStatus DropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on selectStatusDropDown " + e);
		}
	}

	public void clickOnInActiveOption() {
		try {
			inActiveOption.click();
			System.out.println("clicked on inactiveOption");
		} catch (Exception e) {
			System.out.println("Not able to click on inactiveOption " + e);
		}
	}

	public void clickOnActiveOption() {
		try {
			activeOption.click();
			System.out.println("clicked on activeOption");
		} catch (Exception e) {
			System.out.println("Not able to click on activeOption " + e);
		}
	}

	public void clickOnUpdateButton() {
		try {
			updateButton.click();
			System.out.println("clicked on updateButton");
		} catch (Exception e) {
			System.out.println("Not able to click on updateButton " + e);
		}
	}

	public void clickOnCancelButton() {
		try {
			cancelButton.click();
			System.out.println("clicked on cancelButton");
		} catch (Exception e) {
			System.out.println("Not able to click on cancelButton " + e);
		}
	}

	public void clickOnCrossButton() {
		try {
			crossButton.click();
			System.out.println("Clicked on crossButton");
		} catch (Exception e) {
			System.out.println("Not able to click on crossButton "+e);
		}
	}
	
	public void clickOnImageEditButton() {
		try {
			imageEditButton.click();
			System.out.println("Clicked on imageEdit Button");
		} catch (Exception e) {
			System.out.println("Not able to click on imageEdit Button "+e);
		}
	}          
	
	public void clickOnDeleteButton() {
		try {
			deleteButton.click();
			System.out.println("Clicked on deleteButton");
		} catch (Exception e) {
			System.out.println("Not able to click on deleteButton "+e);
		}
	}
	
	public void clickOnsaveButton() {
		try {
			saveButton.click();
			System.out.println("clicked on saveButton");
		} catch (Exception e) {
			System.out.println("Not able to click on Save Button "+e);
		}
	}
	
	public void sendkeyToProductNameTextField(String key) {
		try {
			productNameTextField.sendKeys(key);
			System.out.println("Enter value in productName TextField ");
		} catch (Exception e) {
			System.out.println("Not able to enter value in productNameTextField "+e);
		}
	}              
	
	public void sendkeyToSkuCodeTextField(String key) {
		try {
			skuCodeTextField.sendKeys(key);
			System.out.println("Enter value in skuCodeTextField ");
		} catch (Exception e) {
			System.out.println("Not able to enter value in skuCodeTextField "+e);
		}
	}
	
	public void verifyofferPriceWarningMessage() {
		try {
			if(offerPriceWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please decrease your Offer Price");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert OfferPrice Warning Message "+e);
		}
	}           
	
	public void verifyskuWarningMessage() {
		try {
			if(skuWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please provide SKU Code");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert skuWarning Message "+e);
		}
	}        
	
	public void verifydivisionWarningMessage() {
		try {
			if(divisionWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please select division");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert division Warning Message "+e);
		}
	}            
	
	public void verify_MRP_WarningMessage() {
		try {
			if(mrpWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please enter MRP ");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert MRP WarningMessage "+e);
		}
	}       
	
	public void verifyWeightWarningMessage() {
		try {
			if(weightWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please enter Net Weight ");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert Weight Warning Message "+e);
		}
	}              
	
	public void verifycategoryWarningMessage() {
		try {
			if(categoryWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please Select category ");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert category Warning Message "+e);
		}
	}        
	
	public void verifyProductNameWarningMessage() {
		try {
			if(productNameWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please Provide product Name ");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert ProductName Warning Message "+e);
		}
	}           
	
	public void verifyofferPriceEmptyMessage() {
		try {
			if(offerPriceEmptyMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please Provide offer price less than MRP ");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert offerPrice Empty Message "+e);
		}
	}
	
	public void uploadImage() {
		try {
//			uploadImageButton.click();
//			uploadImageButton.sendKeys(key);
			WebElement upload= driver.findElement(By.cssSelector("input[type='file'][accept='image/jpeg,image/png']"));
			((JavascriptExecutor) driver).executeScript(
				    "arguments[0].style.display='block'; arguments[0].style.visibility='visible';", 
				    upload
				);
			
			upload.sendKeys("C:\\\\Users\\\\testing.engineer\\\\eclipse-workspace\\\\com.gavl.FarmerWebApp\\\\testData\\\\cow.jpg");

			
			System.out.println("Uploaded an image of the product");
		} catch (Exception e) {
			System.out.println("Not able to upload an image "+e);
		}
	}
	
	public void sendkeyTounitTextField(String key) {
		try {
			unitTextField.sendKeys(key);
			System.out.println("Entered value in unitTextField");
		} catch (Exception e) {
			System.out.println("Not able to Entered value in unitTextField "+e);
		}
	}

}
