package Apache;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BothFormats {

	public static void main(String[] args) throws Exception {
		Workbook workbook = null;
		
		File file = new File("D:\\\\AutomationSoftware\\\\resources\\\\Testdata\\\\HRMS.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		
		if(file.getName().endsWith(".xls")) {
			workbook = new HSSFWorkbook(inputStream);
			
		}else {
			workbook = new XSSFWorkbook(inputStream);
		}
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
