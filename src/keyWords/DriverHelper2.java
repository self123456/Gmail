package keyWords;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class DriverHelper2 {

	
	public static void getScreenShot2(WebDriver driver) throws Exception {
		
		TakesScreenshot screenshot2 = (TakesScreenshot)driver;
		File src =  screenshot2.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\"+System.currentTimeMillis()+".PNG");
		FileHandler.copy(src, dest);
	}
	
	public static void main(String[] args) {
		
		

	}

}
