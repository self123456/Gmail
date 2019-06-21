package tablesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTest1 {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apsrtconline.in/oprs-web/");
		driver.findElement(By.id("txtJourneyDate")).click();
		
		// Retrieve data from a row 		
		
		WebElement rowtxt = driver.findElement(By.xpath("(//table)[1]//thead"));
		System.out.println(rowtxt.getText());
		
		Thread.sleep(3000);
		driver.close();

	}

}
