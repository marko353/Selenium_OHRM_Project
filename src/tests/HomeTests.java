package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTests extends BaseTest {

    String email = "Admin";
    String password = "admin123";
    String homeTitlt = "HolyWally SIT";
    String tabName = "Performance";
    String changePTab = "Change Password";

    @Test
    public void VerifySearchField() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.BaseURL();
        loginPage.login(email, password);
        homePage.searchF(tabName);
        homePage.verifyTabExistted(tabName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test
    public void VerifyChangePasswordFieldExist() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.BaseURL();
        loginPage.login(email, password);
        homePage.profileMenu();
        homePage.changePasswordAssert(changePTab);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    @Test
    public void VerifyHomePageLogoDisplayed() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.BaseURL();
        loginPage.login(email, password);
        homePage.verifyHomeLogoVisible();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
