package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import com.framework.selenium.base.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String uName) {
		WebElement eleUsername = locateElement("username");
		clearAndType(eleUsername, uName);
		reportStep(uName+" username is entered successfully", "pass");
		
		return this;
	}

	public LoginPage enterPassword(String passWord) {
		WebElement elePassword = locateElement(Locators.XPATH,"//input[@id='password']");
		clearAndType(elePassword, passWord);
		reportStep(passWord+" password is entered successfully", "pass");
		
		return this;
	}

	public HomePage clickLogin() {
		click(locateElement(Locators.ID, "Login"));
		reportStep("Login button is clicked successfully", "pass");

		return new HomePage();
	}

}
