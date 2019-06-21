package autiIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timesjobs.com/");
		
		driver.findElement(By.id("resumeFile_basic")).click();
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("D:\\AutomationSoftware\\resources\\resume\\FileUpload.exe");
		
		Thread.sleep(5000);
	}

}
