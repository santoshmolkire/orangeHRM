package com.OrangeHRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangeHRM.Base.TestBase;

public class DashBoardPage extends TestBase {

	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement admin_userManagemennt;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement users;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIM;
	
	@FindBy(id="menu_pim_Configuration")
	WebElement configuration;
	
	@FindBy(id="menu_admin_pimCsvImport")
	WebElement datareport;
	
	@FindBy(id="pimCsvImport_csvFile")
	WebElement file;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement employeeList;
	
	public DashBoardPage(){
		PageFactory.initElements(driver, this);
	}
	//actions
	public UserManagementPage clickOnAdmin() throws InterruptedException {
		admin.click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(admin_userManagemennt).build().perform();
		users.click();
		return new UserManagementPage();
	}
	
	
	
}
