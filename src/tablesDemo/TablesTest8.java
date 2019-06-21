package tablesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTest8 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		/*
		 * // Later practice emp working in london, tokyo 
		 * List<WebElement> list =
		 * driver.findElements(By.xpath("//table[@id='example']//tr//td[text()='New York']/..//td[@class=' select-checkbox']"));
		 * 
		 * for(int index=0; index<list.size(); index++) { list.get(index).click(); }
		 */
	
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='example']//tr//td[text()='New York']/..//td[@class=' select-checkbox']"));
		
		for(int index=0; index<list.size(); index++) {
			list.get(index).click();
		}
		
	Thread.sleep(5000);
	driver.close();
	
	}

}
