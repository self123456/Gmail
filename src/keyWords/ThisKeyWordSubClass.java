package keyWords;

public class ThisKeyWordSubClass {

	String browser = "chrome";
	
	public ThisKeyWordSubClass() {
		//this("","");
		System.out.println("this class arg - 0");
	}
	
	public ThisKeyWordSubClass(String username, String password) {
		//this("");
		System.out.println("this class args - 2");
	}
	
	public ThisKeyWordSubClass(String browser) {
		
		this("","");
		System.out.println("this class arg - 1"+this.browser);
	}
	
	public void display(String username, String password) {
		this.display();
		System.out.println("display - 2args");
	}
	

	public void display() {
		
		System.out.println("display - 0");
	}
	
	public static void main(String[] args) {
	
		ThisKeyWordSubClass thiskw = new ThisKeyWordSubClass();
		ThisKeyWordSubClass thiskw2 = new ThisKeyWordSubClass("");
		ThisKeyWordSubClass thiskw3 = new ThisKeyWordSubClass("","");
		thiskw.display();
		//thiskw.display("lakshmi", "chinthalpudi");
		
		
	}

}
