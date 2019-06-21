package keyWords;

public class SuperMethod extends BaseClass{

	public void firefox() {
		//System.out.println("ff");
		super.display();
	}
	
	public static void main(String[] args) {
		
		SuperMethod method = new SuperMethod();
		method.firefox();
	}

}
