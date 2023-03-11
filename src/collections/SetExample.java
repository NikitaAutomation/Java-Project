package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

	HashSet<String> set1 = new HashSet<String>();
	
	set1.add("Jake");
	set1.add("lily");
	set1.add("Annie");
	set1.add("Naina");
	set1.add("Naina");
	set1.add(null);
	
	System.out.println("The set is"+ set1);
	
	TreeSet<String> set2 = new TreeSet<String>();
	
	set2.add("Hunny");
	set2.add("Heenu");
	set2.add("Ajay");
	set2.add("Naira");
	set2.add("Ajay");
	
	System.out.println(set2);
	
	//convert set to list
	
	
	ArrayList<String> list2 = new ArrayList<String>(set1);
	System.out.println(list2);
	
		
		
	}

}
