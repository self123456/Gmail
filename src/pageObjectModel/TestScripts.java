package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestScripts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		PageFactory.initElements(driver, CreateEmployee.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, LogOutPage.class);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		LoginPage.txtUsername.sendKeys("Admin");
		LoginPage.txtPassword.sendKeys("admin123");
		LoginPage.btnLogin.click();
		
		
		CreateEmployee.lnkPIM.click();
		CreateEmployee.lnkAddEmployee.click();
		CreateEmployee.txtfirstName.sendKeys("Laxmi");
		CreateEmployee.txtlastName.sendKeys("Chin");
		CreateEmployee.btnSave.click();
		
		
		LogOutPage.lnkwelcome.click();
		LogOutPage.lnkLogOut.click();
		
		driver.close();

	}

}
