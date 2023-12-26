package pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    By sign_in= By.xpath("(//a[@title='Sign In'])[1]");
    By signLabel= By.xpath("//a[@class='active']");

    By email= By.xpath("(//input[@placeholder='Email Address'])[1]");
    By password= By.xpath("(//input[@placeholder='Password'])[1]");
    By submit= By.xpath("//button[@type='submit']");

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getSignInButton() {
        return driver.findElement(sign_in);
    }
    public WebElement getSignLabel() {
        return driver.findElement(signLabel);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(submit);
    }

}
