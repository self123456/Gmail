package RobotClass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {

	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.indeed.co.in/");
		
	driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Thread.sleep(2000);
	
	Robot robot = new Robot();


	StringSelection selectContent = new StringSelection("D:\\Resume.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectContent, null);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);	
	Thread.sleep(2000);
		
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(5000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	driver.quit();
	
	
	}

}

