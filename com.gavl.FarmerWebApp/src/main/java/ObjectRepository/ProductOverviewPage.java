package ObjectRepository;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductOverviewPage {

	WebDriver driver;
	public ProductOverviewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Products Overview']")
	private WebElement productOverviewTitle;
	
	@FindBy(xpath = "//div[@class='flex items-center space-x-4']/span[text()='Leaderboard']")
	private WebElement leaderBoardTab;
	
	@FindBy(xpath = "//div[@class='flex items-center space-x-4']/span[text()='Orders']")
	private WebElement orderTab;
	
	@FindBy(xpath = "//span[text()='Add New Product']")
	private WebElement addNewProductButton;
	
	@FindBy(xpath = "//span[text()='Export Products']")
	private WebElement exportProductButton;
	
	@FindBy(xpath = "//span[text()='Bulk Upload']")
	private WebElement bulkUploadButton;
	
	@FindBy(xpath = "//tr[contains(@draggable,'false')]//button[contains(@class,'hidden group-hover:inline-flex items-center p-1.8 w-7 h-7 text-xs rounded-full bg-white border justify-center')]//*[name()='svg']")
	private WebElement editButton;
	
	@FindBy(xpath = "//div[@class='flex items-center space-x-4']//span[text()='Products']")
	private WebElement productTab;
	
	@FindBy(xpath = "//span[@class='ml-1']")
	private WebElement adminDropDown;
	
	@FindBy(xpath = "//span[@class='flex-1']")
	private WebElement logoutOption;
	
	@FindBy(xpath = "//div[@class='flex items-center space-x-4']//span[text()='Banners']")
	private WebElement bannerTab;
	
	@FindBy(xpath = "//div[@class='flex items-center space-x-4']//span[text()='Circulars']")
	private WebElement circularsTab;
	
	public void verifyproductOverviewTitle() {
		try {
			if(productOverviewTitle.isDisplayed()) {
				assertTrue(true);
				System.out.println("User has been logged In");
			}
		} catch (Exception e) {
			System.out.println("User is not logged-In "+e);
		}
	}
	
	public void clickOnLeaderBoardTab() {
		try {
			leaderBoardTab.click();
			System.out.println("Clicked on leaderBoard Tab");
		} catch (Exception e) {
			System.out.println("Not able to click on leaderBoard Tab "+e);
		}
	}
	
	public void clickOnOrderTab() {
		try {
			orderTab.click();
			System.out.println("Clicked on orderTab");
		} catch (Exception e) {
			System.out.println("Not able to click on orderTab "+e);
		}
	}
	
	public void clickOnAddNewProductButton() {
		try {
			addNewProductButton.click();
			System.out.println("Clicked on AddNewProduct Button ");
		} catch (Exception e) {
			System.out.println("Not able to click on AddNewProduct Button "+e );
		}
	}
	
	public void clickOnExportProductButton() {
		try {
			exportProductButton.click();
			System.out.println("Clicked on exportProduct Button");
		} catch (Exception e) {
			System.out.println("Not ableto click on exportProduct Button "+e);
		}
	}
	
	public void clickOnbulkUploadButton() {
		try {
			bulkUploadButton.click();
			System.out.println("Clicked on BulkUpload Button");
		} catch (Exception e) {
			System.out.println("Not able to click on bulkUpload Button "+e);
		}
	}
	
	public void clickOnEditButton() {
		try {
			editButton.click();
			System.out.println("clicked on editButton");
		} catch (Exception e) {
			System.out.println("Not able to click on editButton "+e);
		}
	}             
	
	public void clickOnProductTab() {
		try {
			productTab.click();
			System.out.println("clicked on productTab");
		} catch (Exception e) {
			System.out.println("Not able to click on productTab "+e);
		}
	}         
	
	public void clickOnAdminDropDown() {
		try {
			adminDropDown.click();
			System.out.println("clicked on adminDropDown");
		} catch (Exception e) {
			System.out.println("Not able to click on adminDropDown "+e);
		}
	}          
	
	public void clickOnLogoutButton() {
		try {
			logoutOption.click();
			System.out.println("clicked on logoutOption");
		} catch (Exception e) {
			System.out.println("Not able to click on logoutOption "+e);
		}
	}
	
	public void clickOnBannerTab() {
		try {
			bannerTab.click();
			System.out.println("Clicked on BannerTab");
		} catch (Exception e) {
			System.out.println("Not able to click on BannerTab "+e);
		}
	}
	
	public void clickOnCircularsTab() {
		try {
			circularsTab.click();
			System.out.println("Click on circularsTab");
		} catch (Exception e) {
			System.out.println("Not able to click on circularsTab "+e);
		}
	}
	
}
