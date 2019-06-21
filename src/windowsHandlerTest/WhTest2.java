package windowsHandlerTest;




import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhTest2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://www.hondacarindia.com/");
		driver.findElement(By.xpath("//i[@class='menuIcon serviceIcon']")).click();
		
		Set<String> set  = driver.getWindowHandles();	
		List<String> list = new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.xpath("//span[text()='BOOK A SERVICE']")).click();
		
		WebElement txtname = driver.findElement(By.id("txt_Name"));
		txtname.sendKeys("Lakshmi");
		Thread.sleep(4000);
		driver.close();
		
	}

}
