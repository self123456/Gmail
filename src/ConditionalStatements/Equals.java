package ConditionalStatements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Equals {

	public static void main(String[] args) {
		String browser = "chrome";
		if(browser.equals(browser)) {
			WebDriver driver = new ChromeDriver();
			
			System.out.println("Browser Launched Successfully");
		}else {
			System.out.println("Browser Launch UnSuccessful");
		}
		
		
	}

}
