package com.Actitime.GenericLibrary;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenerImplementation extends Baseclass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("tesrscript paased",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();  //it is used to which tset failed this method take screenshot nd save the screenshot of method name
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);//store in variable
		File destination = new File("./Screenshot/"+name+".png");//create folder nd write the folder path and change name to ss.png to +name+ bcz take 2 scrrnshot overide it
	try {
		Files.copy(src, destination);
	}catch(Exception e) {
		
	}	
	driver.close();
}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
	}


