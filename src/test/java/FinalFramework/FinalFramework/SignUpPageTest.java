package FinalFramework.FinalFramework;

import org.testng.annotations.Test;

import pageObject.SignUpPage;
import utils.BaseClass;

public class SignUpPageTest extends BaseClass{
	SignUpPage signup;
	@Test
	public void test()
	{
		signup=new SignUpPage();
		signup.addDetails();
		
	}

}
