import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JsExecutor4 {

	public static void main(String[] args) throws Exception {
		
		//Fill the face book form by using get element by id stategy
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.location='https://www.facebook.com/'");
		
		
		//Enter first name and return the value in the console
		String fName = "document.getElementById('u_0_j').value='Lakshmi'";
		executor.executeScript(fName);
		fName = "return document.getElementById('u_0_j').value";
		System.out.println(executor.executeScript(fName));
		Thread.sleep(2000);
		
		//Enter last name and return the value in the console
		String Lname = "document.getElementById('u_0_l').value='Chinthalpudi'";
		executor.executeScript(Lname);
		Lname = "return document.getElementById('u_0_l').value";
		System.out.println(executor.executeScript(Lname));
		Thread.sleep(2000);
		
		//ENter mobile number by id strategy
		String Mnumber = "document.getElementById('u_0_o').value='7995248521'";
		executor.executeScript(Mnumber);
		Mnumber = "return document.getElementById('u_0_o').value";
		System.out.println(executor.executeScript(Mnumber));
		Thread.sleep(2000);
		
		//Select birthdate by using id strategy
		String Bdate = "document.getElementById('day').value='19'";
		executor.executeScript(Bdate);
		Bdate = "return document.getElementById('day').value";
		System.out.println(executor.executeScript(Bdate));
		Thread.sleep(2000);
		
		//select April from the Drop Down List using select class
		WebElement Month = driver.findElement(By.id("month"));
		Select select = new Select(Month);
		System.out.println(select.isMultiple());
		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByVisibleText("May");
		Thread.sleep(2000);
		System.out.println(Month.getAttribute("Month"));
		
		WebElement Year = driver.findElement(By.id("year"));
		select = new Select(Year);
		select.selectByVisibleText("1982");
		Thread.sleep(2000);
		select.selectByVisibleText("1992");
		Thread.sleep(2000);
		
		//Select the radio button by using find element by id strategy
		WebElement RadioBtn = driver.findElement(By.xpath("//input[@name='sex']"));
		System.out.println(RadioBtn.isSelected());
		System.out.println(RadioBtn.isEnabled());
		RadioBtn.click();
		
		//Click on Signup Button using get element by id strategy
	String signUp = "document.getElementById('u_0_11').click()";
		//executor.executeScript(signUp).click();
		executor.executeScript(signUp);
		
		WebElement signUpBtn = driver.findElement(By.id("u_0_11"));
		signUpBtn.click();
		signUpBtn.isEnabled();
		signUpBtn.isDisplayed();
		System.out.println(signUpBtn.getText());
		Thread.sleep(5000);
		driver.close();
		
	
	}

}
