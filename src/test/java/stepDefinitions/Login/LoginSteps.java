package stepDefinitions.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Login.LoginPage;
import pages.PageObjectManager.PageObjectManager;
import utils.TestContextSetup;

import java.util.Random;

public class LoginSteps {
    public WebDriver driver;

    TestContextSetup testContextSetup;
    LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
        this.driver = loginPage.driver;
    }

    @Given("Home page is displayed")
    public void HomePage() throws InterruptedException {
        Assert.assertTrue(loginPage.getSignInButton().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getSignInButton().getText(),"SIGN IN");
        Thread.sleep(1000);
    }
// TC_01
    @Then("Check that the sign in button is available")
    public void AllHomePageOptions() throws InterruptedException {
        Assert.assertTrue(loginPage.getSignInButton().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getSignInButton().getText(),"SIGN IN");
        Thread.sleep(1000);
    }
    @When("Click on the sign in button")
    public void checkThatTheLoginOptionIsAvailable() throws InterruptedException {
        Assert.assertTrue(loginPage.getSignInButton().isDisplayed());
        Thread.sleep(1000);
        loginPage.getSignInButton().click();
        Thread.sleep(1000);
    }
    @Then("Check that the Sign in window is displayed")
    public void clickOnTheLoginOption() throws InterruptedException {
        Assert.assertTrue(loginPage.getSignLabel().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.getSignLabel().getText(),"SIGN IN");
        Thread.sleep(1000);


    }

    @When("Enter the email")
    public void checkThatTheLoginFormIsDisplayed() throws InterruptedException {
        Assert.assertTrue(loginPage.getEmail().isDisplayed());
        Thread.sleep(1000);
        loginPage.getEmail().sendKeys("balayeth677@gmail.com");
        Thread.sleep(1000);
    }

    @And("Enter password")
    public void usersGiveUnregisteredEmailWithPassword() throws InterruptedException {
        Assert.assertTrue(loginPage.getPassword().isDisplayed());
        Thread.sleep(1000);
        loginPage.getPassword().sendKeys("Test.abcd");
        Thread.sleep(1000);
    }

    @And("Click on Sign in button")
    public void clickOnTheLoginButton() throws InterruptedException {
        Assert.assertTrue(loginPage.getSubmitButton().isDisplayed());
        loginPage.getSubmitButton().click();
        Thread.sleep(1000);
    }
}
