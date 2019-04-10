package com.automation.selenium190320129;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
public static void main(String[] args) throws RuntimeException, IOException {
	FileInputStream fip = null;
	fip = new FileInputStream("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\automation\\selenium190320129\\Gmail.xls");
    Workbook workbook = WorkbookFactory.create(fip);
    Sheet sheet = workbook.getSheet("Gmail_excel");
    Row row = sheet.getRow(0);
    Cell cell = row.getCell(0);
    String data = cell.getStringCellValue();
    System.out.println(data);



}
}
