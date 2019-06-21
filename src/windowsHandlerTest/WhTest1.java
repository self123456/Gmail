package windowsHandlerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WhTest1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.location='https://www.ghmc.gov.in/'");
		
		Thread.sleep(5000);
		
		WebElement ourServices = driver.findElement(By.xpath("//a[text()='OUR SERVICES']"));
	
		Actions actions = new Actions(driver);
		actions.moveToElement(ourServices).perform();
		actions.click().perform();
		Thread.sleep(6000);
		
		WebElement propertyTax = driver.findElement(By.xpath("//a[text()='Property Tax ']"));
		actions.moveToElement(propertyTax).perform();
		actions.click().perform();
		Thread.sleep(6000);
		
		WebElement propertyTax2 = driver.findElement(By.xpath("//a[text()='Property Tax']/..//a[text()='Property Tax']"));
		actions.moveToElement(propertyTax2).perform();
		actions.click().perform();
		Thread.sleep(6000);
		driver.close();
	}

}
