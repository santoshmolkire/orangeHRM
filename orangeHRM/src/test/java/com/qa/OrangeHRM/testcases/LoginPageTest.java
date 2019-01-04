package com.qa.OrangeHRM.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.qa.pages.LoginPage;
import com.OtangeHRM.qa.constants.AppConstants;
import com.OtangeHRM.qa.constants.AppConstants.BrowserNames;
import com.qa.orangeHRM.Base.TestBase;

public class LoginPageTest  {
	LoginPage loginPage;
	static WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=TestBase.initializeBrowser(BrowserNames.chrome, AppConstants.Orange_HRM_App_URL);

		
	}
	@Test(priority=1)
	public void loginIntoApp() {
		loginPage=new LoginPage();
		loginPage.login("Admin ", "admin123");
	}
	
	@Test(priority=2)
	public void orangeHRMLogo() {
		loginPage.validateHRMLogo();
	}
	
	@AfterMethod
	public void tearDown()  {
		
		driver.close();
	}
}