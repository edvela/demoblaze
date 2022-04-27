package com.demoblaze.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblaze.base.Utilities;
import com.demoblaze.pages.HomePageObject;
import com.demoblaze.pages.LogedHomePage;
import com.demoblaze.pages.LoginPage;

public class PositiveLoginTests extends Utilities {
	@Test(dataProvider="validUsers")
	public void loginTest(int id, String username, String password) {
		System.out.println("Iniciando sesión con usuarios válidos, id "+id);
		HomePageObject homePageObject = new HomePageObject(driver);
		homePageObject.openPage();
		LoginPage loginPage = homePageObject.clickLoginLink();
		LogedHomePage loged = loginPage.login(username, password);
		Assert.assertTrue(loged.isLogoutButtonVisible());
	}
}
