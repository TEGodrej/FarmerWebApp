package ObjectRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage {

	WebDriver driver;
	public FilterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement startDateCalender;
	
	@FindBy(id= "end_date")
	private WebElement endDateCalender;
	
	@FindBy(xpath = "//span[text()='CHN']")
	private WebElement chennaiDivision;
	
	@FindBy(xpath = "//span[text()='VZG']")
	private WebElement vzgDivision;
	
	@FindBy(xpath = "//span[text()='Select CC']")
	private WebElement select_CC_DropDown;
	
	@FindBy(xpath = "//span[text()='Batajangalapalem Packing Stati']")
	private WebElement first_CC_Option;
	
	@FindBy(xpath = "//span[text()='Naidumangalam']")
	private WebElement second_CC_Option;
	
	@FindBy(xpath = "//span[text()='Vandavasi']")
	private WebElement third_CC_Option;
	
	@FindBy(xpath = "//span[text()='Select DFP']")
	private WebElement select_DFP_DropDown;
	
	@FindBy(xpath = "//span[text()='ARUNKUMAR G']")
	private WebElement firstName;
	
	@FindBy(xpath = "//span[text()='KASETTY KIRAN KUMAR']")
	private WebElement secondName;
	
	@FindBy(xpath = "//span[text()='RANGANATHAN T']")
	private WebElement thirdName;
	
	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement applyButton;
	
	@FindBy(xpath = "//span[text()='Clear']")
	private WebElement clearButton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/*[name()='svg'][1]/*[name()='use'][1]")
	private WebElement crossButton;
	
//	=======================================================================================================================
	
	@FindBy(xpath = "//span[text()='Select Plant ']")
	private WebElement selectPlantDropDown;
	
	@FindBy(xpath = "//span[text()=' Anaicut (1209)']")
	private WebElement anaicutOption;
	
	@FindBy(xpath = "//span[text()='Gotlam']")
	private WebElement gotlamOption;
	
	@FindBy(xpath = "//span[text()='Naidumangalam']")
	private WebElement naidumangalamOption;
	
	@FindBy(xpath = "//span[text()='Batajangalapalem Packing Stati']")
	private WebElement batajangalpalemOption;
	
	@FindBy(xpath = "//span[text()='Select DFP']")
	private WebElement selectDFP_DropDown;
	
	@FindBy(xpath = "//span[text()='KARAKA DEVI']")
	private WebElement dfp_Option_one;
	
	@FindBy(xpath = "//span[text()='SARANYA R']")
	private WebElement dfp_option_two;
	
//	=============================================================================================
	
	@FindBy(xpath = "//span[text()='Select Issue Type']")
	private WebElement selectIssueTypeDropDown;
	
	@FindBy(xpath = "//span[text()='Payment Discrepancy']")
	private WebElement paymentDiscrepencyOption;
	
	@FindBy(xpath = "//span[text()='Cattle Health']")
	private WebElement cattleHealthOption;
	
	@FindBy(xpath = "//span[text()='Feed Supply Status']")
	private WebElement feedSupplyStatusOption;
	
	@FindBy(xpath = "//span[text()='Other']")
	private WebElement otherOption;
//	==========================================================================================================
	
	@FindBy(xpath = "//input[@placeholder='Enter Service ID']")
	private WebElement serviceIdTextfield;
	
	@FindBy(xpath = "//input[@placeholder='Enter Farmer Code']")
	private WebElement farmerCodeTextfield;
	

    LocalDate today = LocalDate.now();
	
    String Today = today.format(DateTimeFormatter.ofPattern("dd", Locale.ENGLISH));
    
    LocalDate pastdate=today.minusDays(10);  
    String formattedDate = pastdate.format(DateTimeFormatter.ofPattern("d", Locale.ENGLISH));
	
	
	
	public void selectStartDate() {
		WebElement S_Date=driver.findElement(By.xpath("//span[text()='"+formattedDate+"']"));////div[@aria-label='"+formattedDate+"']
		S_Date.click();
		System.out.println(formattedDate);
	}
	
	public void select_ToDate() {
		WebElement To_Date=driver.findElement(By.xpath("//span[text()='"+Today+"']"));
		To_Date.click();
		System.out.println(Today);
	}
	
	public void clickOnStartDateCalender() {
		try {
			startDateCalender.click();
			System.out.println("clicked on startDateCalender");
		} catch (Exception e) {
			System.out.println("Not able ti click on startDateCalender "+e);
		}
	}
	
	public void clickOnendDateCalender() {
		try {
			endDateCalender.click();
			System.out.println("Clicked on endDate");
		} catch (Exception e) {
			System.out.println("Not able to click on endDateCalender "+e);
		}
	}
	
	public void clickOnChennaiDivision() {
		try {
			chennaiDivision.click();
			System.out.println("Clicked on Chennai Division");
		} catch (Exception e) {
			System.out.println("Not able to click on Chennai Division "+e);
		}
	}
	
	public void clickOn_VZG_Division() {
		try {
			vzgDivision.click();
			System.out.println("Clicked on vzgDivision");
		} catch (Exception e) {
			System.out.println("Not able to click on vzgDivision "+e);
		}
	}
	
	public void clickOnSelect_CC_DropDown() {
		try {
			select_CC_DropDown.click();
			System.out.println("Clicked on select_CC_DropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on select_CC_DropDown "+e);
		}
	}
	
	public void clickOnFirst_CC_Option() {
		try {
			first_CC_Option.click();
			System.out.println("Selcted first CC_Option ");
		} catch (Exception e) {
			System.out.println("Not able to select first CC_Option "+e);
		}
	}
	
	public void clickOnSecond_CC_Option() {
		try {
			second_CC_Option.click();
			System.out.println("Selected second CC_Option");
		} catch (Exception e) {
			System.out.println("Not able to select second CC_Option "+e);
		}
	}
	
	public void clickOnThird_CC_Option() {
		try {
			third_CC_Option.click();
			System.out.println("Selected Third CC_Option");
		} catch (Exception e) {
			System.out.println("Not able to select Third CC_Option "+e);
		}
	}
	
	public void clickOnSelect_DFP_DropDown() {
		try {
			select_DFP_DropDown.click();
			System.out.println("Clicked on select_DFP_DropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on select_DFP_DropDown "+e);
		}
	}
	
	public void clickOnFirstName() {
		try {
			firstName.click();
			System.out.println("Selected ARUNKUMAR G name ");
		} catch (Exception e) {
			System.out.println("Not able to select ARUNKUMAR G name "+e);
		}
	}
	
	public void clickOnSecondName() {
		try {
			secondName.click();
			System.out.println("Selected KASETTY KIRAN KUMAR name");
		} catch (Exception e) {
			System.out.println("Not able to select KASETTY KIRAN KUMAR name "+e);
		}
	}
	
	public void clickOnThirdName() {
		try {
			thirdName.click();
			System.out.println("Selected RANGANATHAN T name ");
		} catch (Exception e) {
			System.out.println("Not able to select RANGANATHAN T "+e);
		}
	}
	
	public void clickOnApplyButton() {
		try {
			applyButton.click();
			System.out.println("Clicked on Apply Button");
		} catch (Exception e) {
			System.out.println("Not able to click on applyButton "+e);
		}
	}
	
	public void clickOnClearButton() {
		try {
			clearButton.click();
			System.out.println("Clicked on Clear Button");
		} catch (Exception e) {
			System.out.println("Not able to click on clearButton "+e);
		}
	}
	
	public void clickOncrossButton() {
		try {
			crossButton.clear();
			System.out.println("Clicked on Cross Button");
		} catch (Exception e) {
			System.out.println("Not able to click on Cross Button"+e);
		}
	}
	
	public void clickOnSelectPlantDropDown() {
		try {
			selectPlantDropDown.click();
			System.out.println("Clicked on selectPlant DropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on selectPlant DropDown "+e);
		}
	}
	
	public void clickOnAnaicutOption() {
		try {
			anaicutOption.click();
			System.out.println("Clicked on anaicutOption ");
		} catch (Exception e) {
			System.out.println("Not able to click on anaicutOption "+e);
		}
	}
	
	public void  clickOnGotlamOption() {
		try {
			gotlamOption.click();
			System.out.println("Clicked on Gotlam Option");
		} catch (Exception e) {
			System.out.println("Not able to click on gotlamOption "+e);
		}
	}
	
	public void clikOnNaidumangalamOption() {
		try {
			naidumangalamOption.click();
			System.out.println("Clicked on Naidumangalam Option");
		} catch (Exception e) {
			System.out.println("Not able to click on naidumangalamOption "+e);
		}
	}
	
	public void clickOnSelectDFP_DropDown() {
		try {
			selectDFP_DropDown.click();
			System.out.println("Clicked on selectDFP_DropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on selectDFP_DropDown "+e);
		}
	}
	
	public void clickOnDFP_Option_one() {
		try {
			dfp_Option_one.click();
			System.out.println("Clicked on dfp_Option_one");
		} catch (Exception e) {
			System.out.println("Not able to click on dfp_Option_one "+e);
		}
	}
	
	public void clickOnDFP_option_two() {
		try {
			dfp_option_two.click();
			System.out.println("Clicked on dfp_option_two");
		} catch (Exception e) {
			System.out.println("Not able to click on dfp_option_two "+e);
		}
	}
	
	public void clickOnSelectIssueTypeDropDown() {
		try {
			selectIssueTypeDropDown.click();
			System.out.println("Clicked on Select Issue Type DropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on Select Issue Type DropDown "+e);
		}
	}
	
	public void clickOnPaymentDiscrepencyOption() {
		try {
			paymentDiscrepencyOption.click();
			System.out.println("Selected PaymentDiscrepency Option");
		} catch (Exception e) {
			System.out.println("Not able to select Payment Discrepency Option "+e);
		}
	}
	
	public void clickOnCattleHealthOption() {
		try {
			cattleHealthOption.click();
			System.out.println("Selected Cattle Health Option");
		} catch (Exception e) {
			System.out.println("Not able to select Cattle Health Option "+e);
		}
	}
	
	public void clickOnfeedSupplyStatusOption() {
		try {
			feedSupplyStatusOption.click();
			System.out.println("Selected Feed Supply Status Option");
			} catch (Exception e) {
			System.out.println("Not able to select Feed Supply Status Option "+e);
		}
	}
	
	public void clickOnotherOption() {
		try {
			otherOption.click();
			System.out.println("Selected 'Other' Option");
		} catch (Exception e) {
			System.out.println("Not able to click on 'other' Option "+e);
		}
	}
	
	public void sendkeyToServiceIdTextfield(String key) {
		try {
			serviceIdTextfield.sendKeys(key);
			System.out.println("Entered value in serviceId Textfield");
		} catch (Exception e) {
			System.out.println("Not able to enter value into serviceId Textfield "+e);
		}
	}
	
	public void sendkeyToFarmerCodeTextfield(String key) {
		try {
			farmerCodeTextfield.sendKeys(key);
			System.out.println("Entered value into farmerCode Textfield");
		} catch (Exception e) {
			System.out.println("Not able to enter value into farmerCode Textfield "+e);
		}
	}
}
