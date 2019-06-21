package testNG;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Script1 {

	
	@Test
	public void method() throws Exception {
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setPlatform(Platform.WINDOWS);
		URL RemoteAddress = new URL("http://192.168.56.1:4444/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(RemoteAddress, capabilities);
		
		Thread.sleep(5000);
	driver.close();
	
	}
	
}

