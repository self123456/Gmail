package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_CreateEmployee {
	
	
	@Test
	public void createEmployee(String userName, String password, String firstName, String Lastname) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		  driver.findElement(By.id("txtUsername")).sendKeys(userName);
		  driver.findElement(By.id("txtPassword")).sendKeys(password);
		  driver.findElement(By.id("btnLogin")).click();
		  
		  	driver.findElement(By.id("menu_pim_viewPimModule")).click();
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			driver.findElement(By.id("firstName")).sendKeys(firstName);
			driver.findElement(By.id("lastName")).sendKeys(Lastname);
			driver.findElement(By.id("btnSave")).click();
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}

	
	
}
