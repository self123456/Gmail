package autiIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in/");
		
		driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\AutomationSoftware\\resources\\resume\\FileUpload.exe");
				
		Thread.sleep(10000);
		
		driver.close();
		

	}

}
