package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TimePage extends BasePage {

    public TimePage(WebDriver driver) {
        super(driver);

    }

    By timeTab = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span");
    By viewButton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button");
    By timeTitle = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6[2]");
    By element = By.xpath(
            "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div[2]/div/div/div[1]");
    By projectInfoClick = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span");
    By customersClick = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a");
    By customersTitle = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/h6");

    public TimePage timeManage() {
        click(timeTab);

        return this;
    }

    public TimePage verifyViewButtonVisible() {

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(viewButton));
        Assert.assertTrue(element.isDisplayed());

        return this;
    }

    public TimePage timeTitleVis(String expected) {
        String actual = readText(timeTitle);
        assertTextEquals(expected, actual);

        return this;

    }

    public TimePage timeProject() {
        click(projectInfoClick);
        click(customersClick);
        return this;

    }

    public TimePage Title(String expected) {

        String actual = readText(customersTitle);
        assertTextEquals(expected, actual);

        return this;

    }
}
