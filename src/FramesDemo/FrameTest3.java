package FramesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest3 {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Main.html");
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.name("FirstName")).sendKeys("Lakshmi");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		driver.findElement(By.name("LastName")).sendKeys("Chinthalpudi");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame3");
		driver.findElement(By.name("Email")).sendKeys("chlucky@gmail.com");
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
