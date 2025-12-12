package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderOverviewPage {

	WebDriver driver;
	public OrderOverviewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Download .CSV']")
	private WebElement downloadButton;
	
	@FindBy(xpath = "//span[text()='Filter']")
	private WebElement filterOption;
	
	@FindBy(xpath = "//h2[text()='Delivered']")
	private WebElement deliveredTab;
	
	@FindBy(xpath = "//h2[text()='In Process']")
	private WebElement inProcessTab;
	
	@FindBy(xpath = "//h2[text()='Pending POD']")
	private WebElement pending_POD_Tab;
	
	@FindBy(xpath = "//h2[text()='Not Received']")
	private WebElement notReceivedTab;
	
	@FindBy(xpath = "//h2[text()='Rejected']")
	private WebElement rejectedTab;
	
	
	public void clickOnDownloadButton() {
		try {
			downloadButton.click();
			System.out.println("Clicked on downloadButton");
		} catch (Exception e) {
			System.out.println("Not able to click on downloadButton "+e);
		}
	}  
	
	
	public void clickOnFilterOption() {
		try {
			filterOption.click();
			System.out.println("Clicked on filterOption");
		} catch (Exception e) {
			System.out.println("Not able to click on filterOption "+e);
		}
	}
	
	public void clickOnDeliveredTab() {
		try {
			deliveredTab.click();
			System.out.println("Clicked on deliveredTab");
		} catch (Exception e) {
			System.out.println("Not able to click on deliveredTab "+e);
		}
	}
	
	public void clickOnInProcessTab() {
		try {
			inProcessTab.click();
			System.out.println("Clicked on InProcess Tab");
		} catch (Exception e) {
			System.out.println("Not able to click on InProcessTab "+e);
		}
	}         
	
	public void clickOnPending_POD_Tab() {
		try {
			pending_POD_Tab.click();
			System.out.println("Clicked on Pending POD Tab");
		} catch (Exception e) {
			System.out.println("Not able to click on pending POD Tab "+e);
		}
	}
	
	public void clickOnNotReceivedTab() {
		try {
			notReceivedTab.click();
			System.out.println("Clicked on NotReceived Tab");
		} catch (Exception e) {
			System.out.println("Not able to click on NotReceived Tab "+e);
		}
	}
	
	public void clickOnrejectedTab() {
		try {
			rejectedTab.click();
			System.out.println("Clicked on rejectedTab");
		} catch (Exception e) {
			System.out.println("Not able to click on rejectedTab "+e);
		}
	}
	
}
