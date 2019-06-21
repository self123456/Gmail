package keyWords;

//Parent class for variable method and constructors

public class BaseClass {

	String browser = "chrome";
	
	public void display() {
		System.out.println("chrome");
	}

	
	public BaseClass() {
		
		System.out.println( "SuperClass Constructor 0");
	}
	
public BaseClass(String browsername) {
		
		System.out.println( "SuperClass Constructor 1");
	}
	
public BaseClass(String username, String password) {
	
	System.out.println( "SuperClass Constructor 2");
}
	
	public static void main(String[] args) {
	
		
		BaseClass test1 = new BaseClass();
		BaseClass test2 = new BaseClass("","");
		BaseClass test3 = new BaseClass("");
	}

}
