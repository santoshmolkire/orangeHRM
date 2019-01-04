package com.qa.orangeHRM.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.OtangeHRM.qa.constants.AppConstants.BrowserNames;

public class TestBase {
	
	public static WebDriver driver=null;
	
	public static WebDriver initializeBrowser(BrowserNames bName,String url) {
		switch(bName) {
		case chrome:
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case firefox:
			System.setProperty("webdriver.gecko.driver", "E:\\MySofts\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case IE:
			break;
		case safari:
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
		return driver;
	}
	
}
