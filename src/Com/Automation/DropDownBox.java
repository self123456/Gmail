package Com.Automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.in/");
		driver.findElement(By.id("continue")).click();
		
		
		WebElement ddState = driver.findElement(By.xpath("//*[@id='nameStateList']"));
		Select select = new Select(ddState);
		System.out.println(select.isMultiple());
		
		select.selectByVisibleText("Chandigarh");
	    Thread.sleep(3000);
		
		select.selectByIndex(5);
		Thread.sleep(5000);
		
List<WebElement> list = select.getOptions();

for(int index=0;index<list.size();index++) {
	System.out.println(list.get(index).getText());
	
}
		
		
		
		//System.out.println(list.size());		
		//select.selectByValue("s03");
		//Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
