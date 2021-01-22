package com.io.demo;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcelTest {

	public static void main(String[] args) {
		
		Workbook workbook = null;
		
		try {
			workbook = Workbook.getWorkbook(new File("./Files/Data.xls"));
			Sheet sheet = workbook.getSheet(0); // First sheet in excel
			System.out.println(sheet.getName()); // Print sheetname
			Cell cell1 = sheet.getCell(0,0);
			Cell cell2 = sheet.getCell(1,0);
			Cell cell3 = sheet.getCell(2,0);
			Cell cell4 = sheet.getCell(3,0);
						
			System.out.println(cell1.getContents() + ";" + cell2.getContents() + ";" + cell3.getContents() + ";" + cell4.getContents());
			
			int nColumns = sheet.getColumns(); // Column count
			System.out.println("No of columns is : " + nColumns);
			int nRows = sheet.getRows(); // Row Count
			System.out.println("No of rows is : " + nRows);
			
			for (int i = 0; i < nRows; i++) {
				for (int j = 0; j < nColumns; j++) {
					Cell celldata = sheet.getCell(j,i);
					System.out.println(celldata.getContents());
				}
			}
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if (workbook!=null) {
				workbook.close();
			}
		}


	}

}
