package Apache;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {

		//How to retrieve content from a row (xls or xlsx)
		
		Workbook workbook = null;
		File file = new File("D:\\AutomationSoftware\\resources\\Testdata\\HRMS.xls");
		FileInputStream inputStream = new FileInputStream(file);
		
		if(file.getName().endsWith(".xls")) {
			workbook = new HSSFWorkbook(inputStream);
		}else {
			workbook = new XSSFWorkbook(inputStream);
		}
		
		System.out.println(workbook.getNumberOfSheets());
		
		Sheet sheet = workbook.getSheet("Sheet5");
		Row row = sheet.getRow(1);
		//row = sheet.getRow(0);
		row = sheet.getRow(1);
	for(int colIndex=row.getFirstCellNum();colIndex<row.getLastCellNum(); colIndex++) {
		
		System.out.println(row.getCell(colIndex));
	}
		
	//	System.out.println(row.getCell(1));
	//	System.out.println(row.getCell(0));
		
		workbook.close();
	}

}
