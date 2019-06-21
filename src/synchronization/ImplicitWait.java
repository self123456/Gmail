package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///D:/MQWorkSpace/Gmail/sync/sync/WaitUntilTextFieldIsVisible.html");
		
	driver.findElement(By.id("firstName")).sendKeys("Laxmi");
    driver.findElement(By.id("lastName")).sendKeys("Chinthalpudi");
		
	//	System.out.println(lstname.isDisplayed());
	//	System.out.println(lstname.isEnabled());
		Thread.sleep(5000);
		driver.close();
	}

}
