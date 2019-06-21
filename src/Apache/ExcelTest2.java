package Apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest2 {

	public static void main(String[] args) throws Exception {
	
		File file = new File("D:\\AutomationSoftware\\resources\\Testdata\\HRMS.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		
		System.out.println(workbook.getNumberOfSheets());
		
		Sheet sheet = workbook.getSheet("Sheet1");
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getFirstRowNum());
		System.out.println(sheet.getLastRowNum());
		
		
		
		workbook.close();

	}

}
