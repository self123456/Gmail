package ConditionalStatements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm?cat=G");
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='topGainers']//tr//td"));
		
		for(WebElement webelement : list) {
			
			System.out.println(webelement.getText());
		}
		/*
		 * List<WebElement> list =
		 * driver.findElements(By.xpath("//table[@id='topGainers']//tr//td"));
		 * 
		 * 
		 * for(WebElement webelement : list) { System.out.println(webelement.getText());
		 * }
		 */
	}

}
