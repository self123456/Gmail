package tablesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTest6 {
	
	public static void main(String[] args) throws Exception {
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get(
		 * "https://datatables.net/extensions/select/examples/initialisation/checkbox.html"
		 * );
		 * 
		 * List<WebElement> list = driver.findElements(By.xpath("//table"));
		 * System.out.println("Number of Tables: "+list.size());
		 * 
		 * List<WebElement> rows =
		 * driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
		 * System.out.println("Number Of Rows: "+rows.size());
		 * 
		 * List<WebElement> columns =
		 * driver.findElements(By.xpath("//table[@id='example']//thead//th"));
		 * System.out.println("Number Of Columns: "+columns.size());
		 * 
		 * WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		 * System.out.println(table.getText());
		 * System.out.println("--------------------------------------");
		 * 
		 * for (int index=1; index<=rows.size(); index++) { WebElement row =
		 * driver.findElement(By.xpath("(//table[@id='example']//tr)["+index+"]"));
		 * 
		 * System.out.println(row.getText()); }
		 * System.out.println("--------------------------------------");
		 * System.out.println("--------------------------------------");
		 * System.out.println("Column 4 Data");
		 * 
		 * for (int rowIndex=2; rowIndex<=11; rowIndex++) { WebElement column =
		 * driver.findElement(By.xpath("((//table[@id='example']//tr)["+rowIndex+
		 * "]//td)[4]")); 
		 * System.out.println(column.getText()); }
		 * 
		 * Thread.sleep(4000); driver.close();
		 */
		
	
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		List<WebElement> list = driver.findElements(By.xpath("//table"));
		System.out.println("Number of Tables: "+ list.size() );
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
		System.out.println("Number of Rows: "+row.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='example']//thead//th"));
		System.out.println("Number of Columns: "+column.size());
		
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		System.out.println("______________Text____________");
		System.out.println(table.getText());
		
		for(int index = 1; index<=row.size(); index++) {
			
			WebElement row1 = driver.findElement(By.xpath("(//table[@id='example']//tr)["+index+"]"));
														
			System.out.println(row1);
			System.out.println(row1.getText());
			
			System.out.println("-----------Column Data-----------");
			for(int rowindex=2; rowindex<=11; rowindex++) {
				WebElement columns = driver.findElement(By.xpath("(//table[@id='example']//tr)["+rowindex+"]//td[4]"));
				
			System.out.println(columns.getText());
			
			}
		}
		
		
	}

}


