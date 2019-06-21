package Com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldTest2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
	
		
	//field 1
	WebElement txtbox = driver.findElement(By.name("firstName"));
	
	txtbox.sendKeys("Lakshmi");
	Thread.sleep(3000);
	txtbox.sendKeys("  Bai");
	Thread.sleep(3000);
	System.out.println(txtbox.getAttribute("Value"));
	//txtbox.clear();
	//Thread.sleep(3000);
	
	
	
	driver.close();
		
	}

}
