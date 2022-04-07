package com.AutomationExperience.testCases;
import org.testng.annotations.Test;
import com.AutomationExperience.pageObjects.BaseClass;
import com.AutomationExperience.pageObjects.MyAccountPageObj;
import com.AutomationExperience.pageObjects.SignInPageObj;
import org.testng.Assert;

public class LoginTest_001 extends BaseClass {
	
	@Test
	public void login_01() {
		driver.get(baseUrl);
		SignInPageObj sgn = new SignInPageObj(driver);
		MyAccountPageObj acc = new MyAccountPageObj(driver);
		
		sgn.signClick();
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			System.out.println("interrupted");
		}
		
		sgn.setEmail(username);
		sgn.setPassword(password);
		sgn.clickLogin();
		
		String Assert1 = driver.getTitle().toString();
		
		Assert.assertEquals(Assert1, "My account - My Store");
		Assert.assertTrue(acc.orderHistory.isDisplayed());
	}

}
