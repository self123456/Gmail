package autiIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cancelbtn {

	public static void main(String[] args) throws Exception {
		
		// Click on the CANCEL button on the opened windows page using AutoIT
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in/");
		
		driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\AutomationSoftware\\resources\\btnClose.exe");
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
