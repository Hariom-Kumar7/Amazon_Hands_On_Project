package com.objectLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentTypesCatgory {
	WebDriver driver;
	public DifferentTypesCatgory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
       @FindBy(linkText = "Amazon miniTV")
       private WebElement clickOnMintiTV; 
       @FindBy(linkText = "Amazon Pay")
       WebElement clickOnamazonPay;
       @FindBy(xpath = "//span[@data-testid='appnavbar-menuitem-ct-movies']")
       WebElement movies;
       
       public void amazonMiniTv() {
    	   this.clickOnMintiTV.click();
    	   
       }
       public void amazonpay() {
    	   this.clickOnamazonPay.click();
    	   
       }
       public void movies() {
    	   this.movies.click();
       }
}
//public class DifferentTypesCatgory {

//}
