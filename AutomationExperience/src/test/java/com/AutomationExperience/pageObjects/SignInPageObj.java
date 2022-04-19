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
	public WebElement signInButton;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signInButtonAfter;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement loginEmail;
	
	@FindBy(id="passwd")
	WebElement loginPass;
	
	@FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
	WebElement forgotPassword;
	
	@FindBy(id="SubmitLogin")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[1]")
	public WebElement ErrorColumn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/p")
	public WebElement errorHeader;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li")
	public WebElement errorText;
	
	@FindBy(id = "email_create")
	public WebElement createEmailText;
	
	@FindBy(id = "SubmitCreate")
	public WebElement createAccountButton;
	
	@FindBy(id = "create_account_error")
	public WebElement signupErrorAlert;
	
	@FindBy(xpath = "//*[@id=\"create_account_error\"]/ol/li")
	public WebElement signupErrorText;
	
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
	
	public void createText(String createEmail) {
		createEmailText.sendKeys(createEmail);
	}
	
	public void createButton() {
		createAccountButton.click();
	}
}
