package com.AutomationExperience.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageObj {

WebDriver xdriver;
	
	public MyAccountPageObj(WebDriver sdriver){
		
		xdriver = sdriver;
		PageFactory.initElements(sdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
	public WebElement orderHistory;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a")
	WebElement creditSlip;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a")
	WebElement myAddress;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
	WebElement personalInfo;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
	WebElement myWishlist;
	
	public void historyClick() {
		orderHistory.click();
	}
	
	public void creditClick() {
		creditSlip.click();
	}
	
	public void addressClick() {
		myAddress.click();
	}
	
	public void infoClick() {
		personalInfo.click();
	}
	
	public void wishlistClick() {
		myWishlist.click();
	}
}
