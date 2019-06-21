package FramesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ramcocements.in/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("sp_q")).sendKeys("Lakshmi");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Dealer Login")).click();
		//Thread.sleep(5000);

		driver.close();
		
	}

}
