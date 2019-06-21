package tablesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTest5 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
		WebElement cell = driver.findElement(By.xpath("(((//table)[1]//tr)[2]//td)[1]"));
		
		System.out.println(cell.getAttribute("value"));
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
