package Com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSample1 {

	public static void main(String[] args) throws Exception {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.thepancard.com/");
	driver.findElement(By.xpath("//*[@class='apply-button s-col']")).click();
	
	//driver.findElement(By.xpath("//*[@class='apply-button b-col']")).click();

	  driver.findElement(By.xpath("//*[@title='Apply new pan card']")).click();
	Thread.sleep(5000);
		
	driver.close();	
	
	}

}
