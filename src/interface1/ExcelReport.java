package interface1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReport implements Reporter{

	Workbook workbook = null;
	Sheet sheet = null;
	FileOutputStream fileoutputstream = null;
	

	@Override
	public void openExcelReport() {
	workbook = new HSSFWorkbook();
	sheet = workbook.createSheet("Sheet1");
		
	}

	@Override
	public void appendToExcelReport() {
	
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("user1");
		row.createCell(1).setCellValue("user2");
		row.createCell(2).setCellValue("user3");
		row.createCell(3).setCellValue("user3");
	
	}

	@Override
	public void closeTheExcelReport() {
		try {
			
		fileoutputstream = new FileOutputStream("D:\\TestData.xls");
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		try {
		
		workbook.write(fileoutputstream);
		workbook.close();
		}catch (Exception e) {
			
		}
		
	}

}
