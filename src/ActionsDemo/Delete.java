package ActionsDemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Delete {

	public static void main(String[] args) throws Exception {
		
		//Enter data in the text field then select and delete to perform backspace
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		
		Actions actions = new Actions(driver);
		actions.sendKeys("Lakshmi").perform();
		Thread.sleep(5000);
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
		Thread.sleep(5000);
		
		actions.sendKeys(Keys.DELETE).perform();
		Thread.sleep(5000);
		driver.close();
		
		
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
//		actions.sendKeys(Keys.TAB).perform();
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
//		actions.sendKeys(Keys.DELETE).perform();
//		Thread.sleep(5000);
		
	}

}
