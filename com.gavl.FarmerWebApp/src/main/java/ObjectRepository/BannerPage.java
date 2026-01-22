package ObjectRepository;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BannerPage {

	WebDriver driver;
	public BannerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='Create New']")
	private WebElement createNewButton;
	
	@FindBy(xpath = "//span[text()='Export Banners']")
	private WebElement exportBannerButton;
	
	@FindBy(xpath = "//span[text()='Bulk Upload']")
	private WebElement bulkUploadButton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[7]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/button[1]/*[name()='svg'][1]/*[name()='use'][1]")
	private WebElement editButton;
	
	@FindBy(css = "//input[@type='file'][@accept='image/jpeg,image/png']")
	private WebElement uploadImage;
	
	@FindBy(xpath = "//input[@placeholder='Enter Banner Name']")
	private WebElement bannerNameTextField;
	
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
	
	@FindBy(xpath = "//span[text()='BNG']")
	private WebElement bng1Division;
	
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
	
	@FindBy(id="from_date")
	private WebElement fromDateCalendar;
	
	@FindBy(id = "to_date")
	private WebElement toDateCalendar;
	
	@FindBy(xpath = "//input[@placeholder='Enter External Link(If Any)']")
	private WebElement imageLinkTextField;
	
	@FindBy(xpath = "//span[text()='No']")
	private WebElement noConfirmation;
	
	@FindBy(xpath = "//span[text()='Yes']")
	private WebElement yesConfirmation;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveButton; 
	
	@FindBy(xpath = "//label[text()='To be used for welcome message ?']")
	private WebElement welcomeTitle;
	
	@FindBy(xpath = "//p[text()='At least one division is required']")
	private WebElement divisionErrorMessage;
	
	@FindBy(xpath = "//div[text()='From Date is required']")
	private WebElement fromDateWarningMessage;
	
	@FindBy(xpath = "//div[text()='To Date is required']")
	private WebElement toDateWarningMessage;
	
	@FindBy(xpath = "//div[text()='Banner Name is required']")
	private WebElement  bannerNameWarningMessage; 
	
	public  WebElement getwelcomeTitle() {
		return welcomeTitle;
	}
	
	
	
	public void clickOnCreateNewButton() {
		try {
			createNewButton.click();
			System.out.println("Cliked on createNewButton");
		} catch (Exception e) {
			System.out.println("Not able to click on createNewButton "+e);
		}
	}
	
	public void clickOnExportBannerButton() {
		try {
			exportBannerButton.click();
			System.out.println("Clicked on Export Banner Button");
		} catch (Exception e) { 
			System.out.println("Not able to click on Export Banner Button "+e);
		}
	}
	
	public void clickOnbulkUploadButton() {
		try {
			bulkUploadButton.click();
			System.out.println("Clicked on bulk Upload Button");
		} catch (Exception e) {
			System.out.println("Not able to click on bulkUpload Button "+e);
		}
	}
	
	public void clickOneditButton() {
		try {
			editButton.click();
			System.out.println("Clicked on editButton");
		} catch (Exception e) {
			System.out.println("Not able to click on editButton "+e);
		}
	}
	
	public void sendkeyToBannerNameTextField(String key) {
		try {
			bannerNameTextField.sendKeys(key);
			System.out.println("Entered value in BannerName TextField");
		} catch (Exception e) {
			System.out.println("Not able to enter value in BannerName TextField "+e);
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
	
	public void clickOnBNGDivision() {
		try {
			bng1Division.click();
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
	
	public void clickOnhjyDivision() {
		try {
			hjyDivision.click();
			System.out.println("Clicked on hjyDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on hjyDivision "+e);
		}
	}
	
	public void clickOnjmkDivision() {
		try {
			jmkDivision.click();
			System.out.println("Clicked on jmkDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on jmkDivision "+e);
		}
	}
	
	public void clickOnbngDivision() {
		try {
			bngDivision.click();
			System.out.println("Clicked on bngDivision");
		} catch (Exception e) {
			System.out.println("Not able too click on bngDivision "+e);
		}
	}
	
	public void clickOnvzgDivision() {
		try {
			vzgDivision.click();
			System.out.println("Clicked on vzgDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on vzgDivision "+e);
		}
	}
	
	public void clickOnchnDivision() {
		try {
			chnDivision.click();
			System.out.println("Clicked on chnDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on chnDivision "+e);
		}
	}
	
	
	LocalDate today = LocalDate.now(ZoneId.of("Asia/Kolkata"));
	
    LocalDate futureDate = today.plusDays(5);
    int Day=today.getDayOfMonth();
    int day=futureDate.getDayOfMonth();
    
	public void selectFromStartDate() {
		try {
			fromDateCalendar.click();
			WebElement date=driver.findElement(By.xpath("//div[@class='rs-calendar-table-cell rs-calendar-table-cell-is-today rs-calendar-table-cell-selected']//span[text()='"+Day+"']"));
			date.click();
			System.out.println("Selected FromDate "+Day);
		} catch (Exception e) {
			System.out.println("Not able to select "+Day +e);
		}
	}
	
	public void selectToDate() {
		try {
			toDateCalendar.click();
			Thread.sleep(Duration.ofSeconds(4));
			WebElement date=driver.findElement(By.xpath("//div[contains(@class,'rs-calendar-table-cell')]//span[text()='" + day + "']"));
			date.click();
			System.out.println("Selected todate "+day);
		} catch (Exception e) {
			System.out.println("Not able to select todate"+day +e);
		}
	}
	
	public void sendKeyToimageLinkTextField(String key) {
		try {
			imageLinkTextField.sendKeys(key);
			System.out.println("Entered link in imageLink TextField");
		} catch (Exception e) {
			System.out.println("Not able to enter link in imageLink TextField "+e);
		}
	}
	
	public void clickOnNoConfirmation() {
		try {
			noConfirmation.click();
			System.out.println("Clicked on No_Confirmation Option");
		} catch (Exception e) {
			System.out.println("Not able to click on No_Confirmation option "+e);
		}
	}
	
	public void clickOnYesConfirmation() {
		try {
			yesConfirmation.click();
			System.out.println("Clicked on yesConfirmation");
		} catch (Exception e) {
			System.out.println("Not able to click on yesConfirmation "+e);
		}
	}
	
	public void clickOnCancelButton() {
		try {
			cancelButton.click();
			System.out.println("Clicked on cancelButton");
		} catch (Exception e) {
			System.out.println("Not able to click on cancelButton "+e);
		}
	}
	
	public void clickOnSaveButton() {
		try {
			saveButton.click();
			System.out.println("Clicked on saveButton ");
		} catch (Exception e) {
			System.out.println("Not able to click on saveButton "+e);
		}
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
	
	public void verifyDivisionErrorMessageDisplay() {
		try {
			if (divisionErrorMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please select atleast one division");
			}
		} catch (Exception e) {
			System.out.println("Division is selected "+e);
		}
	}
	
	public void verifyFromDateWarningMessageDisplay() {
		try {
			if(fromDateWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please select fromDate ");
			}
		} catch (Exception e) {
			System.out.println("From-Date selection error "+e);
		}
	}
	
	public void verifytoDateWarningMessageDisplay() {
		try {
			if(toDateWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please select To-Date ");
			}
		} catch (Exception e) {
			System.out.println("To-Date error Message "+e);
		}
	}
	
	public void verifyBannerNameWarningMessageDisplay() {
		try {
			if(bannerNameWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("Please provide name for your banner");
			}
		} catch (Exception e) {
			System.out.println("Not able to assert message "+e);
		}
		
	}
}
