package Com.Automation;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Main.html");
		
		TakesScreenshot tsc = (TakesScreenshot)driver;
		File src = tsc.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\Image1.PNG");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		dest = new File("D:\\Image2.PNG");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		
	
		
		Thread.sleep(3000);
		driver.close();
	}

}
