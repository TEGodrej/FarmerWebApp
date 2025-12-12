package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPage {

	
	WebDriver driver;
	public CreateNewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter Banner Name']")
	private WebElement bannerNameTextField;
	
	@FindBy(xpath = "//span[text()='TEST']")
	private WebElement testDivision;
	
	@FindBy(xpath = "//span[text()='VKP']")
	private WebElement vkpDivision;
	
	@FindBy(xpath = "//span[text()='PAL']")
	private WebElement palDivision;
	
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
	
	@FindBy(xpath = "//span[text()='HYD']")
	private WebElement hydDivision;
	
	@FindBy(xpath = "//span[text()='VZG']")
	private WebElement vzgDivision;
	
	@FindBy(xpath = "//span[text()='CHN']")
	private WebElement chnDivision;
	
	@FindBy(xpath = "id='from_date'")
	private WebElement fromDateCalendar;
	
	@FindBy(xpath = "id='to_date'")
	private WebElement toDateCalendar;
	
	@FindBy(xpath = "//input[@placeholder='Enter External Link(If Any)']")
	private WebElement imageLinkTextField;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//button[@id='«r2q»']//*[name()='svg']")
	private WebElement imageEditButton;
	
	@FindBy(xpath = "//button[@aria-label='Close']//*[name()='svg']")
	private WebElement closeButton;
	
}
