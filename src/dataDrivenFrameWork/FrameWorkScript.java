package dataDrivenFrameWork;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


// OPEN BROWSER //CLOSE BROWSER

public class FrameWorkScript {
	
	protected WebDriver driver = null;
	Logger logger = Logger.getLogger(FrameWorkScript.class);
	
	
	@BeforeMethod
	public void openBrowser() throws IOException, Exception {
		
	BasicConfigurator.configure(new FileAppender(new SimpleLayout(), "Execution.log"));
	
	Properties properties = new Properties();
	
	properties.load(new FileInputStream(new File("D:\\MQWorkSpace\\Gmail\\src\\dataDrivenFrameWork\\Environment.properties")));
	
	driver = new ChromeDriver();
	logger.info("Create Driver Object");
	
	driver.manage().window().maximize();
	logger.info("Maximize");
	
	Thread.sleep(3000);
	
	//driver.manage().timeouts().implicitlyWait(long.parselong(properties.getProperty("wait")), TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
		logger.info("Browser Closed");
		
	}
	

}
