package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogedHomePage extends BasePageObject {
	
	private By usernameLinkLocator = By.xpath("//a[@id='nameofuser']");
	private By logoutLinkLocator = By.xpath("//a[@id='logout2']");

	public LogedHomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isLogoutButtonVisible() {
		wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLinkLocator));
		} catch (Exception e) {
			System.out.println("Error: "+e);
			return false;
		}
		return find(logoutLinkLocator).isDisplayed();
	}
	
	public boolean isUsernameVisible() {
		return find(usernameLinkLocator).isDisplayed();
	}

}
