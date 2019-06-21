package Com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest2 {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	
	driver.switchTo().frame("iframeResult");
	
	WebElement lstCars = driver.findElement(By.name("cars"));
	Select select = new Select(lstCars);
	
	System.out.println(select.isMultiple());
	
	select.selectByIndex(0);
	Thread.sleep(5000);
	
	select.selectByVisibleText("Audi");
	Thread.sleep(5000);
	
	select.selectByValue("opel");
	Thread.sleep(5000);
		
	select.deselectByIndex(3);
	Thread.sleep(5000);
	
	select.deselectByVisibleText("Volvo");
	Thread.sleep(5000);
	
	select.deselectByValue("opel");
	Thread.sleep(5000);
	
	driver.close();
	}

}
