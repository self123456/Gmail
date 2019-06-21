package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///D:/MQWorkSpace/Gmail/sync/sync/WaitUntilPageRedirect.html");
	
		
		driver.findElement(By.id("email")).sendKeys("chlucky@gmail.com");
		driver.close();

	}

}
