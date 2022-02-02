package com.adactin.manager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;

public class PageObjectManager {
	
	
	public static WebDriver driver;
	
	private LoginPage lp;
	

	public PageObjectManager(WebDriver ldriver) {
	this.driver = ldriver;
	}

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	
	
	

}
