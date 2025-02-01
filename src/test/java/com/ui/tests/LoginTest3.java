package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pojo.User;
import com.utility.LoggerUtility;

@Listeners(com.ui.listeners.TestListener.class)
public class LoginTest3 extends TestBase{
	/*
	 * Test Method !!
	 * 1. Test script small
	 * 2. You cannot have conditional statements, loops, try catch in your test method
	 * Test Scripts ----> Test steps
	 * 3. Reduce the use of local variables
	 * 4. At least one assertion
	 */
	
	Logger logger= LoggerUtility.getLogger(getClass());

	@Test(description = "Verifies with the valid user is able to login into the application", 
			groups = {"e2e", "sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {
		
		//assertEquals(homePage.goToLoginPage().doLoginWith("kevokob652@matmayer.com", "Password").getUserName(), "Test P User MK");
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Test P User MK");
	}
	/*
	@Test(description = "Verifies with the valid user is able to login into the application", 
			groups = {"e2e", "sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestCSVDataProvider",
			retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class
			)
	public void loginCSVTest(User user) {
		
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Test P User MK 1");
	}
*/
}
