package com.demoblaze.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageObject {

	private By usernameInputLocator = By.xpath("//input[@id='loginusername']");
	private By passwordInputLocator = By.xpath("//input[@id='loginpassword']");
	private By submitButtonLocator = By.xpath("//button[contains(text(), 'Log in')]");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LogedHomePage login(String username, String password) {
		System.out.println("login username and password");
		type(username, usernameInputLocator);
		type(password, passwordInputLocator);
		click(submitButtonLocator);	
		return new LogedHomePage(driver);
	}
	
	public String getAlertText() {
		System.out.println("iniciando alerts");
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		return alert.getText();
	}

}
