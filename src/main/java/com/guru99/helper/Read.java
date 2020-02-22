package com.guru99.helper;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read {
	
	Workbook wb;
	FileInputStream fis;
	XSSFSheet sheet;
	int rowCtr = 0;
	

	// open the file
	public void openFile(String file, String shtName) {
		
		// open the file
		// open the workbook using the stream
		// open the sheet with supplied sheet name
		
		try {
		fis=new FileInputStream(file);
		wb = new XSSFWorkbook(fis); //or new HSSFWorkbook();
		sheet = (XSSFSheet) wb.getSheet(shtName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("opened succesfully");
	}
	
	// read next row
	public String[] getNextRow() {
		
		// use the row counter to keep track of which row we're getting
		// increment the counter for reading next row
		// get the cells and return them as list of strings
		
		Row row = sheet.getRow(rowCtr++);
		List<String> cells = new ArrayList<String>();
		for (Cell cell : row) {
			String cellValue = cell.getStringCellValue();
			cells.add(cellValue);
		}
		if (cells.size() == 0) return null;
		return cells.toArray(new String[0]);
	}
	
	// reset
	// if we awant to set the row number where we want to start
	// example to skip the header row, we call resetRow(1)
	public void resetRowCounter(int row) {
		rowCtr = row;
	}
}
