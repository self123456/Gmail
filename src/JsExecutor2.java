
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JsExecutor2 {

	public static void main(String[] args) throws Exception {
	
	//LOAD URL USING JAVASCRIPTEXECUTOR
	//RETURN DOCUMENT TITLE
	//RETURN DOCUMENT URL
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	JavascriptExecutor jsexExecutor = (JavascriptExecutor)driver;
	
	String script = "window.location = 'https://www.facebook.com//'";
	jsexExecutor.executeScript(script);
	
	script = "return document.title";
	System.out.println(jsexExecutor.executeScript(script));
	
	script = "return document.URL";
	System.out.println(jsexExecutor.executeScript(script));
	
	
	
	Thread.sleep(4000);
	driver.close();
		
		
		
		

	}

}
