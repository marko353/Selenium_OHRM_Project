package tests;

import org.junit.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {
   String email = "Admin";
   String password = "admin123";
   String title = "Dashboard";
   String welcomeTitle = "Login";
   String wrongEmail = "test@gmail.com";
   String errorText = "Invalid credentials";

   @Test
   public void verifySuccesfulLogin() {
      LoginPage loginPage = new LoginPage(driver);

      loginPage.BaseURL();
      loginPage.login(email, password);
      loginPage.assertSuccessfulLogin(title);

   }

   @Test
   public void verifySuccesfulLogout() {
      LoginPage loginPage = new LoginPage(driver);

      loginPage.BaseURL();
      loginPage.login(email, password);
      loginPage.profileImage();
      loginPage.assertSuccessfulLogout(welcomeTitle);

   }

   @Test
   public void unSuccesfulLogin() {
      LoginPage loginPage = new LoginPage(driver);
      loginPage.BaseURL();
      loginPage.login(wrongEmail, password);
      loginPage.assertWrongEmailMassage(errorText);

   }

}
