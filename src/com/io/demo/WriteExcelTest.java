package com.io.demo;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteExcelTest {

	public static void main(String[] args) throws WriteException, IOException {
		
		WritableWorkbook workbook = null;
		
		try {
			workbook = Workbook.createWorkbook(new File("./Files/Test Results.xls")); // Create a new excel
			
			// Create an excel sheet
			WritableSheet sheet = workbook.createSheet("Report", 0);
			
			// Write data into an excel sheet which is created above
			Label label = new Label(0,0, "Rajesh");
			sheet.addCell(label);
			
			//Number number = new Number(0,2,2);
			
			label = new Label(1,0,"Bala");
			sheet.addCell(label);
			
			label = new Label(2,0,"Riya");
			sheet.addCell(label);
			
			WritableSheet worksheet = workbook.getSheet(0);
			WritableCell c = worksheet.getWritableCell(0,0);
			WritableCellFormat newFormat = new WritableCellFormat();
			newFormat.setBackground(Colour.BLUE);
	
			c.setCellFormat(newFormat);
		
			workbook.write();

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if (workbook!=null) {
				workbook.close();
			}
		}


	}

}
