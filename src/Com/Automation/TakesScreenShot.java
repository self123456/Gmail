package Com.Automation;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakesScreenShot {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void beforetest() {
		
	
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

	}
	
	
@Test	
public void mainmethod() throws IOException {
	
	driver.get("https://www.facebook.com/");
	
	TakesScreenshot tsc = (TakesScreenshot)driver;
	
	//File source = tsc.getScreenshotAs(OutputType.FILE);
	
	File source = tsc.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("D:\\image.PNG");
	
	FileHandler.copy(source, dest);
	
	dest = new File("D:\\image3.PNG");
	FileHandler.copy(source, dest);
	
	
	
}	

}
