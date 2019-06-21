package Apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1 {


	public static void main(String[] args) throws Exception {
		
	Workbook workbook = null;
	
	File file1 = new File("D:\\AutomationSoftware\\resources\\Testdata\\HRMS.xls");
	FileInputStream inputStream = new FileInputStream(file1);
	
	if(file1.getName().endsWith(".xlsx")){
		workbook = new XSSFWorkbook(inputStream);
			
	}else {
		workbook = new HSSFWorkbook(inputStream);
	}
	
	System.out.println(workbook.getNumberOfSheets());
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	System.out.println(sheet.getFirstRowNum());
	System.out.println(sheet.getPhysicalNumberOfRows());
	System.out.println(sheet.getLastRowNum());
	
	Row row = sheet.getRow(0);
	System.out.println(row.getCell(0).getColumnIndex());
	System.out.println(row.getFirstCellNum());
	System.out.println(row.getLastCellNum());
	
	
	workbook.close();
	}

}
