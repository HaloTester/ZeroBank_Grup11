package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateTo(String tab){
        String path = "//a[contains(text(),'" + tab + "')]";
        WebElement temp = Driver.get().findElement(By.xpath(path));
        temp.click();
    }
}
