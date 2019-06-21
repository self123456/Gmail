package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchEmployee extends RootScript{
	//WebDriver driver = null;
	
	@Test(priority=2)
	public void SearchForTheEmployee() throws Exception{
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Serious Sam");
		Thread.sleep(5000);
		driver.findElement(By.id("searchBtn")).click();
		
	}

}
