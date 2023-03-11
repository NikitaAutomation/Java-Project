package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// While using loop
		int num=1;
		
		while(num<11)
		{
			System.out.println(num);
		num= num+1;
		
		}
		System.out.println("End of while loop");
		
int num1=10;
		
		while(num1>0)
		{
			System.out.println(num1);
		num1= num1-1;
		
		}
		
		
		int num2=10;
		while(num2>0)
		{
		if(num2==5)
		{
			System.out.println("skip");
			num2--;
			continue;
		}
			System.out.println(num2);
			num2--;
			
			
		}
		
		
		
		int num3=10;
		while(num3>0)
		{
		if(num3==5)
		{
			System.out.println("stop");
			num3--;
			break;
		}
			System.out.println(num3);
			num3--;
			
			
		}
		
		
	}
}
