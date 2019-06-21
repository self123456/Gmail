package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestScripts2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		PageFactory.initElements(driver, LoginPage2.class);
		PageFactory.initElements(driver, CreateEmployee2.class);
		PageFactory.initElements(driver, LogOutPage2.class);
		
		LoginPage2.Login2("Admin", "admin123");
		CreateEmployee2.CreateEmp("Android", "IOS");
		LogOutPage2.logout();
		
		driver.close();
		
	}

}
