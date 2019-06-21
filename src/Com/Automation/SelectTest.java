package Com.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	public static void main(String[] args) throws Exception {
		
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://electoralsearch.in/");
		  
		  WebElement btnContinue = driver.findElement(By.id("continue"));
		  btnContinue.click();
		  
		  WebElement lstState = driver.findElement(By.id("nameStateList"));
		  
		  Select select = new Select(lstState);
		  
		  System.out.println(select.isMultiple()); Thread.sleep(5000);
		  
		  select.selectByIndex(2); Thread.sleep(5000);
		  
		  select.selectByVisibleText("Goa"); Thread.sleep(5000);
		  
		  select.selectByValue("S03"); Thread.sleep(5000);
		  
		  //System.out.println(select.getAllSelectedOptions());
		  
		  List<WebElement> list = select.getAllSelectedOptions();
		  
		  for(int index=0; index<list.size(); index++) {
		  System.out.println(list.get(index).getText());
		 }
		  
		 
		  
		  driver.close();
	}

}
