package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mobiscroll.com/");

		WebElement products = driver.findElement(By.xpath("//a[starts-with(text(),'products')]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(products).perform();
		Thread.sleep(5000);
		
		WebElement fJquery = driver.findElement(By.xpath("//h2[text()='For jQuery']/..//div[text()='Learn more']"));
		actions.click(fJquery).perform();
		
		Thread.sleep(4000);
		driver.close();
	}

}
