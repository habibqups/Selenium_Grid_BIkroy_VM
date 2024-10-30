package com.bikroy.TestRunner; // Ensure the package name is consistent with your step definitions

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.bikroy.stepdefinitions", // Ensure this matches your step definitions package
        tags = "@Release", // This tag must be present in your feature files to run the tests
        plugin = {
                "pretty",
                "html:reports/cucumber-reports.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true // Makes console output readable
)
public class TestRunner extends AbstractTestNGCucumberTests {

    // To run scenarios in parallel
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}



