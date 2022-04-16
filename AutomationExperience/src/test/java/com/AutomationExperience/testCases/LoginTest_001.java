package com.AutomationExperience.testCases;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.AutomationExperience.pageObjects.BaseClass;
import com.AutomationExperience.pageObjects.MyAccountPageObj;
import com.AutomationExperience.pageObjects.SignInPageObj;
//import com.AutomationExperience.utilities.XLUtils;

import java.io.IOException;

import org.testng.Assert;

public class LoginTest_001 extends BaseClass {
	
//	@DataProvider(name = "login data")
//	String[][] getData() throws IOException{
//		String path = System.getProperty("user.dir") + 
//				"/src/test/java/com/AutomationExperience/testData/TestData.xlsx";
//		int rowNum = XLUtils.getRowCount(path, "logindata");
//		int colCount = XLUtils.getCellCount(path, "logindata", 1);
//		
//		String logindata[][] = new String[rowNum][colCount];
//		
//		for(int i = 1; i <= rowNum; i++) {
//			for(int j = 0; j < colCount; j++) {
//				logindata[i-1][j] = XLUtils.getCellData(path, "logindata", i, j);
//			}
//		}
//		return logindata;
//	}
	
	@Test
	public void login_01() throws IOException {
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
		
		captureScreen(driver, "login_01");
	}

}
