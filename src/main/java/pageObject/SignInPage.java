package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class SignInPage extends BaseClass {
	
	String email="amanpreet+7@logiciel.io";
	
	// To click on Sign In link on sign up page
	@FindBy(xpath ="//a[text()='Sign in here.']")
	WebElement clickSignin;
	
	// To enter the email address in the email input field
	@FindBy(xpath="//*[@class='form-group']/child::input[@formcontrolname='email']")
	WebElement enterEmail;
	
	// To enter the password in the password input field
	@FindBy(xpath="//*[@class='form-group']/child::input[@formcontrolname='password']")
	WebElement password;
	
	//To click on Login Button
	@FindBy(xpath="//input[@value='Log In']")
	WebElement LoginButton;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignInLink() {
		clickSignin.click();
	}
	public void enterEmail() {
		if(enterEmail.isDisplayed())
		{
			System.out.println("element is displayed");
			enterEmail.sendKeys(email);
		}else
		{
			System.out.println("Email input field is not visible");
		}
		
	}
	public void enterPassword() {
		password.sendKeys("owner123");
	}
	public void clickOnLogin()
	{
		LoginButton.click();
	}
	public void enterDetails() 
	{
		clickSignInLink();
		enterEmail();
		enterPassword();
		clickOnLogin();
		
	}
}

