package com.qa.OrangeHRM.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.OrangeHRM.qa.pages.LoginPage;
import com.OtangeHRM.qa.constants.AppConstants;
import com.OtangeHRM.qa.constants.AppConstants.BrowserNames;
import com.qa.orangeHRM.Base.TestBase;

public class Test extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		initializeBrowser(BrowserNames.chrome, AppConstants.Orange_HRM_App_URL);
		LoginPage loginPage = new LoginPage();
		loginPage.login("Admin", "admin123");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).build().perform();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_4\"]")).click();

	}

}




//*[@id="ohrmList_chkSelectRecord_4"]