package ActionsDemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KbUpDown {

	public static void main(String[] args) throws Exception {
		WebDriver diver = new ChromeDriver();
	diver.manage().window().maximize();
	diver.get("https://mobiscroll.com/");
		
	Actions actions = new Actions(diver);
	actions.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(5000);
	actions.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(5000);
	actions.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(5000);
	actions.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(5000);
	
	actions.sendKeys(Keys.PAGE_UP).perform();
	Thread.sleep(5000);
	actions.sendKeys(Keys.PAGE_UP).perform();
	Thread.sleep(5000);
	actions.sendKeys(Keys.PAGE_UP).perform();
	Thread.sleep(5000);
	actions.sendKeys(Keys.PAGE_UP).perform();
	diver.close();	
		
		
	}

}
