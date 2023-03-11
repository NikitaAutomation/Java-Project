package test;

public class ForLoopExample {

	public static void main(String[] args) {

		for(int num=1;num<11;num++)
		{
			System.out.println(num);
		}
		
		System.out.println("End of the loop");
		
		
		
		for(int num1=10;num1>=0;num1--)
		{
			System.out.println(num1);
		}
		
		System.out.println("End of the loop");
		
		for(int num2=10;num2>=0;num2-=2)
		{
			System.out.println(num2);
		}
		
		System.out.println("End of the loop");
		
		
		//Print 2 table
		int table=2;
		for (int i=1;i<=10;i++)
		{
			System.out.println(table*i);
			
		}
		
		
		int[] array= {2,4,6,8,10,12};
		for(int i=0;i<array.length;i++)
			System.out.println("Element value is"+array[i]);
		
		//for each loop
		
		for(int val:array) {
			System.out.println("Value is"+val);
		}
		
		String str1="John";
		for(int i=0;i<str1.length();i++)
		{
			System.out.println("Char value is "+ str1.charAt(i));
		}
	
		
		
		
	}

}
