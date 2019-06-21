package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage {
	
	
	@FindBy(id="welcome")
	public static WebElement lnkwelcome = null;
	
	@FindBy(linkText="Logout")
	public static WebElement lnkLogOut = null;
	
	
}
