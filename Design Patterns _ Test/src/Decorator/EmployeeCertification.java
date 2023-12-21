package Decorator;

public class EmployeeCertification extends EmployeeQualification{
	
	Employee employee;
	
	
	public EmployeeCertification(Employee employee) {
		this.employee = employee;
	}
	
	public double getSalary() {
		return employee.getSalary() + 30000;
	}

	@Override
	public String getDescrition() {
		// TODO Auto-generated method stub
		return this.description;
	}


}
