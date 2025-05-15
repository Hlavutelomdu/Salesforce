package com.salesforce.pages;

import com.framework.selenium.base.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH,"(//span[@class='slds-truncate']/following::span)[2]"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}

	public HomePage ClickAppLauncher() {
		pause(5000);
		click(locateElement(Locators.XPATH, "//div[@class= 'slds-icon-waffle']"));
		reportStep("App Launcher is clicked successfully", "pass");

		return this;
	}

	public HomePage ClickViewAll() {
		pause(5000);
		click(locateElement(Locators.XPATH, "//button[normalize-space()='View All']"));
		reportStep("View All is clicked successfully", "pass");

		return this;
	}

	public HomePage SearchCampaignsClick() {
		pause(5000);
		type(locateElement(Locators.XPATH, "//div[@type='search']"),"Campaigns");
		reportStep("Campaigns is searched successfully", "pass");

		click(locateElement(Locators.XPATH,"//mark[normalize-space()='Campaigns']"));
		reportStep("Campaigns is clicked successfully", "pass");

		return this;
	}

	public HomePage SearchAccountsClick() {
		pause(5000);
		type(locateElement(Locators.XPATH, "//div[@type='search']"),"Accounts");
		reportStep("Accounts is searched successfully", "pass");

		click(locateElement(Locators.XPATH,"//mark[text()=\"Accounts\"]"));
		reportStep("Accounts is clicked successfully", "pass");

		return this;
	}

	public CampaignsPage ClickNew() {
		pause(5000);
		click(locateElement(Locators.XPATH,"//div[@title='New']"));
		reportStep("New button is clicked successfully", "pass");

		return new CampaignsPage();
	}

	public AccountPage ClickNewB() {
		pause(5000);
		click(locateElement(Locators.XPATH,"//div[@title='New']"));
		reportStep("New button is clicked successfully", "pass");

		return new AccountPage();
	}
}
