package com.objectLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id ="nav-link-accountList-nav-line-1")
	private WebElement signInOption;
	@FindBy(xpath="//input[@type = 'email']")
	private WebElement userName;
	@FindBy(xpath ="//input[@type = 'submit']")
	private WebElement submitBtn;
	@FindBy(name="password")
	private WebElement apassword;
	@FindBy(xpath="//input[@id= 'signInSubmit']")
	private WebElement signInBtn;
	
	public void signInOptionBtn() {
		this.signInOption.click();
	}
	
	public void sendUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	
	public void continueBtn() {
		this.submitBtn.click();
	}
	public void passwordfield(String apassword) {
		this.apassword.sendKeys(apassword);
		
	}
	public void signinBtn() {
		this.signInBtn.click();
	}
}
