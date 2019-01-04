package com.qa.OrangeHRM.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.qa.pages.DashBoardPage;
import com.OrangeHRM.qa.pages.LoginPage;
import com.OtangeHRM.qa.constants.AppConstants;
import com.OtangeHRM.qa.constants.AppConstants.BrowserNames;
import com.qa.orangeHRM.Base.TestBase;

public class DashBoardPageTest extends TestBase {

	LoginPage loginPage;
	//static WebDriver driver;
	DashBoardPage dashBoardPage;
	DashBoardPageTest(){
		super();
	}
	@BeforeMethod
	public void setup() {
		System.out.println("Setup BeforeMethod");
		DashBoardPageTest.driver=initializeBrowser(BrowserNames.chrome, AppConstants.Orange_HRM_App_URL);
		loginPage=new LoginPage();
		loginPage.login("Admin", "admin123");
		System.out.println("setup BeforeMethod completed");
		
	}
	@Test
	public void clickOnUser() throws InterruptedException {
		System.out.println("Cick BeforeMethod");
		dashBoardPage=new DashBoardPage();
		dashBoardPage.clickOnAdmin();
		System.out.println("Click BeforeMethod completed");
		
	}

	@AfterMethod
	public void tearDown2()  {
		System.out.println("teardown2 BeforeMethod");
		DashBoardPageTest.driver.close();
		//driver.close();
		System.out.println("teardown2 BeforeMethod cmpleted");
	}

}
