package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceRequestPage {
	
	WebDriver driver;
	public ServiceRequestPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='flex items-center space-x-4']//span[text()='Service Requests']")
	private WebElement serviceRequestTab;

	@FindBy(xpath = "//span[text()='Filter']")
	private WebElement filterButton;
	
	@FindBy(xpath = "//h2[text()='Artificial Insemination']")
	private WebElement artificialInseminationCard;
	
	@FindBy(xpath = "//h2[text()='Loans']")
	private WebElement loanCard;
	
	@FindBy(xpath = "//h2[text()='Insurance']")
	private WebElement insuranceTab;
	
	@FindBy(xpath = "//h2[text()='Other Requests']")
	private WebElement otherRequestCard;
	
	@FindBy(xpath = "//span[text()='Export Artificial Insemination Requests']")
	private WebElement exportAI_Button;
	
	@FindBy(xpath = "//span[text()='Export Loans Requests']")
	private WebElement exportLoan_Button;
	
	@FindBy(xpath = "//span[text()='Export Insurance Requests']")
	private WebElement exportInsurance_Button;
	
	@FindBy(xpath = "//span[text()='Export Other Requests']")
	private WebElement exportOR_Button;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[11]//button[text()='Mark As Resolved?']")
	private WebElement markAsResolvedButton;
//	====================================================
	@FindBy(xpath = "//textarea[@placeholder='Enter Manager Remarks']")
	private WebElement managerRemarkTextField;
	
	@FindBy(xpath = "//button[@aria-label='Mark as Resolved']")
	private WebElement markAsResolvedButton_Two;
	
	public void clickOnFilterButton() {
		try {
			filterButton.click();
			System.out.println("Clicked on filter Button ");
		} catch (Exception e) {
			System.out.println("Not able to click on filter Button "+e);
		}
	}
	
	public void clickOnartificialInseminationCard() {
		try {
			artificialInseminationCard.click();
			System.out.println("Clicked on Artificial-Insemination Card");
		} catch (Exception e) {
			System.out.println("Not able to click on Artificial-Insemination Card "+e);
		}
	}
	
	public void clickOnloanCard() {
		try {
			loanCard.click();
			System.out.println("Clicked on loanCard ");
		} catch (Exception e) {
			System.out.println("Not able to click on loanCard "+e);
		}
	}
	
	public void clickOninsuranceTab() {
		try {
			insuranceTab.click();
			System.out.println("Clicked on InsuranceTab ");
		} catch (Exception e) {
			System.out.println("Not able to click on InsuranceTab "+e);
		}
	}
	
	public void clickOnotherRequestCard() {
		try {
			otherRequestCard.click();
			System.out.println("Clicked on Other-Request Card");
		} catch (Exception e) {
			System.out.println("Not able to click on other-Request Card "+e);
		}
	}
	
	public void clickOnexportAI_Button() {
		try {
			exportAI_Button.click();
			System.out.println("Clicked on exportAI_Button");
		} catch (Exception e) {
			System.out.println("Not able to click on exportAI_Button "+e);
		}
	}
	
	public void clikOnExportLoan_Button() {
		try {
			exportLoan_Button.click();
			System.out.println("Clicked on exportLoan_Button");
		} catch (Exception e) {
			System.out.println("Not able to click on exportLoan_Button "+e);
		}
	}
	
	public void clickOnExportInsurance_Button() {
		try {
			exportInsurance_Button.click();
			System.out.println("Clicked on exportInsurance_Button ");
		} catch (Exception e) {
			System.out.println("Not able to click on exportInsurance_Button "+e);
		}
	}
	
	public void clickOnExportOR_Button() {
		try {
			exportOR_Button.click();
			System.out.println("Clicked on exportOR_Button");
		} catch (Exception e) {
			System.out.println("Not able to click on exportOR_Button "+e);
		}
	}
	
	public void clickOnMarkAsResolvedButton() {
		try {
			markAsResolvedButton.click();
			System.out.println("Clicked on markAsResolvedButton");
		} catch (Exception e) {
			System.out.println("Not able to click on markAsResolvedButton "+e);
		}
	}
	
	public void sendkeyToManagerRemarkTextField(String key) {
		try {
			managerRemarkTextField.sendKeys(key);
			System.out.println("Entered value in ManagerRemark TextField");
		} catch (Exception e) {
			System.out.println("Not able to enter value in ManagerRemark TextField "+e);
		}
	}
	
	public void clickOnServiceRequestTab() {
		try {
			serviceRequestTab.click();
			System.out.println("Clicked on ServiceRequest Tab");
		} catch (Exception e) {
			System.out.println("Not able to click on ServiceRequest Tab "+e);
		}
	}
}
