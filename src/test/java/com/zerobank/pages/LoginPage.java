package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signInBtn;

    @FindBy(id = "user_login")
    public WebElement usernameInputBox;

    @FindBy(id = "user_password")
    public WebElement passwordInputBox;

    @FindBy(css = ".btn.btn-primary")
    public WebElement loginBtn;

    @FindBy(id = "details-button")
    public WebElement advancedBtn;

    @FindBy(id = "proceed-link")
    public WebElement proceedLink;

    @FindBy(css = ".alert.alert-error")
    public WebElement errorMessage;

    public void login(){
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginBtn.click();
        advancedBtn.click();
        proceedLink.click();
    }

}
