package com.bikroy.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.bikroy.pages.LoginPage;
import com.bikroy.testbase.TestBase;
import com.bikroy.testbase.TestContextSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends TestBase {
	TestContextSetup testContext;
	private LoginPage loginPge;
	private static final Logger logger = LogManager.getLogger(LoginSteps.class);

	public LoginSteps(TestContextSetup testContextSetup) {
		this.testContext = testContextSetup;
		loginPge = testContext.getLoginPage();
	}

	@Given("I should see the login logo")
	public void iShouldSeeTheLoginLogo() throws InterruptedException {
		Assert.assertTrue(loginPge.login_logo().isDisplayed(), "Company Logo not displayed");
		Thread.sleep(3000);
		logger.info("Company Logo displayed");
	}

	@Then("I should click on login logo")
	public void iShouldClickOnLoginLogo() throws InterruptedException {
		loginPge.login_logo().click();
		Thread.sleep(3000);
	}

	@And("I should see the email login options")
	public void iShouldSeeTheEmailLoginOptions() throws InterruptedException {
		Assert.assertTrue(loginPge.email_login().isDisplayed(), "Email Login not displayed");
		Thread.sleep(3000);
		logger.info("email login displayed");
	}

	@Then("I should click on Email login options")
	public void iShouldClickOnEmailLoginOptions() throws InterruptedException {
		loginPge.email_login().click();
		Thread.sleep(3000);
	}

	@And("I should see Username field on this page")
	public void iShouldSeeUsernameFieldOnThisPage() throws InterruptedException {
		Assert.assertTrue(loginPge.email_input_field().isDisplayed(), "Username field not displayed");
		Thread.sleep(3000);
		logger.info("username field displayed");
	}

	@When("I should Input my Username")
	public void iShouldInputMyUsername() throws InterruptedException {
		loginPge.email_input_field().click();
		Thread.sleep(1000);
		loginPge.email_input_field().sendKeys("example@gmail.com");
	}

	@And("I should Input my My Password")
	public void iShouldInputMyMyPassword() throws InterruptedException {
		loginPge.Password_input_field().click();
		Thread.sleep(1000);
		loginPge.Password_input_field().sendKeys("example@gmail.com");
		Thread.sleep(2000);
	}

	@Then("I should Click on Login Button")
	public void iShouldClickOnLoginButton() throws InterruptedException {
		loginPge.Login_Button().click();
		Thread.sleep(5000);
	}

	@Given("I should see the Mobile category")
	public void iShouldSeeTheMobileCategory() throws InterruptedException {
		Assert.assertTrue(loginPge.Mobile_category().isDisplayed(), "Mobile Category not displayed");
		Thread.sleep(3000);
		logger.info("Mobile Category displayed");
	}

	@Then("I should Click on Mobile Category")
	public void iShouldClickOnMobileCategory() throws InterruptedException {
		loginPge.Mobile_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Mobile product")
	public void iShouldSeeMobileProduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_mobile().isDisplayed(), "Mobile product not displayed");
		Thread.sleep(3000);
		logger.info("Mobile product displayed");
	}

	@Given("I should see the Electronics category")
	public void iShouldSeeTheElectronicsCategory() throws InterruptedException {
		Assert.assertTrue(loginPge.Electronics_category().isDisplayed(), "Electronics category not displayed");
		Thread.sleep(3000);
		logger.info("Electronics Category displayed");
	}

	@Then("I should Click on Electronics Category")
	public void iShouldClickOnElectronicsCategory() throws InterruptedException {
		loginPge.Electronics_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Electronics product")
	public void iShouldSeeElectronicsProduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Electronics().isDisplayed(), "Electronics product not displayed");
		Thread.sleep(3000);
		logger.info("Electronics product displayed");
	}

	@Given("I should see the Vehicles category")
	public void iShouldSeeTheVehiclesCategory() throws InterruptedException {
		Assert.assertTrue(loginPge.Vehicles_category().isDisplayed(), "Vehicles category not displayed");
		logger.info("Vehicles Category displayed");
	}

	@Then("I should Click on Vehicles Category")
	public void iShouldClickOnVehiclesCategory() throws InterruptedException {
		loginPge.Vehicles_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Vehicles product")
	public void iShouldSeeVehiclesProduct() throws InterruptedException {
		Assert.assertTrue(loginPge.Verify_Vehicles().isDisplayed(), "Vehicles product not displayed");
		Thread.sleep(3000);
		logger.info("Vehicles product displayed");
	}

	@Given("I should see the Property category")
	public void iShouldSeeThePropertyCategory() {
		Assert.assertTrue(loginPge.Property_category().isDisplayed(), "Property category not displayed");
		logger.info("Property Category displayed");
	}

	@Then("I should Click on Property Category")
	public void iShouldClickOnPropertyCategory() throws InterruptedException {
		loginPge.Property_category().click();
		Thread.sleep(3000);
	}

	@And("I should See Property product")
	public void iShouldSeePropertyProduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_Property().isDisplayed(), "Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}

//----------------------------------------------------------------
	@Given("I should see the home and living category")
	public void Ishouldseethehomeandlivingcategory() {
	Assert.assertTrue(loginPge.homeAndLiving().isDisplayed(), "home and living category not displayed");
	logger.info("home and living Category displayed");
}

	@Then("I should Click on home and living Category")
	public void IshouldClickonhomeandlivingCategory() throws InterruptedException {
		loginPge.homeAndLiving().click();
		Thread.sleep(3000);
	}

	@And("I should See home and living product")
	public void IshouldSeehomeandlivingproduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_hl().isDisplayed(), "home and living product not displayed");
		Thread.sleep(3000);
		logger.info("home and living product displayed");
	}

