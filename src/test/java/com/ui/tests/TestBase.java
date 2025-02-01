package com.ui.tests;

import static com.constants.Browser.CHROME;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LambdaTestUtility;
import com.utility.LoggerUtility;

public class TestBase {

	protected HomePage homePage;
	Logger logger= LoggerUtility.getLogger(getClass());
	private boolean isLambdaTest;
	
	@Parameters({"browser", "isLambdaTest"})
	@BeforeMethod(description = "Load the home page of the website.")
	public void setup(
			@Optional("chrome") String browser, 
			@Optional("false") boolean isLambdaTest, ITestResult result) {
		
		this.isLambdaTest = isLambdaTest;
		WebDriver lambdaDriver;
		
		if(isLambdaTest) {
			lambdaDriver = LambdaTestUtility.initializeLambdaTestSession(browser, result.getMethod().getMethodName());
			homePage = new HomePage(lambdaDriver);
		}
		else {
			// Running  the test on local machine!!
			logger.info("Load the home page of the website");
			homePage = new HomePage(CHROME);
		}
	}
	
	public BrowserUtility getInstance() {
		return homePage;
	}
	
	@AfterMethod(description = "Tear down the browser")
		public void tearDown() {
			if(isLambdaTest) {
				LambdaTestUtility.quitSession(); // quit or close the browser session on LT
			}
			else {
				homePage.quit(); //local
			}
				
		}
}
