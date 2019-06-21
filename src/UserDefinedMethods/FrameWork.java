package UserDefinedMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork {

	WebDriver driver = new ChromeDriver();
	
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}
	
	public void logIn() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void logOut() {
		
		driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	
	
	public void closeTheBrowser() {
		
		driver.close();
	}
	
	public static void main(String[] args) {
		
		FrameWork baseClass = new FrameWork();
		
		baseClass.openBrowser();
		baseClass.logIn();
		baseClass.logOut();
		baseClass.closeTheBrowser();


	}

}
