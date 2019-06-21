package dataDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//MAIN CLASS WHICH IMPLEMENTS DATA DRIVEN FRAMEWORK BY INVOKING REMAINING CLASSES AND PROPERTY FILE

public class TC01_CreateEmployee extends FrameWorkScript {

	@Test(dataProvider="gettestdata")
	public void createemployee(String userName, String Password, String firstName, String lastName) throws Exception, IOException {
		
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File ("D:\\MQWorkSpace\\Gmail\\src\\dataDrivenFrameWork\\Environment.properties")));
		
		driver.get(properties.getProperty("url"));
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	WebElement txtusername = driver.findElement(By.id("txtUsername"));
				txtusername.sendKeys(userName);
				
	WebElement txtpassword = driver.findElement(By.id("txtPassword"));		
				txtpassword.sendKeys(Password);
		
				
	WebElement btnlogin = driver.findElement(By.id("btnLogin"));
				btnlogin.click();
				
	WebElement linkPIM = driver.findElement(By.id("menu_pim_viewPimModule"));
				linkPIM.click();
				
	WebElement linkAddEmp = driver.findElement(By.id("menu_pim_addEmployee"));
				linkAddEmp.click();			
				
	WebElement firstname = driver.findElement(By.id("firstName"));
				firstname.sendKeys(firstName);		
								
	WebElement lastname = driver.findElement(By.id("lastName"));
				lastname.sendKeys(lastName);		
				
	driver.findElement(By.id("btnSave")).click();
	
	driver.findElement(By.id("welcome")).click();
	
	//driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	//driver.close();
	}

	@DataProvider(name="gettestdata")
 public Object[][] gettestdata() throws Exception{
	 
	 Object[][] data = null;
	 
	 ExcelHelper helper = new ExcelHelper();
	 
	 try {
		 data =  helper.getTestData("D:\\MQWorkSpace\\Gmail\\src\\dataDrivenFrameWork\\HRM.xlsx", "Sheet1");
		 
	} catch (Exception e) {
		
	} 
	 return data;
	 
	}
	 
	 								
	
 }
	