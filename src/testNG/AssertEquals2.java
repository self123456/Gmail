package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class AssertEquals2 {

	@Test
	public void textBox() throws Exception {
		Reporter.log("Page Launch");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		
		driver.findElement(By.id("reg-firstname")).sendKeys("Lakshmi");
		Thread.sleep(10000);
		
		String expected = "Lakshmi";
		String actual   = driver.findElement(By.id("reg-firstname")).getAttribute("value");
		Assert.assertEquals(expected, actual);
		Thread.sleep(10000);
		driver.close();

	
	}
	

}