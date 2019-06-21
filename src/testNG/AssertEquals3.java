package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals3 {
	
	@Test
	public void verifyDropDown() throws InterruptedException {
		int expectedValue = 9;
		Reporter.log("Page Launch");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		
		WebElement obj1 = driver.findElement(By.id("Adults"));
		Select select = new Select(obj1);
		
		int actualValue = select.getOptions().size();
		boolean ismultiple = select.isMultiple();
		System.out.println(ismultiple);
		select.selectByVisibleText("5");
		System.out.println(actualValue);
		
		Assert.assertEquals(actualValue, expectedValue);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
