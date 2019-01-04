package com.OrangeHRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.orangeHRM.Base.TestBase;

public class LoginPage extends TestBase{

	//pagefactory or object repository
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	@FindBy(id="logInPanelHeading")
	WebElement hrmLogo;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public DashBoardPage login(String uname,String pwd) {
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pwd);
		loginBtn.click();
		return new DashBoardPage();
	}
	public boolean validateHRMLogo() {
		boolean b=hrmLogo.isDisplayed();
		return b;
	}
	
}
