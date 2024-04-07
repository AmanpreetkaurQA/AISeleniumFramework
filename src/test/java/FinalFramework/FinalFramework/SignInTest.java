package FinalFramework.FinalFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.SignInPage;
import utils.BaseClass;
import utils.CustomAssertion;
import utils.PageManager;

public class SignInTest extends BaseClass {
	SignInPage signIn;
	CustomAssertion customAssertion;
	PageManager pageManager;

	@BeforeTest
	public void setUp() {
		pageManager = new PageManager();
		customAssertion = new CustomAssertion();
	}

	@Test
	public void loginTest() throws Exception {
		signIn = new SignInPage();
		signIn.clickSignInLink();
		signIn.enterEmail();
		signIn.enterPassword();
		boolean loginResult=signIn.LoggedIN();
		customAssertion.assertTrue(loginResult, "User logged in successfully");
	}

	@Test
	public void verifyPageTitleIsCorrect() {
		String pageTitle = pageManager.titleName();
		System.out.println("Page title is: " + pageTitle);
		// Assert that the pageTitle is as expected
		customAssertion.assertEquals("OpsWire AI", pageTitle);

	}

}
