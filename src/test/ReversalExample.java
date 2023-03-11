package test;

public class ReversalExample {

public static void main(String[] args) {
		
		String str="Shanik";
		String result="";
		for(int i=str.length()-1;i>=0;i--)
		{
			result= result+str.charAt(i);
		}
		
		System.out.println("Reverse String"+" "+result);
		
		if(str.equalsIgnoreCase(result)) 
		{
			System.out.println("The given String is palindrom");
		}
		
		else
		{
			System.out.println("The given string is not a palindrom");
		}
		
		//
	//////////////////////////////////////////////////////
		
		String str2="Hello Good Morning";
		String array[]=str2.split(" ");
		
		//System.out.println(array[2]);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
				 
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
			
		String result1="";
		for(int i=array.length-1;i>=0;i--)
		{
			result1=result1+array[i]+" ";
		}
		
		System.out.println(result1);
		
		
		
	}
}
