package com.bikroy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bikroy.utils.LocatorReader;

public class DashBoardPage {
    private LocatorReader locatorReader;
    private WebDriver driver;

    public DashBoardPage(WebDriver driver, LocatorReader locatorReader) {
        this.driver = driver;
        this.locatorReader = locatorReader;
    }

    public WebElement dashboardHeading() {
        return locatorReader.getElement(driver, "dashboard", "dashboard_heading_label");
    }
}
