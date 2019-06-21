package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://api.jquery.com/click/");
	
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement object1 = driver.findElement(By.xpath("//p[text()='First Paragraph']"));
	object1.click();
		Thread.sleep(5000);
	
		WebElement object2 = driver.findElement(By.xpath("//p[text()='Second Paragraph']"));
	Actions	actions = new Actions(driver);
	actions.moveToElement(object2);
	actions.click().perform();
	Thread.sleep(5000);
	
		WebElement thirdPara = driver.findElement(By.xpath("//p[text()='Yet one more Paragraph']"));
	actions.click(thirdPara).perform();
	Thread.sleep(4000);
	driver.close();
	}

}
