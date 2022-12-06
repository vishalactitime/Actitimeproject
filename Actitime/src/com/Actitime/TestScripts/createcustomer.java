package com.Actitime.TestScripts;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.pom.homepage;
import com.Actitime.pom.taskpage;
@Listeners(com.Actitime.GenericLibrary.ListenerImplementation.class)//it is used to link to genericlibrary package
public class createcustomer extends Baseclass {
 
	
	@Test
	public void ghcreatecustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		homepage hp=new homepage(driver);
	hp.tasklink();    //click on task page
	taskpage tp=new taskpage(driver);
	tp.addnew();  //in task page click on add  new button
	Thread.sleep(15000);
	
	}
	
	
	
}
