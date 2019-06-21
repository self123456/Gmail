package keyWords;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class DriverHelper {

	WebDriver driver = null;
	
	public DriverHelper(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public void getScreenShot() throws Exception {
		
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\"+System.currentTimeMillis()+".PNG");
		
		FileHandler.copy(src, dest);
		
		
	}
	
	public static void main(String[] args) {
		
		
		

	}

}
