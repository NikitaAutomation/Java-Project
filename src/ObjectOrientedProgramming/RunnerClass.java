package ObjectOrientedProgramming;

public class RunnerClass {

	public static void main(String[] args) {
		
	/*	EmployeeClass emp1= new EmployeeClass();
		
		emp1.Name="Nikita";
		emp1.Emp_id=101;
		
		emp1.DisplayName();
		
		
		EmployeeClass emp2= new EmployeeClass();
		
		emp2.Name="Mohit";
		emp2.Emp_id=102;
		
		emp2.DisplayName();
		
		
		EmployeeClass emp3= new EmployeeClass("Rahul",103);
		
		emp3.DisplayName();
		*/
		Citizen ct1=new Citizen();
		
		ct1.age=19;
		ct1.Name="Mike";
		ct1.CountryName="India";
		ct1.SSN=1235;
		
		Citizen ct2=new Citizen("Rahul","India",19,23456);
		
		
		Insurance obj=new Insurance();
		obj.InsuranceId=1200;
		obj.SSN=999;
		obj.Print();
		obj.Print("Hello");
		
		EncapsulationExample emp=new EncapsulationExample();
		emp.setSalary(50000);
		emp.setCompany("Porter");
		emp.setEmpId(1001);
		System.out.println("This is emp salary"+ emp.getSalary());
		System.out.println("This is company name"+ emp.getCompany());
		System.out.println("This is empid"+ emp.getEmpId());
	
	
	
	
	
	}
	

}
