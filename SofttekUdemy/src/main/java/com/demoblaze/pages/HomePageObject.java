package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePageObject{
	
	private String url = "https://www.demoblaze.com/";
	
	private By loginLink = By.xpath("//a[@id='login2']");


	public HomePageObject(WebDriver driver) {
		super(driver);

	}
	
	public void openPage() {
		System.out.println("Opening page " + url);
		openUrl(url);
		System.out.println("page opened!");		
	}
	
	public LoginPage clickLoginLink() {
		click(loginLink);
		System.out.println("clicked!");
		return new LoginPage(driver);
	}

}
