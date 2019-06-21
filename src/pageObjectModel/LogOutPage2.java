package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage2 {
	
	@FindBy(id="welcome")
	public static WebElement lnkwelcome = null;
	
	@FindBy(linkText="Logout")
	public static WebElement lnkLogOut = null;
	
	
	public static void logout() {
		
		lnkwelcome.click();
		lnkLogOut.click();
	}
	
	

}
