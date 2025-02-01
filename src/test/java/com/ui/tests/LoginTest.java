package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.utility.BrowserUtility;

public class LoginTest {

	public static void main(String[] args) {
		
		//WebDriver wd = new ChromeDriver(); // Launch a browser! Browser session is created!
		HomePage homePage = new HomePage(Browser.CHROME);
		homePage.goToLoginPage();
		/*
		 * BrowserUtility browserUtility = new BrowserUtility(wd);
		 * browserUtility.goToWebsite("http://www.automationpractice.pl");
		 * browserUtility.maximizeWindow();
		 * 
		 * By signInLocator= By.xpath("//a[contains(text(), \"Sign in\")]");
		 * browserUtility.clickOn(signInLocator);
		 * 
		 * By emailTextBoxLocator= By.id("email");
		 * browserUtility.enterText(emailTextBoxLocator, "kevokob652@matmayer.com");
		 * 
		 * By passwordTextBoxLocator= By.id("passwd");
		 * browserUtility.enterText(passwordTextBoxLocator, "Password");
		 * 
		 * By submitLoginButtonLocator= By.id("SubmitLogin");
		 * browserUtility.clickOn(submitLoginButtonLocator);
		 */
	}

}
