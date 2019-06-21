package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

// Title Validation , verify weather the actual and expected title matches or not

public class AsertEquals {

	@Test
	public void verifyTitle() throws Exception {
		Reporter.log("Page Launch");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle   = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Page Closed");
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
