package com.bikroy.testbase;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.bikroy.pages.LoginPage;
import com.bikroy.utils.LocatorReader;

public class TestContextSetup {

	public WebDriver driver;
	public com.bikroy.testbase.TestBase testBase;
	public LoginPage loginPage;
	public LocatorReader locatorReader;

	public TestContextSetup() throws IOException, InterruptedException {
		testBase = new com.bikroy.testbase.TestBase();
		locatorReader = new LocatorReader("src/test/resources/locators/locators.json");
	}

	public void initializeDriver() throws IOException {
		driver = testBase.initializeDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage(driver, locatorReader);
		}
		return loginPage;
	}
}
