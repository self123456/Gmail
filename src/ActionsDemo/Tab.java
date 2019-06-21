package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tab {

	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	Actions actions = new Actions(driver);
	actions.sendKeys("Lakshmi").perform();
	Thread.sleep(5000);
	
	actions.sendKeys(Keys.TAB).perform();
	Thread.sleep(3000);
	
	actions.sendKeys("Chinthalpudi").perform();
	Thread.sleep(3000);
	
	actions.sendKeys(Keys.TAB).perform();
	Thread.sleep(3000);
	
	actions.sendKeys("7995248521").perform();
	Thread.sleep(3000);
	
	WebElement Bday = driver.findElement(By.id("day"));
	actions.sendKeys(Bday, "26").perform();
	Thread.sleep(5000);
	
	
	WebElement month = driver.findElement(By.id("month"));
	Select select = new Select(month);
	month.isEnabled();
	select.selectByIndex(12);
	System.out.println(month.getText());
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	select = new Select(year);
	select.selectByVisibleText("1982");
	Thread.sleep(5000);
	driver.close();
		
	
	
	}

}
