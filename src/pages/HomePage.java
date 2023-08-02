package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By searchField = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/input");
    By performanceLocator = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span");
    By menuProfile = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img");
    By changePTab = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a");
    By homeBanner = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img");

    public HomePage searchF(String tabName) {
       writeText(searchField, tabName);
       return this;
    }

    public HomePage verifyTabExistted(String expected) {
        String actual = readText(performanceLocator);
        assertTextEquals(actual, expected);
        return this;
    }
   
     public HomePage verifyHomeLogoVisible() {
       
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(homeBanner));
        Assert.assertTrue(element.isDisplayed());

        return this;
    }
    public HomePage profileMenu(){
        click(menuProfile);
        return this;
    }
    public HomePage changePasswordAssert(String expected) {
        String actual = readText(changePTab);
        assertTextEquals(actual, expected);
        return this;
    }
   
 

}







