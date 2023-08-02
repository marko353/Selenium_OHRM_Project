package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
   By userName = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
   By passwordF = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
   By loginButton = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
   By homeTitle = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6");
   By homeImage = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");
   By logOutButton = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
   By welcomeTitlt = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/h5");
   By wrongCreditialMassage = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");

    public void BaseURL() {
        driver.get(baseURL);
    }

    public LoginPage login(String username, String password) {
        writeText(userName, username);
        writeText(passwordF, password);
        click(loginButton);

        return this;
    }

    public LoginPage assertSuccessfulLogin(String expected) {
        String actual = readText(homeTitle);
        assertTextEquals(expected, actual);

        return this;
  
    }

    public LoginPage profileImage() {
        click(homeImage);
        click(logOutButton);
        return this;
    }

    public LoginPage assertSuccessfulLogout(String expected) {
        String actual = readText(welcomeTitlt);
        assertTextEquals(expected, actual);
        return this;
    }

    public LoginPage assertWrongEmailMassage(String expected) {
        String actual = readText(wrongCreditialMassage);
        assertTextEquals(expected, actual);
        return this;
    }

 

}
