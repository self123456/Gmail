package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class OpenBrowser {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("u_0_j")).sendKeys("Lakshmi");
	
	Screen screen = new Screen();
	//screen.type("D:\\AutomationSoftware\\resources\\Sikuli\\FirstName", "Lakshmi");
	
	screen.type(Key.TAB);
	Thread.sleep(10000);
	
	screen.type(Key.TAB);
	Thread.sleep(10000);
	
	screen.type(Key.TAB);
	Thread.sleep(10000);
	
	screen.type(Key.TAB);
	Thread.sleep(10000);
	
	screen.click("D:\\AutomationSoftware\\resources\\Sikuli\\rbmale");
	
	Thread.sleep(2000);
	
	driver.close();
		
		
	//"D:\\AutomationSoftware\\resources\\Sikuli\\FirstName"
	}

}
