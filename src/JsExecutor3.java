import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor3 {

	public static void main(String[] args) throws Exception {
		
		//findElementById   using getElemenById   Method
		//findElementByName using getElemenByName Method
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		String url = "window.location='https://www.linkedin.com/'";
		executor.executeScript(url);
		
		String script = "document.getElementById('reg-firstname').value='Lakshmi'";
		executor.executeScript(script);
		
		String lname = "document.getElementById('reg-lastname').value='Chinthalpudi'";
		executor.executeScript(lname);
		
		String email = "document.getElementsByName('session_key')[0].value='chlucky@gmail.com'";
		executor.executeScript(email);
		
		Thread.sleep(3000);
		driver.close();

	}

}
