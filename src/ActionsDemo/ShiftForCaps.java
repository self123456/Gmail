package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShiftForCaps {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement userName = driver.findElement(By.name("userName"));
		
		Actions actions = new Actions(driver);
		actions.sendKeys(userName, "mercury").perform();
		//actions.sendKeys("Lakshmi").perform();
		Thread.sleep(5000);
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
		Thread.sleep(5000);
		//actions.sendKeys(Keys.TAB).perform();
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		Thread.sleep(5000);
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
