package tablesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTest2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
		//To find the number of rows
		List<WebElement> nofrows = driver.findElements(By.xpath("(//table)[1]//tr"));
		System.out.println(nofrows.size());
		
		Thread.sleep(5000);
		driver.close();
	}

}
