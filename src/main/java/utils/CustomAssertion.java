package utils;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CustomAssertion extends BaseClass {
	private SoftAssert softAssert;
	public boolean assertEquals(String actual, String expected, String message) {
		try {
			Assert.assertEquals(actual, expected, message);
			return true;
		} catch (AssertionError e) {
			softAssert.assertEquals(actual, expected, message);
			return false;
	}
	}
	
	public boolean assertEquals(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
			return true;
		} catch (AssertionError e) {
			softAssert.assertEquals(actual, expected);
			return false;
	}
	}
public boolean assertTrue(boolean expression, String message) {
		try {
			Assert.assertTrue(expression, message);
			return true;
		} catch (AssertionError e) {
			softAssert.assertTrue(expression, message);
			return false;
		}
	}

}
