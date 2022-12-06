package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readDataFromPropertyFile {
public String readDataromProperty(String key) throws IOException {
	FileInputStream fis =new FileInputStream("./Testdata/commondata.proprety");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
			
	
}
}
