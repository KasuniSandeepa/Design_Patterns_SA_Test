package Decorator;

public class WorkExperience extends EmployeeQualification{
	
	Employee employee;
	private String description = "General employee";
	
	public WorkExperience(Employee employee) {
		this.employee = employee;
	}
	
	public double getSalary() {
		return employee.getSalary() + 20000;
	}

	@Override
	public String getDescrition() {
		// TODO Auto-generated method stub
		return this.description;
	}

}
