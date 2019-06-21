package Com.Automation;

public class Array2D {

	public void data() {
		
	String [] [] testdata = new String [2] [4];
		
		testdata [0][0] = "User Name";
		testdata [0][1] = "Password";
		testdata [0][2] = "Moile";
		testdata [0][3] = "Email";
		
		testdata [1][0] = "Admin";
		testdata [1][1] = "admin123";
		testdata [1][2] = "7995248521";
		testdata [1][3] = "chlucky@gmail.com";
		
		System.out.println(testdata [0][0]);
		System.out.println(testdata [0][1]);
		System.out.println(testdata [0][2]);
		System.out.println(testdata [0][3]);
		
		
		System.out.println(testdata.length);
		System.out.println(testdata[0].length);
		System.out.println(testdata[1].length);

	}
	
	public static void main(String[] args) {

		Array2D ard = new Array2D();
		ard.data();
	}
}
