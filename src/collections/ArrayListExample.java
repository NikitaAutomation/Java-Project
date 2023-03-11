package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main (String[]args)
	{
		
	ArrayList<String> list1 = new ArrayList<String>();
	
	list1.add("Moneisha");
	list1.add("Reema");
	list1.add("Nikita");
	list1.add("Shravani");
	
	System.out.println("The list is"+ list1);
	System.out.println("Size of the list"+ list1.size());
	System.out.println("Element from the list"+ list1.get(2));
	System.out.println("Last Element"+ list1.get(list1.size()-1));
	
	list1.add(2, "Lakshay");
	System.out.println("Updated list with Name"+ list1.get(2));
	
	list1.set(0, "Mike");
	System.out.println("Update the element"+ list1.get(0));
	
	System.out.println(list1);
	
	list1.remove(2);
     System.out.println("After removal"+list1);
		
	for(int i=0;i<list1.size(); i++)
	{
	System.out.println("Element Name"+ list1.get(i));	
	}
	
	for(String value:list1)
	{
		System.out.println("Elemen value"+value);
	}
		
	Iterator<String> itr = list1.iterator();
	while(itr.hasNext())
			{
		System.out.println(itr.next());
			}
	
	Collections.sort(list1);
	System.out.println("After sorting the list"+list1);
	
	Collections.sort(list1, Collections.reverseOrder());
	System.out.println("After sorting in descending"+ list1);
	
	}
	
	
	
	
	
	
}
