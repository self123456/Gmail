package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Super class for HRMS
public class RootScript2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void OpenBrowser() throws InterruptedException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	}
	
	@BeforeMethod
	public void logIn() throws Exception {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		}
	
	@AfterMethod
	public void logOut() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(5000);
		}
	@AfterTest
	public void closeTheBrowser() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}

}
