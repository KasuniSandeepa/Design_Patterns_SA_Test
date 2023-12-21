package Adapter;

public class Adapter {
	
	Person person;
	Student student;
	
	
	public Adapter(Person person) {
		this.person = person;
	}
	
	public void convert() {
		
		student = (Student) new UniversityStudent(person.getFirstName()+person.getLastName() , "21" , person.getPhone());
				
		student.getFullName();
		student.getContactNumber();
		student.getAge();
		
	}

	

	
}
