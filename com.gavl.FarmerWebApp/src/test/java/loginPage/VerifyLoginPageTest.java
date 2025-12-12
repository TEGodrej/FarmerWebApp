package loginPage;

import java.util.Scanner;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyLoginPageTest extends BaseClass{

	@Test
	public void verify_SSO_Login() {
		
		driverUtility.implicitlyWait(10);
		loginPage.clickOn_SSO_Option();
//		loginPage.sendkeyTouserEmailTextField(userName);
//		loginPage.clickOnNextButton();
//		loginPage.sendkeyToPasswordTextField(password);
		productOverviewPage.verifyproductOverviewTitle();
	}
	
	@Test
	public void verifyLoginWithMobileNumber() {
		
		String number="9167757696";
		driverUtility.implicitlyWait(10);
		loginPage.clickOnMobileLoginOption();
		loginPage.sendkeyToMobileNumberTextField(number);
		loginPage.clickOnGetOTP_Option();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("please provide OTP:");
			String OTP=	sc.next();
		
		driverUtility.threadWait(10);
		loginPage.sendkeyToFirst_OTP_Box(String.valueOf(OTP.charAt(0)));
		loginPage.sendkeyToSecond_OTP_Box(String.valueOf(OTP.charAt(1)));
		loginPage.sendkeyToThird_OTP_Box(String.valueOf(OTP.charAt(2)));
		loginPage.sendkeyToForth_OTP_Box(String.valueOf(OTP.charAt(3)));
	  }
		loginPage.clickOnLoginButton();
		productOverviewPage.verifyproductOverviewTitle();
	}	
	
	
}
