package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	protected Properties properties = new Properties();
	FileInputStream fileinputstream;

	public void getData() throws Exception {
		fileinputstream = new FileInputStream("./Testdata/config.properties");
		properties.load(fileinputstream);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeTest
	public void browserSetUp() throws Exception {
		getData();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = properties.getProperty("url");
		driver.get(url);

	}

	@AfterTest
	public void closeBrowser() throws IOException {
		fileinputstream.close();
		// driver.quit();
	}
}
