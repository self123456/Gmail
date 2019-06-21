package tablesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest4 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
		//find number of columns from a row
		
		//List<WebElement> nofcolumns = driver.findElements(By.xpath("(//table)[1]//thead//th"));
		
		//List<WebElement> nofcolumns = driver.findElements(By.xpath("((//table)[1]//tr)//th"));
		
		List<WebElement> columnCount = driver.findElements(By.xpath("(//table)[1]//tr//th"));	
		System.out.println(columnCount.size());
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
