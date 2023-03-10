package com.telus.utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	static String excelPath;
	static String sheetName;
	
	public ExcelUtility(String excelPath,String sheetName) {
		
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// get row count
	public int getRowCount() {
		int rowCount =0;
		
		try {
			rowCount =  sheet.getPhysicalNumberOfRows();
			//System.out.println("Row count = "+ rowCount);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowCount;
		
	}
	
	// get cell data
	public String getCellData(int rowNum,int colNum) {
		String cellData  = null;
		
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return cellData;
	}	
		

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcelUtility excel = new ExcelUtility(".\\TestData\\RegisterDemoTestData.xlsx","RegisterUser");

		int rowCount = excel.rowCount();
		for(int row=1;row<rowCount;row++) {
			
			String url = excel.getCellData(row, 0);			
			String title = excel.getCellData(row, 1);			
			String firstName = excel.getCellData(row, 2);
			
			System.out.println(url);
			System.out.println(title);
			System.out.println(firstName);
			
		}
		
	} */

}
