package tests;

import org.junit.Test;

import pages.LoginPage;
import pages.TimePage;

public class TimeTests extends BaseTest {
    String email = "Admin";
    String password = "admin123";
    String title = "Timesheets";
    String customerTitle = "Customers";
    @Test
    public void VerifyTmeViewButtonVisible() {
        LoginPage loginPage = new LoginPage(driver);
        TimePage timePage = new TimePage(driver);

        loginPage.BaseURL();
        loginPage.login(email, password);
        timePage.timeManage();
        timePage.verifyViewButtonVisible();

    }

    @Test
    public void VerifyVecomeTitleVisible() {
        LoginPage loginPage = new LoginPage(driver);
        TimePage timePage = new TimePage(driver);

        loginPage.BaseURL();
        loginPage.login(email, password);
        timePage.timeManage();
        timePage.timeTitleVis(title);

    }

    @Test
    public void VerifyEmployeeTimesheet() {
        LoginPage loginPage = new LoginPage(driver);
        TimePage timePage = new TimePage(driver);

        loginPage.BaseURL();
        loginPage.login(email, password);
        timePage.timeManage();
        timePage.timeProject();
        timePage.Title(customerTitle);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
