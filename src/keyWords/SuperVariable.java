package keyWords;

//Super KeyWord
//To invoke the instance variable of the parent/superclass into the child/sub class
// Super class is BaseClass
public class SuperVariable extends BaseClass {

	String browser = "ff";
	public void display() {
		
		System.out.println(browser);
		System.out.println(super.browser);
	}
	
	public static void main(String[] args) {
		
		SuperVariable keyword = new SuperVariable();
		keyword.display();
		
	}

}
