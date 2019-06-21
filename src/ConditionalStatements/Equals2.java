package ConditionalStatements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Equals2 {

	public static void main(String[] args) {
		String browser = "ie";
		WebDriver driver = null;
		
		if (browser.equals("chrome")) {
		driver = new ChromeDriver();
		
		}else if (browser.equals("ff")){
			driver = new FirefoxDriver();
			
		}else if (browser.equals("internet explorer")) {
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("none of the browsers work");
		}
	}
	
}
