package ConditionalStatements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ForEach {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement carsList = driver.findElement(By.name("cars"));
		
		Select select = new Select(carsList);
		select.selectByIndex(0);
		System.out.println(select.isMultiple());
		select.selectByVisibleText("Opel");
		List<WebElement> list = select.getOptions();

	
		
		/*
		 * System.out.println("for"); for(int index = 0;index<=list.size();index++) {
		 * System.out.println(list.get(index).getText()); } System.out.println("While");
		 * 
		 * int index = 0;
		 * 
		 * while(index<=list.size()) {
		 * 
		 * System.out.println(list.get(index).getText()); index++;
		 * 
		 * }
		 */
	System.out.println("forEach");
	for (WebElement webelement:list) {
		System.out.println(webelement.getText());
		
	}
	
	
	}

}
