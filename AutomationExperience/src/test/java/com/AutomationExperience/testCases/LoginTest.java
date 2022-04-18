package com.AutomationExperience.testCases;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.AutomationExperience.pageObjects.BaseClass;
import com.AutomationExperience.pageObjects.MyAccountPageObj;
import com.AutomationExperience.pageObjects.SignInPageObj;
import java.io.IOException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginTest extends BaseClass {
	
	@Test(priority=7)
	public void LGN001() throws IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get(baseUrl);
		SignInPageObj sgn = new SignInPageObj(driver);
		MyAccountPageObj acc = new MyAccountPageObj(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		
		sgn.signClick();
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.loginButton));
		
		sgn.setEmail(username);
		sgn.setPassword(password);
		sgn.clickLogin();
		
		wait.until(ExpectedConditions.visibilityOf(acc.orderHistory));
		
		String Assert1 = driver.getTitle().toString();
		
		Assert.assertEquals(Assert1, "My account - My Store");
		Assert.assertTrue(acc.orderHistory.isDisplayed());
		
		captureScreen(driver, "LGN001");
	}
	
	@Test(priority=1, groups = "negative")
	public void LGN002() throws IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get(baseUrl);
		SignInPageObj sgn = new SignInPageObj(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		
		sgn.signClick();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.loginButton));
		
		sgn.clickLogin();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.ErrorColumn));
		
		boolean errorHeader = sgn.errorHeader.getText().contains("There is 1 error");
		boolean errorText = sgn.errorText.getText().contains("An email address required.");
		Assert.assertEquals(errorHeader, true);
		Assert.assertEquals(errorText, true);
		
		captureScreen(driver, "LGN002");
	}

	@Test(priority=2, groups = "negative")
	public void LGN003() throws IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get(baseUrl);
		SignInPageObj sgn = new SignInPageObj(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		
		sgn.signClick();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.loginButton));
		
		sgn.setEmail(username);
		sgn.clickLogin();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.ErrorColumn));
		
		boolean errorHeader = sgn.errorHeader.getText().contains("There is 1 error");
		boolean errorText = sgn.errorText.getText().contains("Password is required.");
		Assert.assertEquals(errorHeader, true);
		Assert.assertEquals(errorText, true);
		
		captureScreen(driver, "LGN003");
	}
	
	@Test(priority=3, groups = "negative")
	public void LGN004() throws IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get(baseUrl);
		SignInPageObj sgn = new SignInPageObj(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		
		sgn.signClick();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.loginButton));
		
		sgn.setPassword(password);;
		sgn.clickLogin();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.ErrorColumn));
		
		boolean errorHeader = sgn.errorHeader.getText().contains("There is 1 error");
		boolean errorText = sgn.errorText.getText().contains("An email address required.");
		Assert.assertEquals(errorHeader, true);
		Assert.assertEquals(errorText, true);
		
		captureScreen(driver, "LGN004");
	}
	
	@Test(priority=4, groups = "negative")
	public void LGN005() throws IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get(baseUrl);
		SignInPageObj sgn = new SignInPageObj(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		
		sgn.signClick();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.loginButton));
		
		sgn.setEmail("email");
		sgn.setPassword(password);;
		sgn.clickLogin();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.ErrorColumn));
		
		boolean errorHeader = sgn.errorHeader.getText().contains("There is 1 error");
		boolean errorText = sgn.errorText.getText().contains("Invalid email address.");
		Assert.assertEquals(errorHeader, true);
		Assert.assertEquals(errorText, true);
		
		captureScreen(driver, "LGN005");
	}
	
	@Test(priority=5, groups = "negative")
	public void LGN006() throws IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get(baseUrl);
		SignInPageObj sgn = new SignInPageObj(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		
		sgn.signClick();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.loginButton));
		
		sgn.setEmail("alamovic7@gmail.com");
		sgn.setPassword(password);;
		sgn.clickLogin();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.ErrorColumn));
		
		boolean errorHeader = sgn.errorHeader.getText().contains("There is 1 error");
		boolean errorText = sgn.errorText.getText().contains("Authentication failed.");
		Assert.assertEquals(errorHeader, true);
		Assert.assertEquals(errorText, true);
		
		captureScreen(driver, "LGN006");
	}
	
	@Test(priority=6, groups = "negative")
	public void LGN007() throws IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get(baseUrl);
		SignInPageObj sgn = new SignInPageObj(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(sgn.signInButton));
		
		sgn.signClick();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.loginButton));
		
		sgn.setEmail(username);
		sgn.setPassword("wrongpassword");;
		sgn.clickLogin();
		
		wait.until(ExpectedConditions.visibilityOf(sgn.ErrorColumn));
		
		boolean errorHeader = sgn.errorHeader.getText().contains("There is 1 error");
		boolean errorText = sgn.errorText.getText().contains("Authentication failed.");
		Assert.assertEquals(errorHeader, true);
		Assert.assertEquals(errorText, true);
		
		captureScreen(driver, "LGN007");
	}
}
