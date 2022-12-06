package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDataFromXcelSheet {
public String readDataFromXcelfile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Testdata/actitime.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
}
}
