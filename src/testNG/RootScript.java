package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//ROOTSCRIPT IS FOR CREATE SEARCH AND DELETE EMPLOYEE CLASSES ONLY

public class RootScript {

	WebDriver driver = null;
		
		@BeforeTest
		public void OpenBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		
		@Test(priority=1)
		public void logIn() {
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			}
		
		@Test(priority=3)
		public void logOut() throws Exception {
			Thread.sleep(5000);
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			}
		@AfterTest
		public void closeTheBrowser() throws Exception {
			Thread.sleep(5000);
			driver.close();
	}

}
