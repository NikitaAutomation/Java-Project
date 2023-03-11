package ObjectOrientedProgramming;

public class Insurance extends Citizen {

	public int InsuranceId;
	
	public Insurance()
	{
		System.out.println("Inside defailt constructor of Insurance");
	}
	
	public void Print()
	{
		super.Print();
		System.out.println("Insurance id is "+ InsuranceId);
	}
	
	public void Print(String message) {
		System.out.println("Typing some message"+message);
	}
	
	
	
}
