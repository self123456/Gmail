package dataDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//TO RETREIVE TEST DATA FROM THE EXCEL FILE

public class ExcelHelper {

	public Object[] [] getTestData(String path, String sheetName) throws Exception {
	
		Object[] [] data = null;
		
		File file = new File(path);
		FileInputStream inputstream = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(inputstream);
		Sheet sheet = workbook.getSheet(sheetName);
		data = new Object[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
		
		for(int row = sheet.getFirstRowNum(); row<=sheet.getLastRowNum(); row++ ) {
			
			for(int column = sheet.getRow(row).getFirstCellNum();
					column <sheet.getRow(row).getLastCellNum(); column++) {
				
				data[row] [column] = sheet.getRow(row).getCell(column).toString();
				
			}
			
		
		}
			workbook.close();
			return data;
		
	}
	
	
	
}
