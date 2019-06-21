package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsList {

	public static void main(String[] args) {
		List<String>  list = new    ArrayList<String>();
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add("QFT");
		list.add("RFT");
		list.add("UFT");
		list.add("UFT");
		list.add("UFT");
	
		System.out.println(list.size());
		System.out.println(list);
	
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		System.out.println(list.remove(4));
		list.remove(1);
		System.out.println(list);
		
		  for(String lst:list) { System.out.println(lst); }
		  
		  for(int index=0; index<list.size();index++) {
		  System.out.println(list.get(index)); }
		  
		 	}

}
