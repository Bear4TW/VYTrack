package com.vytrack.utilities;

import com.vytrack.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

}
