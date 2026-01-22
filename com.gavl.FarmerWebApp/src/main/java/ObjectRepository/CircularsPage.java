package ObjectRepository;

import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CircularsPage {

	WebDriver driver;
	public CircularsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='Create New']")
	private WebElement createNewButton;
	
	@FindBy(xpath = "//span[text()='Export Circulars']")
	private WebElement exportCircularsButton;
	
	@FindBy(xpath = "//span[text()='Bulk Upload']")
	private WebElement bulkUploadButton;
	
	@FindBy(xpath = "//input[@placeholder='Search Circulars']")
	private WebElement searchCircularTextField;
	
	@FindBy(xpath = "//span[text()='Scheme']")
	private WebElement schemeDropDown;
	
	@FindBy(xpath = "[id='dropdownItem_0']")
	private WebElement allOption;
	
	@FindBy(xpath = "//span[text()='Info']")
	private WebElement info;
	
	@FindBy(xpath = "//span[text()='Alert']")
	private WebElement alert;
	
	@FindBy(xpath = "//span[text()='Training']")
	private WebElement training;
	
	@FindBy(xpath = "//input[@placeholder='Enter Circular Name']")
	private WebElement circularNameTextfield;
	
	@FindBy(xpath = "//span[text()='TEST']")
	private WebElement testDivision;
	
	@FindBy(xpath = "//span[text()='VKP']")
	private WebElement vkpDivision;
	
	@FindBy(xpath = "//span[text()='PAU']")
	private WebElement pauDivision;
	
	@FindBy(xpath = "//span[text()='ULM']")
	private WebElement ulmDivision;
	
	@FindBy(xpath = "//span[text()='GUJ']")
	private WebElement gujDivision;
	
	@FindBy(xpath = "//span[text()='PNB']")
	private WebElement pnbDivision;
	
	@FindBy(xpath = "//span[text()='BGN']")
	private WebElement bgnDivision;
	
	@FindBy(xpath = "//span[text()='NDP']")
	private WebElement ndpDivision;
	
	@FindBy(xpath = "//span[text()='HJY']")
	private WebElement hjyDivision;
	
	@FindBy(xpath = "//span[text()='JMK']")
	private WebElement jmkDivision;
	
	@FindBy(xpath = "//span[text()='BNG']")
	private WebElement bngDivision;
	
	@FindBy(xpath = "//span[text()='VZG']")
	private WebElement vzgDivision;
	
	@FindBy(xpath = "//span[text()='CHN']")
	private WebElement chnDivision;
	
	@FindBy(id= "from_date")
	private WebElement fromDate;
	
	@FindBy(id="to_date")
	private WebElement toDate;
	
	@FindBy(xpath = "//input[@placeholder='Enter External Link(If Any)']")
	private WebElement linkTextField;
	
	@FindBy(id= "uploaded_file")
	private WebElement fileUploadButton;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//button[contains(@class,'p-dialog-header-icon p-dialog-header-close p-link')]//*[name()='svg']")
	private WebElement crossButton;
	
	@FindBy(xpath = "//div[text()='Circular Name is required']")
	private WebElement circularNameWarningMessage;
	
	@FindBy(xpath = "//p[text()='At least one division is required']")
	private WebElement divisionSelectionMessage;
	
	@FindBy(xpath = "//div[text()='From Date is required']")
	private WebElement fromDateWarningMessage;
	
	@FindBy(xpath = "//div[text()='To Date is required']")
	private WebElement toDateWarningMessage;
	
	@FindBy(xpath = "//div[text()='Invalid URL format']")
	private WebElement linkErrorMessage;
	
	@FindBy(xpath = "//p[text()='Uploaded file is required']")
	private WebElement fileWarningMessage;
	
	@FindBy(xpath = "//div[contains(@class,'focus:outline-primary focus:ring-primary items-center my-auto w-14 circulars-dropdown p-dropdown p-component p-inputwrapper p-inputwrapper-filled')]//div[contains(@aria-label,'Select')]//*[name()='svg']")
	private WebElement filterDropDownButton;
	
	
	
	
	
    LocalDate today = LocalDate.now();
	LocalDate sec_date=today.plusDays(5);
    String Today = sec_date.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH));
    
    LocalDate pastdate=today.plusDays(8);  
    String formattedDate = pastdate.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH));
	
	
	
	public void selectStartDate() {
		
		fromDate.click();
		WebElement S_Date=driver.findElement(By.xpath("//div[@aria-label='"+formattedDate+"']"));
		S_Date.click();
		System.out.println(formattedDate);
	}
	
	public void select_ToDate() {
		
		toDate.click();
		WebElement To_Date=driver.findElement(By.xpath("//div[@aria-label='"+Today+"']"));
		To_Date.click();
		System.out.println(Today);
	}
	
	public void uploadImage() {
		try {
			WebElement upload= driver.findElement(By.cssSelector("input[type='file'][accept='image/jpeg,image/png']"));
			((JavascriptExecutor) driver).executeScript(
				    "arguments[0].style.display='block'; arguments[0].style.visibility='visible';", 
				    upload
				);
			
			upload.sendKeys("C:\\Users\\testing.engineer\\eclipse-workspace\\com.gavl.FarmerWebApp\\testData\\cow.jpg");

			
			System.out.println("Uploaded an image of the product");
		} catch (Exception e) {
			System.out.println("Not able to click on uploadImage "+e);
		}
	}
	
	public void clickOnTestDivision() {
		try {
			testDivision.click();
			System.out.println("Clicked on test Division");
		} catch (Exception e) {
			System.out.println("Not able to click on test Division "+e);
		}
	}
	
	public void clickOnVkpDivision() {
		try {
			vkpDivision.click();
			System.out.println("Clicked on vkpDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on vkpDivision "+e);
		}
	}
	
	public void clickOnPauDivision() {
		try {
			pauDivision.click();
			System.out.println("Clicked on pauDivision");
		} catch (Exception e) {
			System.out.println("Not able to to click on pauDivision "+e);
		}
	}
	
	public void clickOnUlmDivision() {
		try {
			ulmDivision.click();
			System.out.println("Clicked on ulmDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on ulmDivision "+e);
		}
	}
	
	public void clickOnGujDivision() {
		try {
			gujDivision.click();
			System.out.println("Clicked on gujDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on gujDivision "+e);
		}
	}
	
	public void clickOnPnbDivision() {
		try {
			pnbDivision.click();
			System.out.println("Clicked on pnbDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on pnbDivision "+e);
		}
	}
	
	public void clickOnBgnDivision() {
		try {
			bgnDivision.click();
			System.out.println("clicked on bgnDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on bgnDivision "+e);
		}
	}
	
	public void clickOnNdpDivision() {
		try {
			ndpDivision.click();
			System.out.println("Clicked on ndpDivision ");
		} catch (Exception e) {
			System.out.println("Not able to click on ndpDivision "+e);
		}
	}
	
	public void clickOnHjyDivision() {
		try {
			hjyDivision.click();
			System.out.println("Clicked on hjyDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on hjyDivision "+e);
		}
	}
	
	public void clickOnJmkDivision() {
		try {
			jmkDivision.click();
			System.out.println("Clicked on jmkDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on jmkDivision "+e);
		}
	}
	
	public void clickOnBngDivision() {
		try {
			bngDivision.click();
			System.out.println("Clicked on bngDivision");
		} catch (Exception e) {
			System.out.println("Not able too click on bngDivision "+e);
		}
	}
	
	public void clickOnVzgDivision() {
		try {
			vzgDivision.click();
			System.out.println("Clicked on vzgDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on vzgDivision "+e);
		}
	}
	
	public void clickOnChnDivision() {
		try {
			chnDivision.click();
			System.out.println("Clicked on chnDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on chnDivision "+e);
		}
	}
	
	public void clickOnCreateNewButton() {
		try {
			createNewButton.click();
			System.out.println("Clicked on CreateNew Button");
		} catch (Exception e) {
			System.out.println("Not able to click on CreateNew Button "+e);
		}
	}
	
	public void clickOnExportCircularsButton() {
		try {
			exportCircularsButton.click();
			System.out.println("Clicked on Export Circulars Button ");
		} catch (Exception e) {
			System.out.println("Not able to click on Export Circulars Button "+e);
		}
	}
	
	public void clickOnBulkUploadButton() {
		try {
			bulkUploadButton.click();
			System.out.println("Clicked on bulkUploadButton ");
		} catch (Exception e) {
			System.out.println("Not able to click on bulkUpload Button "+e);
		}
	}
	
	public void sendkeyToSearchCircularTextField(String key) {
		try {
			searchCircularTextField.sendKeys(key);
			System.out.println("entered value in Search Circular TextField");
		} catch (Exception e) {
			System.out.println("Not able to enter value in Search Circular TextField "+e);
		}
	}
	
	public void clickOnSchemeDropDown() {
		try {
			schemeDropDown.click();
			System.out.println("Clicked on scheme DropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on scheme DropDown "+e);
		}
	}
	
	public void clickOnAllOption() {
		try {
			allOption.click();
			System.out.println("Clicked on All-Option ");
		} catch (Exception e) {
			System.out.println("Not able to click on All-Option "+e);
		}
	}
	
	
	public void clickOnInfoOption() {
		try {
			info.click();
			System.out.println("Clicked on info option");
		} catch (Exception e) {
			System.out.println("Not able to click on info option "+e);
		}
	}
	
	public void clickOnAlert() {
		try {
			alert.click();
			System.out.println("Clicked on alert ");
		} catch (Exception e) {
			System.out.println("Not able to click on alert "+e);
		}
	}
	
	public void clickOnTraining() {
		try {
			training.click();
			System.out.println("Clicked on training");
		} catch (Exception e) {
			System.out.println("Not able to click on training "+e);
		}
	}
	
	public void sendkeyToCircularNameTextfield(String key) {
		try {
			circularNameTextfield.sendKeys(key);
			System.out.println("Enter value in circular Name Textfield ");
		} catch (Exception e) {
			System.out.println("Not able to enter value in circularName Textfield "+e);
		}
	}
	
	public void sendkeyToLinkTextField(String key) {
		try {
			linkTextField.sendKeys(key);
			System.out.println("Entered value in linkTextField ");
		} catch (Exception e) {
			System.out.println("Not able to enter value in linkTextField "+e);
		}
	}
	
	public void sendkeyToFileUploadButton() {
		try {
			//input[@type='file'][@accept='.pdf']
//			fileUploadButton.sendKeys(key);
//			System.out.println("Entered value in fileUpload Button");
			
			
			WebElement fileInput = driver.findElement(By.cssSelector("input[type='file'][accept='.pdf']"));

			((JavascriptExecutor) driver).executeScript(
			    "arguments[0].style.display='block'; arguments[0].style.visibility='visible';", 
			    fileInput
			);

			fileInput.sendKeys("C:\\Users\\testing.engineer\\eclipse-workspace\\com.gavl.FarmerWebApp\\testData\\TestDataForFarmerWebApp.pdf");
			
			
		} catch (Exception e) {
			System.out.println("Not able to enter value in fileUpload Button "+e);
		}
	}
	
	public void clickOnCancelButton() {
		try {
			cancelButton.click();
			System.out.println("Clciked on cancel Button ");
		} catch (Exception e) {
			System.out.println("Not able to click on cancel Button "+e);
		}
	}
	
	public void clickOnSaveButton() {
		try {
			saveButton.click();
			System.out.println("Clicked on saveButton");
		} catch (Exception e) {
			System.out.println("Not able to click on saveButton "+e);
		}
	}
	
	public void clickOnCrossButton() {
		try {
			crossButton.click();
			System.out.println("clicked on crossButton");
		} catch (Exception e) {
			System.out.println("Not able to click on crossButton "+e);
		}
	}
	
	public void verifyCircularNameWarningMessage() {
		try {
			if(circularNameWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please provide circular name ");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert circular warning message "+e);
		}
	}
	
	public void verifyDivisionSelectionMessage() {
		try {
			if(divisionSelectionMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Select Atleast one division to proceed ahead...");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert division Selection Message "+e);
		}
	}
	
	public void verifyFromDateWarningMessage() {
		try {
			if(fromDateWarningMessage.isDisplayed())
			{
				assertTrue(true);
				System.out.println("Select From-Date !!!");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert from-Date Warning Message "+e);
		}
	}
	
	public void verifyToDateWarningMessage() {
		try {
			if(toDateWarningMessage.isDisplayed())
			{
				assertTrue(true);
				System.out.println("Select To-Date !!! ");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert To-Date Warning Message "+e);
		}
	}
	
	public void verifylinkErrorMessage() {
		try {
			if(linkErrorMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please provide Link in proper formate");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert Link Error Message "+e);
		}
	}
	
	public void verifyfileWarningMessage() {
		try {
			if(fileWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please upload PDF file to proceed further");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert File Warning Message "+e);
		}
	}
	
	public void clickOnfilterDropDownButton() {
		try {
			filterDropDownButton.click();
			System.out.println("Clicked on filter DropDown Button");
		} catch (Exception e) {
			System.out.println("Not able to click on filter DropDown Button "+e);
		}
	}
}
