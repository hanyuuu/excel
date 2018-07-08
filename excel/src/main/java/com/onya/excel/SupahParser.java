package com.onya.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class SupahParser {
	private InputStream inputStream = null;
	private HSSFWorkbook workBook = null;
	SupahParser(String fileName){
		try {
            inputStream = new FileInputStream(fileName);
            workBook = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void setDataInCell(int Row, int CellNum, String text) throws IOException {
		 	Sheet sheet = workBook.getSheetAt(0);
	        Row row = sheet.getRow(Row-1);
	        Cell cell = row.getCell(CellNum-1);
	        if (cell == null)
	            cell = row.createCell(CellNum-1);
	        cell.setCellType(Cell.CELL_TYPE_STRING);
	        cell.setCellValue(text);
	        
	    }
	
	public void save() throws IOException{
		FileOutputStream fileOut = new FileOutputStream("workbook.xls");
        workBook.write(fileOut);
        fileOut.close();
	}
}
