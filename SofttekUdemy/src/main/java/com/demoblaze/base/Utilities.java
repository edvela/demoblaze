package com.demoblaze.base;

import org.testng.annotations.DataProvider;

public class Utilities extends Base {
	@DataProvider(name="validUsers")
	protected static Object[][] valid(){
		return new Object[][] {
			{1,"ederr.martinez", "damian"}
		};
	}
	@DataProvider(name="invalidUsers")
	protected static Object[][] invalid(){
		return new Object[][] {
			{1,"user", "", "Please fill out Username and Password."},
			{2,"", "password", "Please fill out Username and Password."},
			{3,"", "", "Please fill out Username and Password."},
			{4,"adsfadfsdf", "sdsfsdfaa", "User does not exist."},
			{5,"ederr.martinez", "sdsfsdfaa", "Wrong password."}
		};
	}	
}
