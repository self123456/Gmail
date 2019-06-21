package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HRMS extends RootScript2 {
	
	
	@Test
	public void createEmployee() throws Exception {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Lakshmi");
		driver.findElement(By.id("lastName")).sendKeys("Chinthalpudi");
		Thread.sleep(5000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
	}
	@Test
	public void searchEmployee() throws Exception {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Anusha Shetty");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
		
	}
	@Test
	public void deleteEmployee() throws Exception {
		Thread.sleep(5000);
		//driver.findElement(By.id("menu_pim_viewPimModule")).click();
		//driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		//driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Serious Sam");
		//driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("ohrmList_chkSelectRecord_10")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("btnDelete")).click();
		Thread.sleep(5000);
		
	}
		
}
