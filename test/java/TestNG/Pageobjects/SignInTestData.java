package TestNG.Pageobjects;

import org.testng.annotations.DataProvider;

public class SignInTestData {
	 @DataProvider(name = "signin-data")
	    Object[][] loginData() {
	        Object[][] data = {
	                {"admin", "admin123"},
	                {"kevin", "kevin567"},
	                {"vijay", "vijay987"},
	        };


	        return data;
	    }
	}

