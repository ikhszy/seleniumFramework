package com.AutomationExperience.testCases;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.AutomationExperience.pageObjects.BaseClass;
import com.AutomationExperience.pageObjects.SignInPageObj;
import com.AutomationExperience.pageObjects.SignUpPageObj;

public class SignupTest extends BaseClass {
	
	@Test
	public void SGN001() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		SignInPageObj sgn = new SignInPageObj(driver);
		SignUpPageObj sgu = new SignUpPageObj(driver);
		
		driver.get(baseUrl);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		sgn.signClick();
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.createAccountButton));
		
		String emailCreate = randomString();
		sgn.createText("ikhsan." + emailCreate + "@gmail.com");
		sgn.createEmailText.sendKeys(Keys.TAB);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String cssvalues = sgn.createEmailText.getCssValue("background-color");
		
		if(cssvalues.contains("221, 249, 225")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		sgn.createButton();
		
		wait.until(ExpectedConditions.visibilityOf(sgu.personalEmail));
		
		if(sgu.personalEmail.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void SGN002() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		SignInPageObj sgn = new SignInPageObj(driver);
		
		driver.get(baseUrl);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		sgn.signClick();
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.createAccountButton));
		
		sgn.createEmailText.sendKeys(Keys.TAB);
		
		String cssvalues = sgn.createEmailText.getCssValue("background-color");
		
		if(cssvalues.contains("255, 241, 242")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		sgn.createButton();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.signupErrorAlert));
		String errorText = sgn.signupErrorText.getText();
		
		if(errorText.equalsIgnoreCase("Invalid email address.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void SGN003() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		SignInPageObj sgn = new SignInPageObj(driver);
		
		driver.get(baseUrl);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		sgn.signClick();
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.createAccountButton));
		
		sgn.createEmailText.sendKeys(username);
		sgn.createEmailText.sendKeys(Keys.TAB);
		
		String cssvalues = sgn.createEmailText.getCssValue("background-color");
		
		if(cssvalues.contains("221, 249, 225")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		sgn.createButton();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.signupErrorAlert));
		String errorText = sgn.signupErrorText.getText();
		
		if(errorText.equalsIgnoreCase("An account using this email address has already been registered. Please enter a valid password or request a new one. ")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void SGN004() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		SignInPageObj sgn = new SignInPageObj(driver);
		
		driver.get(baseUrl);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		sgn.signClick();
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.createAccountButton));
		
		sgn.createEmailText.sendKeys("asdhahaha");
		sgn.createEmailText.sendKeys(Keys.TAB);
		
		String cssvalues = sgn.createEmailText.getCssValue("background-color");
		
		if(cssvalues.contains("255, 241, 242")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		sgn.createButton();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.signupErrorAlert));
		String errorText = sgn.signupErrorText.getText();
		
		if(errorText.equalsIgnoreCase("Invalid email address.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
