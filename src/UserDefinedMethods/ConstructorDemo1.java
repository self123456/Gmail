package UserDefinedMethods;

public class ConstructorDemo1 {

	public int id;
	public String firstName;
	public String lastName;
	public double salary;
	
	public void createempData(int empid, String empfirstName, String empLastName, double empsalary) {
		
		id 			= empid;
		firstName 	= empfirstName;
		lastName 	= empLastName;
		salary 		= empsalary;
				
	}
	
	public void getEmpData() {
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(salary);
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
