package Decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Engineer();
		employee = new EmployeeCertification(employee);
		employee = new WorkExperience(employee);
		
		System.out.println(employee.getSalary());
		
		Employee employee2 = new Consultant();
		employee2 = new WorkExperience(new EmployeeCertification(employee2));
		System.out.println(employee2.getSalary());
		
		System.out.println( new WorkExperience(new EmployeeCertification(new Manager())).getSalary());
		
		
	
	}

}
