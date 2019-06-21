package keyWords;

public class SubClassConstructor extends BaseClass {
	
	public SubClassConstructor() {
		super();
		System.out.println("Subclass constructor 0");
	}
	
	public SubClassConstructor(String faceboook) {
		super("");
		System.out.println("Subclass constructor 1");
	}

	public SubClassConstructor(String username, String password) {
		super("","");
		
		System.out.println("Subclass constructor 2");
}

	public static void main(String[] args) {
		SubClassConstructor constructor = new SubClassConstructor();
		SubClassConstructor constructor2 = new SubClassConstructor("");
		SubClassConstructor constructor3 = new SubClassConstructor("","");
		
	}

}
