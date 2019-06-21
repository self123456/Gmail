import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XandYaxis {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		String url = "window.location = 'https://www.facebook.com/'";
		executor.executeScript(url);
		
		String height = "window.scrollTo(0, document.body.scrollHeight)";
		executor.executeScript(height);
		Thread.sleep(5000);
		
		String height2 = "window.scrollTo(0, 0)";
		executor.executeScript(height2);
		Thread.sleep(5000);
		
		String width = "window.scrollTo(document.body.scrollWidth, 0)";
		executor.executeScript(width);
		Thread.sleep(5000);
		
		String width2 = "window.scrollTo(0, 0)";
		executor.executeScript(width2);
		Thread.sleep(5000);
		
		driver.close();
	}

}
