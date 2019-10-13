package com.vytrack.pages.login_navigation;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userNameElement;

    @FindBy(id = "prependedInput2")
    public WebElement passwordElement;

    @FindBy(id = "_submit")
    public WebElement loginButtonElement;

    @FindBy(className = "custom-checkbox__icon")
    public WebElement rememberMeButtonElement;

    public void login(String userName, String password) {
        userNameElement.sendKeys(userName);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login() {
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();

    }
}

