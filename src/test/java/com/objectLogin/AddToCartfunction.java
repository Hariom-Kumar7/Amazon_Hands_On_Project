package com.objectLogin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartfunction {
WebDriver driver;
	
	public AddToCartfunction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@id='a-autoid-3-announce']")
	 private WebElement addtoCart;
	//@FindBy(xpath = "//a[@id='nav-cart']")
	@FindBy(id ="nav-cart")
	WebElement seeAddtoCart;
	
	public void addtoCartBtn() {
		this.addtoCart.click();
	}
	public void seeCart() {
		this.seeAddtoCart.click();
	}
}

//public class AddToCartfunction {

//}
