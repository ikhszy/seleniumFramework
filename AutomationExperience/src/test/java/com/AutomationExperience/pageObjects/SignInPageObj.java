package com.AutomationExperience.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageObj {
	
	WebDriver xdriver;
	
	public SignInPageObj(WebDriver sdriver){
		
		xdriver = sdriver;
		PageFactory.initElements(sdriver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement signInButton;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement loginEmail;
	
	@FindBy(id="passwd")
	WebElement loginPass;
	
	@FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
	WebElement forgotPassword;
	
	@FindBy(id="SubmitLogin")
	WebElement loginButton;
	
	public void signClick() {
		signInButton.click();
	}
	
	public void setEmail(String email) {
		loginEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		loginPass.sendKeys(password);
	}
	public void forgotPass() {
		forgotPassword.click();
	}
	
	public void clickLogin() {
		loginButton.click();
	}
}
