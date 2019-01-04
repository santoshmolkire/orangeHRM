package com.OrangeHRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagementPage {

	@FindBy(name="searchSystemUser_userName")
	WebElement username;
	
	@FindBy(name="searchSystemUser_userType")
	WebElement userRoll;
	
	@FindBy(name="searchSystemUser_employeeName_empName")
	WebElement employeeName;
	
	
	
	
}
