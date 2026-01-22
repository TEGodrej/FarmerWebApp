package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CattelReportPage {
	
	WebDriver driver;
	
	public CattelReportPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='flex items-center space-x-4']//span[text()='Cattle Report']")
	private WebElement cattleReportTab;
	
	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'flex flex-col h-screen w-full bg-gradient-main overflow-auto')]/div[contains(@class,'flex flex-grow mt-4 overflow-scroll md:overflow-hidden md:p-4 mh-800:p-3 md:px-4 md:py-3')]/main[contains(@class,'max-w-full min-w-[200px]')]/div[contains(@class,'h-auto md:h-full w-full rounded-primaryBorderRadius flex flex-col overflow-y-scroll md:overflow-hidden')]/div[contains(@class,'grid grid-cols-1 sm:grid-cols-4 gap-4 my-4 w-full')]/div[2]/div[1]")
	private WebElement cowDetailsTab;
	
	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'flex flex-col h-screen w-full bg-gradient-main overflow-auto')]/div[contains(@class,'flex flex-grow mt-4 overflow-scroll md:overflow-hidden md:p-4 mh-800:p-3 md:px-4 md:py-3')]/main[contains(@class,'max-w-full min-w-[200px]')]/div[contains(@class,'h-auto md:h-full w-full rounded-primaryBorderRadius flex flex-col overflow-y-scroll md:overflow-hidden')]/div[contains(@class,'grid grid-cols-1 sm:grid-cols-4 gap-4 my-4 w-full')]/div[3]/div[1]")
	private WebElement buffaloDetailsTab;
	
	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'flex flex-col h-screen w-full bg-gradient-main overflow-auto')]/div[contains(@class,'flex flex-grow mt-4 overflow-scroll md:overflow-hidden md:p-4 mh-800:p-3 md:px-4 md:py-3')]/main[contains(@class,'max-w-full min-w-[200px]')]/div[contains(@class,'h-auto md:h-full w-full rounded-primaryBorderRadius flex flex-col overflow-y-scroll md:overflow-hidden')]/div[contains(@class,'grid grid-cols-1 sm:grid-cols-4 gap-4 my-4 w-full')]/div[4]/div[1]")
	private WebElement calvesDetailsTab;
	
	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'flex flex-col h-screen w-full bg-gradient-main overflow-auto')]/div[contains(@class,'flex flex-grow mt-4 overflow-scroll md:overflow-hidden md:p-4 mh-800:p-3 md:px-4 md:py-3')]/main[contains(@class,'max-w-full min-w-[200px]')]/div[contains(@class,'h-auto md:h-full w-full rounded-primaryBorderRadius flex flex-col overflow-y-scroll md:overflow-hidden')]/div[contains(@class,'grid grid-cols-1 sm:grid-cols-4 gap-4 my-4 w-full')]/div[1]/div[1]")
	private WebElement totalTab;
	
	@FindBy(xpath = "//span[text()='Export Cattle Report']")
	private WebElement exportCattleReport;
	
	@FindBy(xpath = "//table//tbody/tr[1]//td[11]")
	private WebElement actionTab;
	
	@FindBy(xpath = "//span[text()='Filter']")
	private WebElement filterButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchTextfield;
	
	
	public void clickOnCattleReportTab() {
		try {
			cattleReportTab.click();
			System.out.println("Clicked on Cattle Report Tab");
		} catch (Exception e) {
			System.out.println("Not able to click on Cattle Report Tab "+e);
		}
	}
	
	public void clickOnCowDetailsTab() {
		try {
			cowDetailsTab.click();
			System.out.println("Clicked on Cow Details Tab");
		} catch (Exception e) {
			System.out.println("Not able to click on Cow Details Tab "+e);
		}
	}
	
	public void clickOnBuffaloDetailsTab() {
		try {
			buffaloDetailsTab.click();
			System.out.println("Clicked on Buffalo Details Tab");
		} catch (Exception e) {
			System.out.println("Not able to click on Buffalo Details Tab "+e);
		}
	}
	
	public void clickOnCalvesDetailsTab() {
		try {
			calvesDetailsTab.click();
			System.out.println("Clicked on Calves Details Tab ");
		} catch (Exception e) {
			System.out.println("Not able to click on Calves Details Tab "+e);
		}
	}
	
	public void clickOnTotalTab() {
		try {
			totalTab.click();
			System.out.println("Clicked on TotalTab");
		} catch (Exception e) {
			System.out.println("Not able to click on TotalTab "+e);
		}
	}
	
	public void clickOnexportCattleReport() {
		try {
			exportCattleReport.click();
			System.out.println("Clicked on ExportCattleReport ");
		} catch (Exception e) {
			System.out.println("Not able to click on exportCattleReport "+e);
		}
	}
	
	public void clickOnFilterButton() {
		try {
			filterButton.click();
			System.out.println("Clicked on filterButton ");
		} catch (Exception e) {
			System.out.println("Not able to click on filterButton "+e);
		}
	}
	
	public void sendkeyToSearchTextfield(String key) {
		try {
			searchTextfield.sendKeys(key);
			System.out.println("Entered value in Search Textfield "+ searchTextfield.getText());
		} catch (Exception e) {
			System.out.println("Not able to enter value in Search Textfield "+e);
		}
	}
}
