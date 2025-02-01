package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;
import com.utility.LoggerUtility;

import static com.utility.PropertiesUtil.*;

public final class HomePage extends BrowserUtility {

	Logger logger= LoggerUtility.getLogger(getClass());
	
	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(), \"Sign in\")]");
	
	public HomePage(Browser browser) {
		super(browser);	// to call the parent class constructor from the child class constructor
		//goToWebsite(readProperty(QA, "URL"));
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
	}
	
	public HomePage(WebDriver driver) {
		super(driver);	// to call the parent class constructor from the child class constructor
		//goToWebsite(readProperty(QA, "URL"));
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
	}

	public LoginPage goToLoginPage() {	// Page functions-----> cannot use void, should return something.
		logger.info("Tyring to perform click to go to login page");
		clickOn(SIGN_IN_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

	public void quit() {
		
		
	}
}
