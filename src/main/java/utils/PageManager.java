package utils;

import java.io.ObjectInputFilter.Status;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageManager extends BaseClass {
	public void setImplicitWaitTimeout(int timeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	public void until(WebElement element, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(element));	
		} catch (Exception exception) {
			System.out.println("error catched");

		}
	}
	
	public void untilClickable(WebElement element, int timeout) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	
		} catch (Exception exception) {
			System.out.println("error catched");

		}
	}
	public String getText(String element) {
		WebElement ele = driver.findElement(By.xpath(element));
		String str = ele.getText();
		System.out.println(str);
		return str;		
	}
	
	public String getTitle() {
		
		String str = driver.getTitle();
		System.out.println(str);
		return str;		
	}

}
