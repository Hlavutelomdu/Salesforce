package com.salesforce.testcases;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC003_CreateAccount extends ProjectSpecificMethods {
    @BeforeTest
    public void setValues() {
        testcaseName = "CreateCampaign";
        testDescription ="Verify creation of campaign functionality with positive data";
        authors="Hlavutelo";
        category ="EndToEnd";
        excelFileName="Login";
    }

    @Test(dataProvider = "fetchData")
    public void runLogin(String username, String password) {
        new LoginPage()
                .enterUsername(username)
                .enterPassword(password)
                .clickLogin()
                .verifyHomePage()
                .ClickAppLauncher()
                .ClickViewAll()
                .SearchAccountsClick()
                .ClickNewB()
                .verifyAccountPage()
                .EnterAccountName()
                .ClickSaveButton();
    }
}
