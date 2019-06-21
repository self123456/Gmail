package UserDefinedMethods;

public class CreateEmployee {

	public void CreateEmp() {
		FrameWork baseClass = new FrameWork();
		baseClass.openBrowser();
		baseClass.logIn();
		System.out.println("Create Employee");
		baseClass.logOut();
		baseClass.closeTheBrowser();
		
	}
	
	public static void main(String[] args) {
	
		CreateEmployee cEmp = new CreateEmployee();
		cEmp.CreateEmp();
		
	}

}
