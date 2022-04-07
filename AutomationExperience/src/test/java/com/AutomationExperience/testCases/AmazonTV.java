package com.AutomationExperience.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.AutomationExperience.pageObjects.BaseClass;

import org.testng.Assert;

public class AmazonTV extends BaseClass {

	@Test
	public void amazonRyan() {
		WebDriverWait wt = new WebDriverWait(driver,6);
		
		driver.get("https://amazon.com");
		
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")).click();
		
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[15]/a")).click();
		
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[3]/div/div/div/div[2]/span/a[13]")).click();
		
		wt.until(ExpectedConditions.elementToBeClickable (By.xpath("//*[@id=\"p_n_size_browse-bin/1232879011\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"p_n_size_browse-bin/1232879011\"]")).click();
		
		wt.until(ExpectedConditions.elementToBeClickable (By.xpath("//*[@id=\"a-autoid-2-announce\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]")).click();
		
		wt.until(ExpectedConditions.elementToBeClickable (By.xpath("//*[@id=\"s-result-sort-select_2\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]")).click();
		
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String assertText = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/h2/a/span")).getText();
		
		boolean x = assertText.contains("LJ400B");
		
		Assert.assertTrue(x);
	}
}
