package test;

public class ArraysExample {

	public static void main(String[] args) {
	
		int array1[]= {10,20,30,40,50};
		
		System.out.println("Length of the array is"+" "+ array1.length);
		System.out.println("First value inside the array"+" "+ array1[0]);
		System.out.println("Last element inside the array"+" "+ array1[array1.length-1]);
		
		
		String array[]= {"Happy", "Birthday"};
		
		System.out.println("First word inside an array"+" "+array[0]);
		System.out.println("Length of the string array"+" "+array.length);
		System.out.println("Last Element inside the array"+" "+array[array.length-1]);

		String str="Green World Clean World Happy World";
		String[]array3=str.split(" ");
		System.out.println("Total number of words inside the string is"+" "+array3.length);
	}

}
