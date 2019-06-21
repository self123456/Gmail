package ConditionalStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifElse {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement userName = driver.findElement(By.name("txtUsername"));
		userName.sendKeys("Admin");
		//boolean status = userName.isDisplayed();
		boolean txtbox = userName.isEnabled();

		if(txtbox) {
			System.out.println("User name is displayed");
			
		}else if(txtbox) {
			System.out.println("Username is Enabled");
		}
		
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
