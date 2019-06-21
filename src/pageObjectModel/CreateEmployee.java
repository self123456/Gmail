package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmployee {
	
	@FindBy(id="menu_pim_viewPimModule")
	public static WebElement lnkPIM = null;
	
	@FindBy(id="menu_pim_addEmployee")
	public static WebElement lnkAddEmployee = null;
	
	

	@FindBy(id="firstName")
	public static WebElement txtfirstName = null;
	

	@FindBy(id="lastName")
	public static WebElement txtlastName = null;
	
	@FindBy(id="btnSave")
	public static WebElement btnSave = null;
	
	

}
