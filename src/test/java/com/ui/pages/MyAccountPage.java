package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class MyAccountPage extends BrowserUtility {

	private static final By USER_NAME_LOCATOR = By.xpath("//a[@title=\"View my customer account\"]/span");
	//By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

	public String getUserName() {
		return getVisibleText(USER_NAME_LOCATOR);
	}
}
