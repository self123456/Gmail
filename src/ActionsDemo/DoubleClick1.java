package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(0);
		
			WebElement dblClick = driver.findElement
					(By.xpath("//span[text()='Double click the block']//preceeding-sibling::*"));
		Actions actions = new Actions(driver);
		//actions.moveToElement(dblClick);
		//actions.doubleClick();
		actions.doubleClick(dblClick).perform();
		Thread.sleep(5000);
		
		WebElement dblClick2 = driver.findElement(By.xpath("//div[@class='dbl']"));
		actions.moveToElement(dblClick2);
		actions.doubleClick().perform();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
