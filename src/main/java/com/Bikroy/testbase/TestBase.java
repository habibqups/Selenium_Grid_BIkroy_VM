package com.bikroy.testbase;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {

	public WebDriver driver;
	protected static final Logger logger = LogManager.getLogger(TestBase.class);
	public static Properties prop;
	public String DIp;

	public void RemoteDriver(String IP) {
		this.DIp = IP;
		System.out.print("Its From RemoteDriver Options " + DIp + " ");
	}

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("src/main/resources/config/global.properties");
			prop.load(ip);
			String browserName = prop.getProperty("browser");

			if (DIp == null || DIp.isEmpty()) {
				System.out.print("Null DIP " + DIp + " ");
			} else if (browserName.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				System.out.print("Its From Chrome Options " + DIp + " ");
				driver = new RemoteWebDriver(new URL(DIp), options);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				FirefoxOptions options = new FirefoxOptions();
				driver = new RemoteWebDriver(new URL(DIp), options);
			}

		} catch (IOException e) {
			logger.error("Failed to load prop file", e);
		}
		return driver;
	}

	public void navigateToUrl() {
		String url = prop.getProperty("url");
		if (url != null && !url.isEmpty()) {
			driver.get(url);
			System.out.println(url);
		} else {
			logger.error("URL is not provided in the properties file.");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	public String getUsername() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public void CloseDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}
