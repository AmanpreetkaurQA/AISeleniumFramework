package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	Properties properties;

	/*
	 * public void getFile() throws IOException { FileInputStream fi = new
	 * FileInputStream("./Testdata/config.properties"); properties.load(fi);
	 * 
	 * }
	 * 
	 * String url = properties.getProperty("url");
	 */

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeTest
	public void browserSetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://app-qa.opswire.ai/sign-up");
	}

	@AfterTest
	public void closeBrowser() {

		// driver.quit();
	}
}
