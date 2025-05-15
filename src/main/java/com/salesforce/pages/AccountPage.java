package com.salesforce.pages;

import com.framework.selenium.base.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AccountPage extends ProjectSpecificMethods {

    public AccountPage verifyAccountPage() {
        verifyDisplayed(locateElement(Locators.XPATH,"//h2[text()='New Account']"));
        reportStep("AccountPage is loaded", "pass");
        return this;
    }

    public AccountPage EnterAccountName() {
        pause(5000);
        type(locateElement(Locators.XPATH,"//input[@name='Name']"),"Advocate's Account");
        reportStep("Account name Entered successfully", "pass");

        return this;
    }

    public AccountPage ClickSaveButton() {
        pause(5000);
        click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
        reportStep("Save button is clicked successfully", "pass");

        return this;
    }
}
