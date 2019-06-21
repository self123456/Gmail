package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	

@org.testng.annotations.DataProvider(name="getTestData")
public String [] [] getTestData(){
	
	
	String[] [] data = new String[4] [2];
	data [0] [0] = "Admin";
	data [0] [1] = "admin123";
	
	data [1] [0] = "userName";
	data [1] [1] = "password";
	
	data [2] [0] = "userName";
	data [2] [1] = "password";
	
	data [3] [0] = "userName";
	data [3] [1] = "password";
	
	return data;

}
	

@Test(dataProvider="getTestData")
public void login(String userName, String password) {
	driver.findElement(By.name("txtUsername")).sendKeys(userName);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	
}
@AfterMethod
public void closeBrowser() {
	driver.close();
}

}




