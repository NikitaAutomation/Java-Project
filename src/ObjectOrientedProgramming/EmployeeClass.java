package ObjectOrientedProgramming;

public class EmployeeClass {
	
	public String Name;
	public int Emp_id;
	private static int Salary;
	
	public EmployeeClass()
	{
		System.out.println("Default constructor");
	}
	
	public EmployeeClass(String var1, int var2)
	{
		System.out.println("Inside parametrized constructor");
		Name=var1;
		Emp_id=var2;
	}
	
	
	
	
	public void DisplayName()
	{
		System.out.println("Name of the Employee"+ Name);
	}

}
