package alertDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		Thread.sleep(3000);
		alert.sendKeys("Lakshmi Chinthalpudi");
		Thread.sleep(5000);
		
		//alert.accept();
		
		alert.dismiss();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
