package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		
		int prime=44;
		
		boolean flag=true;
		
		for(int i=2; i<=prime-1;i++)
		{
			if(prime%i==0)
			{
				flag=false;
				System.out.println("Not a prime number");
			break;
			}
		
		
	
	}
	if(flag==true)
		{
			System.out.println("Prime Number");
		}
		
	}
}


