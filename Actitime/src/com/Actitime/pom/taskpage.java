package com.Actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.GenericLibrary.readDataFromXcelSheet;

public class taskpage {

	@FindBy(xpath = "//div[.='Add New']")
	private WebElement Addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	public taskpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return Addnewbtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}
	
	public WebElement getCustname() {
		return custname;
	}

	public void addnew() throws EncryptedDocumentException, IOException {
		readDataFromXcelSheet r=new readDataFromXcelSheet();
		String custmoername = r.readDataFromXcelfile("Sheet1", 1, 1);
		Addnewbtn.click();
		newcustomer.click();
		custname.sendKeys(custmoername);
	}
	
}
