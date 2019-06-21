package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
	

		//TreeSet<String> list = new TreeSet<String>();
		
		HashSet<String> list = new HashSet<String>();		
		System.out.println(list.size());
		
		list.add("xyz");
		list.add("userName");
		list.add("userName");
		list.add("Password");
		list.add("Password");
		list.add("Password");
		
		System.out.println(list);
		
		for(String str:list) {
			System.out.println(str);
		}
		
		
		
	}

}
