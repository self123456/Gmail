package Apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelTest1 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\AutomationSoftware\\resources\\Testdata\\HRMS.xls");
		FileInputStream inputstream = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(inputstream);
		System.out.println(workbook.getNumberOfSheets());
		
		
		  Sheet sheet = workbook.getSheet("Sheet1"); 
		  Row row = sheet.getRow(0);
		  //System.out.println(row.getCell(2));
		  System.out.println(row.getPhysicalNumberOfCells());
		  System.out.println(row.getFirstCellNum());
		  System.out.println(row.getLastCellNum());
		  
		 
		workbook.close();
		
	}

}
