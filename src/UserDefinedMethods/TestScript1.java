package UserDefinedMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
	
	static WebDriver driver = null;
	
	public void createEmployee() {
		
			// open browser 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.get("https://opensource-demo.orangehrmlive.com/");
			
	}
		//close browser
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void main(String[] args) {
	
			// calling instance method
		TestScript1 createEmp = new TestScript1();
		createEmp.createEmployee();
		
			// calling static method
		TestScript1.closeBrowser();
		

	}

}
