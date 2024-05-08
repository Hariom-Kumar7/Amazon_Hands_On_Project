package com.LoginScenario;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.objectLogin.AddToCartfunction;
import com.objectLogin.DifferentTypesCatgory;
import com.objectLogin.LoginPage;
import com.objectLogin.ProceedToPay;
import com.objectLogin.SearchFunctionality;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScenarioAmazon {

	WebDriver driver;
	LoginPage loginPage;
	SearchFunctionality searchFunctionality;
	AddToCartfunction addToCartfunction;
	DifferentTypesCatgory differntTypesCatgory;
	ProceedToPay proceedToPay;

	@BeforeMethod
	public void setUp() throws IOException {
		
		//create an object of the properties class which is related to java.util class
		Properties pr1 = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\kumar\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\Amazon_Hands_On_Project\\src\\test\\resources\\data.properties");
		pr1.load(fis);
	   //lunch the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.get(pr1.getProperty("baseURL"));
		loginPage = new LoginPage(driver);
		searchFunctionality =new SearchFunctionality(driver);
		addToCartfunction = new AddToCartfunction(driver);
		differntTypesCatgory = new DifferentTypesCatgory(driver);
		proceedToPay = new ProceedToPay(driver);
		
	}
	
	@Test(priority =0)
	public void testLoginOperation() throws InterruptedException {
		loginPage.signInOptionBtn();
		Thread.sleep(2000);
		loginPage.sendUserName("7258026878");
		Thread.sleep(2000);
		loginPage.continueBtn();
		Thread.sleep(2000);
		loginPage.passwordfield("9102427798");
		Thread.sleep(2000);
		loginPage.signinBtn();
		Thread.sleep(2000);
	}
	
	@Test(priority =1)
	public void searchFunction() throws InterruptedException {
		searchFunctionality.clickOntextField();
		searchFunctionality.sendInSearch("Laptop");
		Thread.sleep(4000);
		searchFunctionality.searchBtn();
		Thread.sleep(4000);
	
		
	}
	
	@Test(priority = 2)
	public void addToCartFunction() throws InterruptedException {
		searchFunctionality.clickOntextField();
		searchFunctionality.sendInSearch("Laptop");
		Thread.sleep(4000);
		searchFunctionality.searchBtn();
		Thread.sleep(4000);
		addToCartfunction.addtoCartBtn();
		Thread.sleep(10000);
		addToCartfunction.seeCart();
		Thread.sleep(5000);
		
	}
	@Test(priority = 3)
	public void category() throws InterruptedException {
		differntTypesCatgory.amazonMiniTv();
		Thread.sleep(2000);
		//differntTypesCatgory.amazonpay();
		//Thread.sleep(2000);
		differntTypesCatgory.movies();
	}
	@Test(priority =4)
	public void signintopayment() throws InterruptedException {
		loginPage.signInOptionBtn();
		loginPage.sendUserName("7258026878");
		Thread.sleep(2000);
		loginPage.continueBtn();
		loginPage.passwordfield("9102427798");
		Thread.sleep(2000);
		loginPage.signinBtn();
		Thread.sleep(2000);
		searchFunctionality.clickOntextField();
		Thread.sleep(2000);
		searchFunctionality.sendInSearch("Laptop");
		Thread.sleep(2000);
		searchFunctionality.searchBtn();
		Thread.sleep(2000);
		addToCartfunction.addtoCartBtn();
		Thread.sleep(10000);
		addToCartfunction.seeCart();
		Thread.sleep(5000);
		proceedToPay.checkout();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		
		
	}
	

}
//public class LoginScenarioAmazon {

//}
