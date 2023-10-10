package TestNG.Pageobjects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {


  @Test(dataProvider = "login-data")
  public void loginTest(String username, String password){
      System.out.println( username + " " + password);
  }

  @Test(dataProvider = "signin-data", dataProviderClass = SignInTestData.class)
  public void signInTest(String username, String password){
      System.out.println( username + " " + password);
  }


  @DataProvider(name = "login-data")
  Object[][] loginData() {
      Object[][] data = {
              {"admin", "admin123"},
              {"kevin", "kevin567"},
              {"vijay", "vijay987"},
      };
      return data;
  }


  

}