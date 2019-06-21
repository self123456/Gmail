import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor1 {

	public static void main(String[] args) throws Exception {
		
		//Load the URL //go back //forward // page reload
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
		jsexecutor.executeScript("window.location='https://www.facebook.com/'");
		Thread.sleep(5000);
		jsexecutor.executeScript("window.history.back()");
		Thread.sleep(5000);
		
		jsexecutor.executeScript("window.history.forward()");
		
		jsexecutor.executeScript("window.location.reload()");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
