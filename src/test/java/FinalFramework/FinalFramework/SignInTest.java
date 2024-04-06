package FinalFramework.FinalFramework;

import org.testng.annotations.Test;

import pageObject.SignInPage;
import utils.BaseClass;

public class SignInTest extends BaseClass{
	SignInPage signIn;
	@Test
	public void loginTest()
	{
		signIn=new SignInPage();
		signIn.enterDetails();
	}
	

}
