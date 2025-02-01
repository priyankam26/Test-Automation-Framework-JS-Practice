package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderUtility {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File xlsxFile = new File(System.getProperty("user.dir")+ "//testData//LoginData.xlsx");
		// XLSX File
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(xlsxFile);
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("LoginTestData");
		Iterator<Row> rowIterator = xssfSheet.iterator();
		
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			
			Cell firstCell = row.getCell(0);
			Cell secondCell = row.getCell(1);
			System.out.println(firstCell.toString());
			System.out.println(secondCell.toString());
		}
	}
}
