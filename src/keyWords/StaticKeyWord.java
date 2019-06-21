package keyWords;

public class StaticKeyWord {
	
	//Run once with static key word and once without static keyword 
	// You get different o/p by using static key word
	//When ever you make an instance it creates a new copy and initializes 1 to it so you always get 1 o/p

	
	//Static always has only 1 copy irrespective of how many objects/instances you create. 
	//It always increments by 1 with every new instance you create.

	//int counter;
	static int counter;
	
	public void increment(){
		counter++;
		
	}
	
	public void display() {
		System.out.println(counter);
	}
public static void main(String[] args) {
	
	StaticKeyWord s1 = new StaticKeyWord();
	s1.increment();
	s1.display();
	StaticKeyWord s2 = new StaticKeyWord();
	s2.increment();
	s2.display();
	StaticKeyWord s3 = new StaticKeyWord();
	s3.increment();
	s3.display();
	StaticKeyWord s4 = new StaticKeyWord();
	s4.increment();
	s4.display();
}


}
