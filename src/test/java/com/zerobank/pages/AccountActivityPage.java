package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(css = "#aa_accountId")
    public WebElement savings;

    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> columnNames;

}
