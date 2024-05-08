package com.objectLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToPay {
	WebDriver driver;
	
	public ProceedToPay(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	 WebElement buynow;
	
	public void checkout() {
		this.buynow.click();
	}
}
