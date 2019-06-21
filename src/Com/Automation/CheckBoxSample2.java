package Com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSample2 {

	public static void main(String[] args) throws Exception {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/");
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		Thread.sleep(3000);
		
		
		
	WebElement checkbox = driver.findElement(By.id("agree_check"));
	
	System.out.println(checkbox.isSelected());
	
	checkbox.click();
	Thread.sleep(3000);
	System.out.println(checkbox.isSelected());

	checkbox.click();
	Thread.sleep(4000);
	System.out.println(checkbox.isSelected());
	
	Thread.sleep(3000);	
		
	System.out.println(checkbox.isDisplayed());
	
	System.out.println(checkbox.isEnabled());
		
		
		driver.close();
		
		
	}

}
