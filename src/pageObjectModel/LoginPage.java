package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	public static WebElement txtUsername = null;
	
	@FindBy(id="txtPassword")
	public static WebElement txtPassword = null;
	
	@FindBy(id="btnLogin")
	public static WebElement btnLogin = null;
	
	
}
