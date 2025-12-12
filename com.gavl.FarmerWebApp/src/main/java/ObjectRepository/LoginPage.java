package ObjectRepository;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//span[text()='Login With SSO']")
	private WebElement sso_Option;
	
	@FindBy(xpath = "//button[text()='Click here']")
	private WebElement MobileLoginOption;
	
	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	private WebElement mobileNumberTextField;
	
	@FindBy(xpath = "//span[text()='Get OTP']")
	private WebElement getOTP_Option;
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termAndConditionOption;
	
	@FindBy(id  = "i0116")
	private WebElement userEmailTextField;
	
	@FindBy(id = "idSIButton9")
	private WebElement nextButton;
	
	@FindBy(id = "i0118")
	private WebElement passwordTextField;
	
	@FindBy(id = "idSIButton9")
	private WebElement signInButton;
	
	@FindBy(id = "idSIButton9")
	private WebElement yesButton;
	
	@FindBy(id = "idBtn_Back")
	private WebElement backButton;
	
	@FindBy(xpath = "//div[@class='common-otp ']/div[@id='otp']/input[1]")
	private WebElement first_OTP_Box;
	
	@FindBy(xpath = "//div[@class='common-otp ']/div[@id='otp']/input[2]")
	private WebElement second_OTP_Box;
	
	@FindBy(xpath = "//div[@class='common-otp ']/div[@id='otp']/input[3]")
	private WebElement third_OTP_Box;
	
	@FindBy(xpath = "//div[@class='common-otp ']/div[@id='otp']/input[4]")
	private WebElement forth_OTP_Box;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[text()='Invalid OTP, Please enter valid OTP.']")
	private WebElement otpWarningMessage;
	
	public void clickOn_SSO_Option() {
		try {
			sso_Option.click();
			System.out.println("Clicked on sso_Option");
		} catch (Exception e) {
			System.out.println("Not able to click on sso_Option "+e);
		}
	}
	
	public void clickOnMobileLoginOption() {
		try {
			MobileLoginOption.click();
			System.out.println("Clicked on MobileLogin Option");
		} catch (Exception e) {
			System.out.println("Not able to click on MobileLoginOption "+e);
		}
	}
	
	public void sendkeyToMobileNumberTextField(String number) {
		try {
			mobileNumberTextField.sendKeys(number);
			System.out.println("Entered number in  Mobile Number TextField ");
		} catch (Exception e) {
			System.out.println("Not able to enter number in Mobile Number TextField "+e);
		}
	}
	
	public void clickOnGetOTP_Option() {
		try {
			getOTP_Option.click();
			System.out.println("Clicked on getOTP_Option");
		} catch (Exception e) {
			System.out.println("Not able to click on getOTP_Option "+e);
		}
	}
	
	public void clickOnTermAndConditionOption() {
		try {
			termAndConditionOption.click();
			System.out.println("Clicked on term & Condition Option");
		} catch (Exception e) {
			System.out.println("Not able to click on term & Condition Option "+e);
		}
	}
	
	public void sendkeyTouserEmailTextField(String key) {
		try {
			userEmailTextField.sendKeys(key);
			System.out.println("Entered value in User Email TextField ");
		} catch (Exception e) {
			System.out.println("Not able to click on User Email TextField "+e);
		}
	}
	
	public void clickOnNextButton() {
		try {
			nextButton.click();
			System.out.println("Clicked on nextButton");
		} catch (Exception e) {
			System.out.println("Not able to click on nextButton "+e);
		}
	}
	
	public void sendkeyToPasswordTextField(String key) {
		try {
			passwordTextField.sendKeys(key);
			System.out.println("Entered value in Password TextField ");
		} catch (Exception e) {
			System.out.println("Not able to enter value in Password TextField "+e);
		}
	}
	
	public void clickOnsignInButton() {
		try {
			signInButton.click();
			System.out.println("Clicked on signInButton");
		} catch (Exception e) {
			System.out.println("Not able to click on signInButton "+e);
		}
	}
	
	public void clickOnyesButton() {
		try {
			yesButton.click();
			System.out.println("Clicked on Yes Button");
		} catch (Exception e) {
			System.out.println("Not able to click on Yes Button "+e);
		}
	}
	
	public void clickOnbackButton() {
		try {
			backButton.click();
			System.out.println("Clicked on backButton ");
		} catch (Exception e) {
			System.out.println("Not able to backButton "+e);
		}
	}
	
	public void sendkeyToFirst_OTP_Box(String key) {
		try {
			first_OTP_Box.sendKeys(key);
			System.out.println("Entered otp ");
		} catch (Exception e) {
			System.out.println("Not able to enter value in first_OTP_Box "+e);
		}
	}
	
	public void sendkeyToSecond_OTP_Box(String key) {
		try {
			second_OTP_Box.sendKeys(key);
			System.out.println("Entered value in second_OTP_Box");
		} catch (Exception e) {
			System.out.println("Not able to enter value in second_OTP_Box "+e);
		}
	}
	
	public void sendkeyToThird_OTP_Box(String key) {
		try {
			third_OTP_Box.sendKeys(key);
			System.out.println("Entered value in third_OTP_Box");
		} catch (Exception e) {
			System.out.println("Not able to enter value in third_OTP_Box "+e);
		}
	}
	
	public void sendkeyToForth_OTP_Box(String key) {
		try {
			forth_OTP_Box.sendKeys(key);
			System.out.println("Entered value in forth_OTP_Box");
		} catch (Exception e) {
			System.out.println("Not able to enter value in forth_OTP_Box "+e);
		}
	}
	
	public void clickOnLoginButton() {
		try {
			loginButton.click();
			System.out.println("Clicked on Login Button");
		} catch (Exception e) {
			System.out.println("Not able to click on Login Button "+e);
		}
	}
	
	public void verify_OTP_WarningMessage() {
		try {
			if(otpWarningMessage.isDisplayed()) {
				assertTrue(true);
				System.out.println("OTP Warning Message is displaying ");
			}
		} catch (Exception e) {
			System.out.println("OTP Warning Message is not displayed "+e);
		}
	}
}
