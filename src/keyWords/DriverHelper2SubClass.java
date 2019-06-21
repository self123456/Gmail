package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHelper2SubClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		DriverHelper2 helper2 = new DriverHelper2();
		helper2.getScreenShot2(driver);
		driver.close();
	}

}
