package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefs {

    @When("the user is on the {string} page")
    public void the_user_is_on_the_page(String expectedPage) {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        accountSummaryPage.accountSummaryLink();
        if(!expectedPage.equals("Account Summary")){
            accountSummaryPage.navigateTo(expectedPage);
        }
    }

    @When("the user is on the Account Summary page")
    public void the_user_is_on_the_Account_Summary_page(String expectedTitle) {

    }

    @Then("the user should be able to see {string}")
    public void the_user_should_be_able_to_see(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("Account summary page should have to following account types")
    public void account_summary_page_should_have_to_following_account_types(List<String> expectedAccountTypes) {
        List<String> actualAccountTypes = BrowserUtils.getElementsText(new AccountSummaryPage().accountTypes);
        Assert.assertEquals(expectedAccountTypes,actualAccountTypes);
    }

    @Then("Credit Accounts table should have to following columns")
    public void credit_Accounts_table_should_have_to_following_columns(List<String> expectedColumnNames) {
        List<String> actualColumnNames = BrowserUtils.getElementsText(new AccountSummaryPage().accountTypesTables);
        Assert.assertEquals(expectedColumnNames,actualColumnNames);
    }
}
