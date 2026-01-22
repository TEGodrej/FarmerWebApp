package GenericUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.BannerPage;
import ObjectRepository.CattelReportPage;
import ObjectRepository.CircularsPage;
import ObjectRepository.EditProductPage;
import ObjectRepository.FilterPage;
import ObjectRepository.LoginPage;
import ObjectRepository.OrderOverviewPage;
import ObjectRepository.ProductOverviewPage;
import ObjectRepository.ServiceRequestPage;

/**
 * This class is being used for start the appium server and to activate app
 *@author DivyaPrakashAmar
 */

public class BaseClass {
	
	public static WebDriver driver;
	public  Driverutility driverUtility;
	public  FileUtility fileUtility;
	public  ListenerUtility listenerUtility;
	public  ExcelUtility excelUtility;
	public  LoginPage   loginPage;
	public  ProductOverviewPage productOverviewPage;
	public  FilterPage  filterPage;
	public EditProductPage editProductPage;
	public OrderOverviewPage orderOverviewPage;
	public BannerPage  bannerPage;
	public CircularsPage circularsPage;
	public CattelReportPage cattelReportPage;
	public ServiceRequestPage serviceRequestPage;
	

	/**
	 *This method is used for starting the app in Chrome Browser
	 *
	 */
		@BeforeMethod
		public void startApp() throws IOException {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://uatcdplfarmerapp.godrejagrovet.com/");
			
			driverUtility        = new Driverutility();
			fileUtility          = new FileUtility();
			listenerUtility      = new ListenerUtility();
			excelUtility         = new ExcelUtility();
			loginPage            = new LoginPage(driver);
			productOverviewPage  = new ProductOverviewPage(driver);
			filterPage           = new FilterPage(driver);
			editProductPage      = new EditProductPage(driver);
			orderOverviewPage    = new OrderOverviewPage(driver);
			bannerPage           = new BannerPage(driver);
			circularsPage        = new CircularsPage(driver);
			cattelReportPage     = new CattelReportPage(driver);
			serviceRequestPage   = new ServiceRequestPage(driver);
		}
		
		/**
		 * This method is use to close the app and web browser
		 */
		@AfterMethod
		public void closeApp() throws IOException {
			driver.close();
			driver.quit();
		}
		
	}


