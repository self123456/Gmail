package Com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnSample1 {

	public static void main(String[] args) throws Exception {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.thepancard.com/");
	
	driver.findElement(By.linkText("Apply New PAN Card")).click();
	
	WebElement indRadiBtn = driver.findElement(By.id("rblCategory_0"));
	System.out.println(indRadiBtn.isSelected());
	indRadiBtn.click();
	Thread.sleep(4000);
	System.out.println(indRadiBtn.isDisplayed());
	System.out.println(indRadiBtn.isEnabled());
	
	WebElement armyRadiBtn = driver.findElement(By.id("rblCategory_1"));
	System.out.println(armyRadiBtn.isSelected());
	armyRadiBtn.click();
	Thread.sleep(3000);
	System.out.println(armyRadiBtn.isDisplayed());
	System.out.println(armyRadiBtn.isEnabled());
	
	WebElement navyrb = driver.findElement(By.id("rblCategory_2"));
	System.out.println(navyrb.isSelected());
	navyrb.click();
	Thread.sleep(3000);
	System.out.println(navyrb.isDisplayed());
	System.out.println(navyrb.isEnabled());
	
	WebElement afRB = driver.findElement(By.id("rblCategory_3"));
	System.out.println(afRB.isSelected());
	afRB.click();
	Thread.sleep(5000);
	afRB.getText();
	System.out.println(afRB.isDisplayed());
	System.out.println(afRB.isEnabled());
	
	WebElement txtDOB = driver.findElement(By.id("txtDOB"));
	System.out.println(txtDOB.getAttribute("placeholder"));
	System.out.println(txtDOB.getAttribute("maxlength"));
	txtDOB.getText();
	driver.close();
		
		
	}

}
