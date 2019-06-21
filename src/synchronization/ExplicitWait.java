package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/MQWorkSpace/Gmail/sync/sync/WaitUntilTextFieldIsVisible.html");
	
	driver.findElement(By.id("firstName")).sendKeys("Lakshmi");
	
	WebDriverWait wait = new WebDriverWait(driver, 600);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
	driver.findElement(By.id("lastName")).sendKeys("Chinthalpudi");
	Thread.sleep(5000);
	driver.close();
	

	}

}
