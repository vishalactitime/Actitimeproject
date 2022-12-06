package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
@FindBy(id="logoutLink")
private WebElement logoutlink;


@FindBy(xpath="//div[.='Tasks']")
private  WebElement tasklink;

@FindBy(xpath="//div[.='Reports']")
private WebElement reportlink;

@FindBy(xpath="//div[.='Users']")
private WebElement userlink;

public homepage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public WebElement getLogoutlink() {
	return logoutlink;
}

public WebElement getTasklink() {
	return tasklink;
}

public WebElement getReportlink() {
	return reportlink;
}

public WebElement getUserlink() {
	return userlink;
}

public void logout() {
	logoutlink.click();
}
public void report() {
	reportlink.click();
}


public void tasklink() {
	tasklink.click();
}


}