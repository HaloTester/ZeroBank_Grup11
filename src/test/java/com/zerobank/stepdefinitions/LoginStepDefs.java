package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.signInBtn.click();
    }

    @When("the user enters {string} {string}")
    public void the_user_enters(String username, String password) {
        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.loginBtn.click();
        if(username.equals("username") && password.equals("password")){
            Driver.get().navigate().back();
        }
    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String expectedPageName) {
        String actualPageName = Driver.get().getTitle();
        Assert.assertEquals(expectedPageName,actualPageName);
    }

    @Then("the user should be able to get {string} message")
    public void the_user_should_be_able_to_get_message(String expectedMessage) {
        String actualMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
