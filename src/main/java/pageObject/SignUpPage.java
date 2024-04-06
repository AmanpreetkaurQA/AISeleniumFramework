package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;
import utils.PageManager;

public class SignUpPage extends BaseClass {
	PageManager pg=new PageManager();
	// To enter the values in the First name input field
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstName;

	// To enter the values in the Last name input field and clear the value and
	// again enter the new value
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastName;

	// To enter email
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailId;

	// To enter the values in the Password input field
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;

	// To enter the values in the Confirm Password input field
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	WebElement confirmPassword;

	// Click on the checkbox of the Terms of service and privacy policy
	@FindBy(xpath = "//input[@formcontrolname='agreement']")
	WebElement checkbox;

	// To click on the Sign Up button
	@FindBy(name = "submit")
	WebElement buttonOfSignUp;

	// To select monthly paid plan
	@FindBy(xpath = "//a[contains(text(), 'Select Paid Plan')]")
	WebElement selectPaidPlan;

	// To close chatbot
	@FindBy(xpath = "//div[@class='intercom-dfosxs edrs4yi0']")
	WebElement chatbot;

	// To click on proceed button
	@FindBy(xpath = "//button[text()=' Proceed ']")
	WebElement selectProceed;

	// To enter the card holder name
	@FindBy(xpath = "//input[@placeholder='Enter Cardholder Name']")
	WebElement cardHolderName;

	// To locate the frame element
	@FindBy(xpath = "(//iframe[contains(@src, 'elements-inner-card')]) [1] ")
	WebElement f;

	// To enter the card number
	@FindBy(xpath = "//input[@aria-label='Credit or debit card number']")
	WebElement cardNumber;

	// To locate the frame element
	@FindBy(xpath = "(//iframe[contains(@src, 'elements-inner-card')])[2] ")
	WebElement f1;

	// To enter the expiry date of the card
	@FindBy(xpath = "//input[@placeholder='MM / YY']")
	WebElement expiryDate;

	// To locate the frame element
	@FindBy(xpath = "(//iframe[contains(@src, 'elements-inner-card')])[3] ")
	WebElement f2;

	// To enter the CVV of the card
	@FindBy(xpath = "//input[@placeholder='CVV']")
	WebElement cvv;

	// To click on Pay Now button
	@FindBy(xpath = "//button[text()='Pay Now']")
	WebElement PayButton;

	// To locate loader before click on skip button
	@FindBy(xpath = "//div[@class='loader-inner-spin']")
	WebElement loader;
	// To skip first preference
	@FindBy(xpath = "//div[@class='footer-row']/a[@class='btn-skip']")
	WebElement skipbtn;

	// To skip second preference
	@FindBy(xpath = "//div[@class='footer-row']/div/a/u[text()='Skip']")
	WebElement skipbtn1;

	// To click on finish button on last preference
	@FindBy(xpath = "//button[@type='submit']")
	WebElement finish;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void EnterFirstName() {
		firstName.sendKeys("Amanpreet");
	}

	public void EnterLastName() {
		lastName.sendKeys("Kaur");
	}

	public void EnterEmail() {
		emailId.sendKeys("amanpreet+7@logiciel.io");
	}

	public void EnterPassword() {
		Password.sendKeys("owner123");
	}

	public void EnterConfirmPassword() {
		confirmPassword.sendKeys("owner123");
	}

	public void clickCheckbox() {
		checkbox.click();
	}

	public void clickSubmit() {
		buttonOfSignUp.click();
	}

	

	public void selectMonthlyPaidPlan() {
		selectPaidPlan.click();
	}

	public void clickChatBot() {
		chatbot.click();

	}

	public void clickProceed() {
		selectProceed.click();

	}

	public void EnterCardHolderName() {
		cardHolderName.sendKeys("APK");

	}

	public void EnterCardNumber() {
		driver.switchTo().frame(f);
		cardNumber.sendKeys("4111111111111111");
		driver.switchTo().defaultContent();
	}

	public void EnterExpiryDate() {

		driver.switchTo().frame(f1);
		expiryDate.sendKeys("12/29");
		driver.switchTo().defaultContent();
	}

	public void EnterCVV() {
		driver.switchTo().frame(f2);
		cvv.sendKeys("123");
		driver.switchTo().defaultContent();
	}

	public void ClickOnPayNowButton() {
		PayButton.click();
	}

	public void skipFirstPreference() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(loader));
		skipbtn.click();
	}

	public void skipSecondPreference() {
		skipbtn1.click();

	}

	public void finshLastPrefernce() {
		finish.click();
	}

	public void addDetails() {
		EnterFirstName();
		EnterLastName();
		EnterEmail();
		EnterPassword();
		EnterConfirmPassword();
		clickCheckbox();
		clickSubmit();
		pg.setImplicitWaitTimeout(10);
		selectMonthlyPaidPlan();
		clickChatBot();
		clickChatBot();
		clickProceed();
		EnterCardHolderName();
		EnterCardNumber();
		EnterExpiryDate();
		EnterCVV();
		ClickOnPayNowButton();
		skipFirstPreference();
		skipSecondPreference();
		finshLastPrefernce();
	}

}
