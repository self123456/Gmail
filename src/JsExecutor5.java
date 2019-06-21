import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		String url = "window.location='https://www.way2sms.com/'";
		jsExecutor.executeScript(url);
		String mobnum = "document.getElementById('mobileNo').value='123456789'";
		jsExecutor.executeScript(mobnum);
		
		mobnum = "return document.getElementById('mobileNo').value";
		System.out.println(jsExecutor.executeScript(mobnum));
		
		String password = "document.getElementById('password').value='hjfjlfhkhliufhf'";
		jsExecutor.executeScript(password);
		
		password = "return document.getElementById('password').value";
		System.out.println(jsExecutor.executeScript(password));
		
	}

}
