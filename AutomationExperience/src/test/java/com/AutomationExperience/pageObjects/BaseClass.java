package com.AutomationExperience.pageObjects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.AutomationExperience.utilities.ReadConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	ReadConfig reader = new ReadConfig();
	
	public String baseUrl = reader.getBaseURL();
	public String username = reader.getUsername();
	public String password = reader.getPassword();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", reader.getChromepath());
			ChromeOptions options = new ChromeOptions();
	//		options.addArguments("--headless");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		
		else if(br.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", reader.getFirefoxPath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
