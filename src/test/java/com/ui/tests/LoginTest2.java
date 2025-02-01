package com.ui.tests;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;

public class LoginTest2 {

	public static void main(String[] args) {
		HomePage homePage = new HomePage(Browser.CHROME);
		LoginPage loginPage = homePage.goToLoginPage();
		loginPage.doLoginWith("kevokob652@matmayer.com", "Password");
		
	}

}
