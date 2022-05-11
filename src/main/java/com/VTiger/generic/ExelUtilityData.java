package com.VTiger.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelUtilityData {
	public  String readDataFromExcel(String sheet,int row,int cell) throws Throwable {
		
	
	FileInputStream fis=new FileInputStream("D:\\Selenium\\SDET_HYD_6\\SDET_06.xlsx");
return WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

	
	
}
	public  int readNumericDataFromExcel(String sheet,int row,int cell) throws Throwable {
		
		
		FileInputStream fis=new FileInputStream("D:\\Selenium\\SDET_HYD_6\\SDET_06.xlsx");
	int value=(int) WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
	return value;	 
		
		
	}
public  int getLastRow(String sheet) throws Throwable {
		
		
		FileInputStream fis=new FileInputStream("D:\\Selenium\\SDET_HYD_6\\SDET_06.xlsx");
	 int lastrow = WorkbookFactory.create(fis).getSheet(sheet).getLastRowNum();
	 return lastrow;
	

}
}