package ObjectOrientedProgramming;

public class Citizen extends Person {

	public int SSN;
	
	public Citizen()
	{
		System.out.println("Inside default constructor");
		
	}
	
	public Citizen(String Name, String CountryName, int age, int SSN)
	{
		super();
		System.out.println("Inside param constructor");
		
		
		
		this.Name=Name;
		this.CountryName=CountryName;
		this.age=age;
		this.SSN=SSN;
		
	}
	
	public void Print()
	{
		System.out.println("SSN is "+ SSN);
	}
	
	
}
