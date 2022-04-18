package com.AutomationExperience.pageObjects;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.AutomationExperience.utilities.XLUtils;

public class DataProviderExample {

	@DataProvider(name = "login data")
	String[][] getData() throws IOException{
		String path = System.getProperty("user.dir") + 
				"/src/test/java/com/AutomationExperience/testData/TestData.xlsx";
		int rowNum = XLUtils.getRowCount(path, "logindata");
		int colCount = XLUtils.getCellCount(path, "logindata", 1);
		
		String logindata[][] = new String[rowNum][colCount];
		
		for(int i = 1; i <= rowNum; i++) {
			for(int j = 0; j < colCount; j++) {
				logindata[i-1][j] = XLUtils.getCellData(path, "logindata", i, j);
			}
		}
		return logindata;
	}
}