//----------------------------------------------------------------

	//----------------------------------------------------------------
	@Given("I should see the pets and animal category")
	public void Ishouldseethepetsandanimalcategory() {
		Assert.assertTrue(loginPge.petsAndAnimal().isDisplayed(), "pets and animal category not displayed");
		logger.info("pets and animal Category displayed");
	}

	@Then("I should Click on pets and animal Category")
	public void IshouldClickonpetsandanimalCategory() throws InterruptedException {
		loginPge.petsAndAnimal().click();
		Thread.sleep(3000);
	}

	@And("I should See pets and animal product")
	public void IshouldSeepetsandanimalproduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_pa().isDisplayed(), "pets and animal not displayed");
		Thread.sleep(3000);
		logger.info("pets and animal displayed");
	}
	//----------------------------------------------------------------
	@Given("I should see the woman fashion category")
	public void Ishouldseethewomanfashioncategory() {
		Assert.assertTrue(loginPge.womanFashion().isDisplayed(), "woman fashion category not displayed");
		logger.info("woman fashion- Category displayed");
	}

	@Then("I should Click on woman fashion Category")
	public void IshouldClickonwomanfashionCategory() throws InterruptedException {
		loginPge.womanFashion().click();
		Thread.sleep(3000);
	}

	@And("I should See woman fashion product")
	public void IshouldSeewomanfashionproduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_wf().isDisplayed(), "Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}

	//----------------------------------------------------------------
	@Given("I should see the man fashion category")
	public void Ishouldseethemanfashioncategory() {
		Assert.assertTrue(loginPge.manFashion().isDisplayed(), "home and living category not displayed");
		logger.info("home and living Category displayed");
	}

	@Then("I should Click on man fashion Category")
	public void IshouldClickonmanfashionCategory() throws InterruptedException {
		loginPge.manFashion().click();
		Thread.sleep(3000);
	}

	@And("I should See man fashion product")
	public void IshouldSeemanfashionproduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_mf().isDisplayed(), "Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}


	//----------------------------------------------------------------
	@Given("I should see the hobbies sports and kids category")
	public void Ishouldseethehobbiessportsandkidscategory() {
		Assert.assertTrue(loginPge.hobbiesSportsKids().isDisplayed(), "home and living category not displayed");
		logger.info("home and living Category displayed");
	}

	@Then("I should Click on hobbies sports and kids Category")
	public void IshouldClickonhobbiessportsandkidsCategory() throws InterruptedException {
		loginPge.hobbiesSportsKids().click();
		Thread.sleep(3000);
	}

	@And("I should See hobbies sports and kids product")
	public void IshouldSeehobbiessportsandkidsproduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_hsk().isDisplayed(), "Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}
