package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KB_BackSpace {

	public static void main(String[] args) throws Exception {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String  fName = "Lakshmi";
		
		
		Actions actions = new Actions(driver);
		actions.sendKeys(fName).perform();
		Thread.sleep(5000);
		for( int index = 1;index<=fName.length(); index++) {
			actions.sendKeys(Keys.BACK_SPACE).perform();
		}
		
		WebElement firstName = driver.findElement(By.id("u_0_j"));
		actions.sendKeys(firstName, "Lakshmi").perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
