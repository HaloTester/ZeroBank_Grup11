package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityStepDefs {

    @Then("the user should be able to see {string} as a default	option")
    public void the_user_should_be_able_to_see_as_a_default_option(String expectedOption) {
        Select temp = new Select(new AccountActivityPage().savings);
        String actualOption = temp.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption);
    }

    @Then("the user should be able to see following options")
    public void the_user_should_be_able_to_see_following_options(List<String> expectedOptions) {
        Select temp = new Select(new AccountActivityPage().savings);
        List<WebElement> allOptions = temp.getOptions();
        List<String> actualOptions = BrowserUtils.getElementsText(allOptions);
        System.out.println("actualOptions = " + actualOptions);
        Assert.assertEquals(expectedOptions,actualOptions);
    }

}
