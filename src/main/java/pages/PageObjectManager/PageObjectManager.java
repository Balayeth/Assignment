package pages.PageObjectManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Login.LoginPage;


public class PageObjectManager {

    public static WebDriver driver;


    public LoginPage loginPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static WebElement hoverToElement(WebElement element) {
        Actions action = new Actions(driver);
        WebElement we = element;
        action.moveToElement(we).perform();
        return we;
    }
}
