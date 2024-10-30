package com.bikroy.pages;
//package com.Bikroy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.model.Log;
import com.bikroy.utils.LocatorReader;

public class LoginPage {
	private LocatorReader locatorReader;
	private WebDriver driver;

	public LoginPage(WebDriver driver, LocatorReader locatorReader) {
		this.driver = driver;
		this.locatorReader = locatorReader;
	}

	public WebElement login_logo() {
		return locatorReader.getElement(driver, "loginPage", "login_logo");
	}

	public WebElement email_login() {
		return locatorReader.getElement(driver, "loginPage", "email_login");
	}

	public WebElement email_input_field() {
		return locatorReader.getElement(driver, "loginPage", "email_input_field");
	}

	public WebElement Password_input_field() {
		return locatorReader.getElement(driver, "loginPage", "Password_input_field");
	}

	public WebElement Login_Button() {
		return locatorReader.getElement(driver, "loginPage", "Login_Button");
	}

	public WebElement Mobile_category() {
		return locatorReader.getElement(driver, "loginPage", "Mobile_category");
	}

	public WebElement verify_mobile() {
		return locatorReader.getElement(driver, "loginPage", "verify_mobile");
	}

	public WebElement Electronics_category() {
		return locatorReader.getElement(driver, "loginPage", "Electronics_category");
	}

	public WebElement verify_Electronics() {
		return locatorReader.getElement(driver, "loginPage", "verify_Electronics");
	}

	public WebElement Vehicles_category() {
		return locatorReader.getElement(driver, "loginPage", "Vehicles_category");
	}

	public WebElement Verify_Vehicles() {
		return locatorReader.getElement(driver, "loginPage", "Verify_Vehicles");
	}

	public WebElement Property_category() {
		return locatorReader.getElement(driver, "loginPage", "Property_category");
	}

	public WebElement homeAndLiving() {
		return locatorReader.getElement(driver, "loginPage", "homeAndLiving");
	}
	public WebElement verify_hl() {
		return locatorReader.getElement(driver, "loginPage", "verify_hl");
	}
	public WebElement petsAndAnimal() {
		return locatorReader.getElement(driver, "loginPage", "petsAndAnimal");
	}
	public WebElement verify_pa() {
		return locatorReader.getElement(driver, "loginPage", "verify_pa");
	}
	public WebElement womanFashion() {
		return locatorReader.getElement(driver, "loginPage", "womanFashion");
	}
	public WebElement verify_wf() {
		return locatorReader.getElement(driver, "loginPage", "verify_wf");
	}
	public WebElement manFashion() {
		return locatorReader.getElement(driver, "loginPage", "manFashion");
	}
	public WebElement verify_mf() {
		return locatorReader.getElement(driver, "loginPage", "verify_mf");
	}
	public WebElement hobbiesSportsKids() {
		return locatorReader.getElement(driver, "loginPage", "hobbiesSportsKids");
	}
	public WebElement verify_hsk() {
		return locatorReader.getElement(driver, "loginPage", "verify_hsk");
	}
	public WebElement businessAndIndustry() {
		return locatorReader.getElement(driver, "loginPage", "businessAndIndustry");
	}
	public WebElement verify_bi() {
		return locatorReader.getElement(driver, "loginPage", "verify_bi");
	}
	public WebElement education() {
		return locatorReader.getElement(driver, "loginPage", "education");
	}
	public WebElement verify_edu() {
		return locatorReader.getElement(driver, "loginPage", "verify_edu");
	}
	public WebElement essentials() {
		return locatorReader.getElement(driver, "loginPage", "essentials");
	}
	public WebElement verify_es() {
		return locatorReader.getElement(driver, "loginPage", "verify_es");
	}
	public WebElement agriculture() {
		return locatorReader.getElement(driver, "loginPage", "agriculture");
	}
	public WebElement verify_ag() {
		return locatorReader.getElement(driver, "loginPage", "verify_ag");
	}
	public WebElement services() {
		return locatorReader.getElement(driver, "loginPage", "services");
	}
	public WebElement verify_se() {
		return locatorReader.getElement(driver, "loginPage", "verify_se");
	}
	public WebElement jobs() {
		return locatorReader.getElement(driver, "loginPage", "jobs");
	}
	public WebElement verify_job() {
		return locatorReader.getElement(driver, "loginPage", "verify_job");
	}
	public WebElement overseas() {
		return locatorReader.getElement(driver, "loginPage", "overseas");
	}
	public WebElement verify_over() {
		return locatorReader.getElement(driver, "loginPage", "verify_over");
	}
	public WebElement logo1() {
		return locatorReader.getElement(driver, "loginPage", "logo1");
	}
	public WebElement ads() {
		return locatorReader.getElement(driver, "loginPage", "verify_Property");
	}
	public WebElement bangla() {
		return locatorReader.getElement(driver, "loginPage", "bangla");
	}
	public WebElement chat() {
		return locatorReader.getElement(driver, "loginPage", "chat");
	}
	public WebElement location1() {
		return locatorReader.getElement(driver, "loginPage", "location1");
	}


	public WebElement verify_Property() {
		return locatorReader.getElement(driver, "loginPage", "verify_Property");
	}
}
