package com.objectLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionality {
WebDriver driver;
	
	public SearchFunctionality(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath ="//input[@type='text']")
		private WebElement clickOnsearch;
		@FindBy(xpath ="//input[@type='text']")
		private WebElement search;
		@FindBy(xpath = "//input[@type='submit']")
		private WebElement clickOnsearchBtn;
		
		
	   public void clickOntextField() {
		   this.clickOnsearch.click();
	   }
		public void sendInSearch(String search ) {
			this.search.sendKeys(search);
		}
		public void searchBtn() {
			this.clickOnsearchBtn.click();
		}

}
