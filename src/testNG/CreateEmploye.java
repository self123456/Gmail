package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CreateEmploye extends RootScript {

	//WebDriver driver = null;
	
	@Test(priority=2)
	public void createEmployee() throws Exception {
		Thread.sleep(5000);
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("firstName")).sendKeys("Lakshmi");
	driver.findElement(By.id("lastName")).sendKeys("Chinthalpudi");
	Thread.sleep(5000);
	driver.findElement(By.id("btnSave")).click();
	}
	
}