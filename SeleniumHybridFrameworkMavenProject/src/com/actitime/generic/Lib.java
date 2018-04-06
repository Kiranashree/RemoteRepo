package com.actitime.generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Lib.java class file to create all project related generic functions
public class Lib implements IAutoConstant{
	
	public static Workbook wb;
	public static String getCellValue(String sheet, int row, int column){
		String cellValue=null;
		try {
			wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		    cellValue = wb.getSheet(sheet).getRow(row).getCell(column).toString();
		} catch (Exception e) {
			
		} 
		return cellValue;
	}

	public static int getRowCount(String sheet){
		
		int rowCount=0;
		try {
			wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			rowCount = wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			
		} 
		return rowCount;
	}

	public static String getPropertyValue(String key){
		String propertyValue = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_PATH));
			propertyValue = prop.getProperty(key);
		} catch (Exception e) {
		} 
		return propertyValue;
	}
	
	
}