//	//----------------------------------------------------------------
	@Given("I should see the business and industry category")
	public void Ishouldseethebusinessandindustrycategory() {
		Assert.assertTrue(loginPge.businessAndIndustry().isDisplayed(), "home and living category not displayed");
		logger.info("home and living Category displayed");
	}

	@Then("I should Click on business and industry Category")
	public void IshouldClickonbusinessandindustryCategory() throws InterruptedException {
		loginPge.businessAndIndustry().click();
		Thread.sleep(3000);
	}

	@And("I should See business and industry product")
	public void IshouldSeebusinessandindustryproduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_bi().isDisplayed(), "Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}


//----------------------------------------------------------------
		//----------------------------------------------------------------
	@Given("I should see the education category")
	public void Ishouldseetheeducationcategory() {
		Assert.assertTrue(loginPge.education().isDisplayed(), "home and living category not displayed");
		logger.info("home and living Category displayed");
	}

	@Then("I should Click on education Category")
	public void IshouldClickoneducationCategory() throws InterruptedException {
		loginPge.education().click();
		Thread.sleep(3000);
	}

	@And("I should See education product")
	public void IshouldSeeeducationproduct() throws InterruptedException {
		Assert.assertTrue(loginPge.verify_edu().isDisplayed(), "Property product not displayed");
		Thread.sleep(3000);
		logger.info("Property product displayed");
	}

//----------------------------------------------------------------
	//	//----------------------------------------------------------------
//	@Given("I should see the home and living category")
//	public void Ishouldseethehomeandlivingcategory() {
//		Assert.assertTrue(loginPge.Property_category().isDisplayed(), "home and living category not displayed");
//		logger.info("home and living Category displayed");
//	}
//
//	@Then("I should Click on home and living Category")
//	public void IshouldClickonhomeandlivingCategory() throws InterruptedException {
//		loginPge.Property_category().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should See home and living product")
//	public void IshouldSeehomeandlivingproduct() throws InterruptedException {
//		Assert.assertTrue(loginPge.verify_Property().isDisplayed(), "Property product not displayed");
//		Thread.sleep(3000);
//		logger.info("Property product displayed");
//	}

//----------------------------------------------------------------
	//----------------------------------------------------------------
	//	//----------------------------------------------------------------
//	@Given("I should see the home and living category")
//	public void Ishouldseethehomeandlivingcategory() {
//		Assert.assertTrue(loginPge.Property_category().isDisplayed(), "home and living category not displayed");
//		logger.info("home and living Category displayed");
//	}
//
//	@Then("I should Click on home and living Category")
//	public void IshouldClickonhomeandlivingCategory() throws InterruptedException {
//		loginPge.Property_category().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should See home and living product")
//	public void IshouldSeehomeandlivingproduct() throws InterruptedException {
//		Assert.assertTrue(loginPge.verify_Property().isDisplayed(), "Property product not displayed");
//		Thread.sleep(3000);
//		logger.info("Property product displayed");
//	}

//----------------------------------------------------------------
	//	//----------------------------------------------------------------
//	@Given("I should see the home and living category")
//	public void Ishouldseethehomeandlivingcategory() {
//		Assert.assertTrue(loginPge.Property_category().isDisplayed(), "home and living category not displayed");
//		logger.info("home and living Category displayed");
//	}
//
//	@Then("I should Click on home and living Category")
//	public void IshouldClickonhomeandlivingCategory() throws InterruptedException {
//		loginPge.Property_category().click();
//		Thread.sleep(3000);
//	}
//
//	@And("I should See home and living product")
//	public void IshouldSeehomeandlivingproduct() throws InterruptedException {
//		Assert.assertTrue(loginPge.verify_Property().isDisplayed(), "Property product not displayed");
//		Thread.sleep(3000);
//		logger.info("Property product displayed");
//	}

































}
