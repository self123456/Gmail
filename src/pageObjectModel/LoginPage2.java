package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage2 {
	
	@FindBy(id="txtUsername")
	public static WebElement txtUname = null;

	@FindBy(id="txtPassword")
	public static WebElement txtPwd = null;
	
	@FindBy(id="btnLogin")
	public static WebElement btnLogin = null;
	
	public static void Login2(String uName, String pwd) {
		
		txtUname.sendKeys(uName);
		txtPwd.sendKeys(pwd);
		btnLogin.click();
		
	}
	
}
