package com.demoblaze.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblaze.base.Utilities;
import com.demoblaze.pages.HomePageObject;
import com.demoblaze.pages.LogedHomePage;
import com.demoblaze.pages.LoginPage;

public class NegativeLoginTest extends Utilities {

	@Test(dataProvider = "invalidUsers")
	public void loginTest(int id, String username, String password, String expectedMsg) {
		System.out.println("Iniciando sesión con el id " + id);
		HomePageObject homePageObject = new HomePageObject(driver);
		homePageObject.openPage();
		LoginPage loginPage = homePageObject.clickLoginLink();
		LogedHomePage loged = loginPage.login(username, password);
		Assert.assertEquals(loginPage.getAlertText(), expectedMsg);
	}
}
