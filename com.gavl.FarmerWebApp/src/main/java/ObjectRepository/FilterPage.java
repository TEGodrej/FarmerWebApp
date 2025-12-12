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
	
	
	@FindBy(xpath = "//input[@id='start_date']")
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
	

    LocalDate today = LocalDate.now();
	
    String Today = today.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH));
    
    LocalDate pastdate=today.minusDays(5);  
    String formattedDate = pastdate.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH));
	
	
	
	public void selectStartDate() {
		WebElement S_Date=driver.findElement(By.xpath("//div[@aria-label='"+formattedDate+"']"));
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
}
