package interface1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript  {

	public static void main(String[] args) {
		
		Reporter report = null;
		String reportType = "Excel";
		switch (reportType) {
		
		case "Word":
			report = new WordReport();
			break;
			
		case "Excel":
			report = new ExcelReport();
			break;
			
		}
		report.openExcelReport();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		report.appendToExcelReport();
		driver.close();
		report.closeTheExcelReport();
		
		
	}

}
