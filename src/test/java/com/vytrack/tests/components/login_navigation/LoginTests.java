package com.vytrack.tests.components.login_navigation;

import com.vytrack.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginTest1() {
        extentLogger = report.createTest("Login as store manager");
        String userName = "storemanager85";
        String password = "UserUser123";

        pages.loginPage().login(userName, password);

    }

    @Test
    public void loginAsStoreManagerTest() {
        extentLogger = report.createTest("Login as store manager");
        pages.loginPage().login();
    }
}
