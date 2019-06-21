package Com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldTest {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/");

		WebElement txtFirstName = driver.findElement(By.id("reg-firstname"));
		WebElement txtLastName = driver.findElement(By.id("reg-lastname"));
		WebElement txtEmail = driver.findElement(By.id("reg-email"));
		Thread.sleep(3000);
		
		
		txtFirstName.sendKeys("Lakshmi");
		txtLastName.sendKeys("Chinthalpudi");
		txtEmail.sendKeys("chlucky@gmail.com");
		Thread.sleep(3000);
		
		txtFirstName.clear();
		txtLastName.clear();
		txtEmail.clear();
		Thread.sleep(3000);
		
		txtFirstName.sendKeys("Lakshmi");
		txtLastName.sendKeys("Chinthalpudi");
		txtEmail.sendKeys("chlucky@gmail.com");
		Thread.sleep(3000);
		
		System.out.println(txtFirstName.isDisplayed());
		System.out.println(txtFirstName.isEnabled());
		
		System.out.println(txtLastName.isDisplayed());
		System.out.println(txtLastName.isEnabled());
		
		System.out.println(txtFirstName.getAttribute("Value"));
		driver.close();
		
	}

}
