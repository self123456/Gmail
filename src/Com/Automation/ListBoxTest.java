package Com.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxTest {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.in/");
		
		
		//driver.findElement(By.id("continue")).click();
		
		//driver.switchTo().frame("iframeResult");
		
		WebElement LbState = driver.findElement(By.id("nameStateList"));
		Select select = new Select(LbState);
		List<WebElement> list = select.getOptions();
		for( int index = 0;index<list.size();index++) {
			
			System.out.println(list.get(index).getText());
			
		}
			
		driver.close();

	}

}
