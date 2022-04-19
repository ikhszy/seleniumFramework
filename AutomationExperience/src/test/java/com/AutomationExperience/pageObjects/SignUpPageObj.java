package com.AutomationExperience.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObj {

WebDriver xdriver;
	
	public SignUpPageObj(WebDriver sdriver){
		
		xdriver = sdriver;
		PageFactory.initElements(sdriver, this);
	}
	
	@FindBy(id = "id_gender1")
	WebElement radioMale;
	
	@FindBy(id = "id_gender2")
	WebElement radioFemale;
	
	@FindBy(id = "customer_firstname")
	WebElement personalFirstName;
	
	@FindBy(id = "customer_lastname")
	WebElement personalLastName;
	
	@FindBy(id="email")
	public WebElement personalEmail;
	
	@FindBy(id="passwd")
	WebElement personalPassword;
	
	@FindBy(id="days")
	WebElement personalDayDropdown;
	
	@FindBy(id="months")
	WebElement personalMonthDropdown;

	@FindBy(id="years")
	WebElement personalYearDropdown;
	
	@FindBy(id="newsletter")
	WebElement personalNewsletter;
	
	@FindBy(id="optin")
	WebElement personalOffers;
	
	@FindBy(id="firstname")
	WebElement addressFirstName;
	
	@FindBy(id="lastname")
	WebElement addressLastName;
	
	@FindBy(id="company")
	WebElement addressCompany;
	
	@FindBy(id="address1")
	WebElement addressAddress;
	
	@FindBy(id="address2")
	WebElement addressAddress2;
	
	@FindBy(id="city")
	WebElement addressCity;
	
	@FindBy(id="id_state")
	WebElement addressStateDropdown;
	
	@FindBy(id="postcode")
	WebElement addressZipcode;
	
	@FindBy(id="id_country")
	WebElement addressCountryDropdown;
	
	@FindBy(id="other")
	WebElement addressInformation;
	
	@FindBy(id="phone")
	WebElement addressHomePhone;
	
	@FindBy(id="phone_mobile")
	WebElement addressMobilePhone;
	
	@FindBy(id="alias")
	WebElement addressAlias;
	
	@FindBy(id="submitAccount")
	WebElement SignupButton;
	
	public void setPersonalFirstName(String persFirstName) {
		personalFirstName.sendKeys(persFirstName);
	}
	
	public void setPersonalLastName(String persLastName) {
		personalLastName.sendKeys(persLastName);
	}
	
	public void setPersonalEmail(String persEmail) {
		personalEmail.sendKeys(persEmail);
	}
	
	public void setPersonalPassword(String persPassword) {
		personalPassword.sendKeys(persPassword);
	}
	
	public void setPersonalDay() {
		personalDayDropdown.click();
	}
	
	public void setPersonalMonth() {
		personalMonthDropdown.click();
	}
	
	public void setPersonalYear() {
		personalYearDropdown.click();
	}
	
	public void setPersonalNews() {
		personalNewsletter.click();
	}
	
	public void setPersonalOffer() {
		personalOffers.click();
	}
	
	public void setAddressFirstName(String addFirstName) {
		addressFirstName.sendKeys(addFirstName);
	}
	
	public void setAddressLastName(String addLastName) {
		addressLastName.sendKeys(addLastName);
	}
	
	public void setAddressCompany(String addCompany) {
		addressCompany.sendKeys(addCompany);
	}
	
	public void setAddressAddress(String addAddress) {
		addressAddress.sendKeys(addAddress);
	}
	
	public void setAddressAddress2(String addAddress2) {
		addressAddress2.sendKeys(addAddress2);
	}
	
	public void setAddressCity(String addCity) {
		addressCity.sendKeys(addCity);
	}
	
	public void setAddressState() {
		addressStateDropdown.click();
	}
	
	public void setAddressZipcode(String addZip) {
		addressZipcode.sendKeys(addZip);
	}
	
	public void setAddressCountry() {
		addressCountryDropdown.click();
	}
	
	public void setAddressInfo(String addInfo) {
		addressInformation.sendKeys(addInfo);
	}
	
	public void setAddressPhone(String addPhone) {
		addressHomePhone.sendKeys(addPhone);
	}
	
	public void setAddressMobile(String addMobile) {
		addressMobilePhone.sendKeys(addMobile);
	}
	
	public void setAddressAlias(String addAlias) {
		addressAlias.sendKeys(addAlias);
	}
	
	public void clickSignup() {
		SignupButton.click();
	}
}
