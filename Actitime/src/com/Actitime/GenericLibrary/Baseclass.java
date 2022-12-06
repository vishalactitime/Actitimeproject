package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Actitime.pom.Loginpage;
import com.Actitime.pom.homepage;

public class Baseclass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
	Reporter.log("database connected",true);
	}
	
	@AfterSuite
	public void databasedisconnected() {
		Reporter.log("database disconnected",true);
	}
	
	
	@BeforeClass
	public void  launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
		
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		readDataFromPropertyFile data=new readDataFromPropertyFile();
		String URL = data.readDataromProperty("url");
		String un = data.readDataromProperty("username");
		String pw = data.readDataromProperty("password");
		driver.get(URL);
		Loginpage lp=new Loginpage(driver);
		lp.logintoActitime(un, pw);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(10000);
		homepage hp=new homepage(driver);
		Reporter.log("logout to application");
	}
	
}
