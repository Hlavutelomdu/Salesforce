package com.salesforce.pages;

import com.framework.selenium.base.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CampaignsPage extends ProjectSpecificMethods {

    public CampaignsPage verifyCampaignPage() {
        verifyDisplayed(locateElement(Locators.XPATH,"//h2[text()='New Campaign']"));
        reportStep("CampaignPage is loaded", "pass");
        return this;
    }

    public CampaignsPage EnterCampaignName() {
        pause(5000);
        type(locateElement(Locators.XPATH,"(//input[@class=\" input\"])[1]"),"Advocate's Campaign");
        reportStep("Campaign name Entered successfully", "pass");

        return this;
    }

    public CampaignsPage ClickSaveButton() {
        pause(5000);
        click(locateElement(Locators.XPATH, "//button[@title='Save']"));
        reportStep("Save button is clicked successfully", "pass");

        return this;
    }
}
