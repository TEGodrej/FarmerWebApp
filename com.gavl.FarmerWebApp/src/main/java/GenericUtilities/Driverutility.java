package GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driverutility extends BaseClass{

	public static WebDriverWait wait;
	public void WaitToClick(int time, WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    element = wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void WaitTovisibility(WebElement element, int time) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void implicitlyWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);",element);
	}
	
	public void forceScrollPage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, arguments[0].getBoundingClientRect().top + window.scrollY);", element);

	}
	
	public void scrollToElement(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void threadWait(int time) {
		try {
			Thread.sleep(Duration.ofSeconds(time));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
