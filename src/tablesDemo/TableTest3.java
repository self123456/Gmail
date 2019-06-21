package tablesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest3 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apsrtconline.in/oprs-web/");
		driver.findElement(By.id("txtJourneyDate")).click();
		
		//Retrieve entire content from table 1
		
	WebElement table = driver.findElement(By.xpath("(//table)[1]"));
	System.out.println(table.getText());
	
			
		Thread.sleep(5000);
		driver.close();
	}

}
