package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//DriverHelper

public class DriverHelperSubClass {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		DriverHelper helper = new DriverHelper(driver);
		helper.getScreenShot();
		driver.close();
	}

}
