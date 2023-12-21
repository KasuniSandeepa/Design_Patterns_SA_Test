package Adapter;

public class UniversityStudent implements Student{
	
	private String fullName;
	private String age;
	private String contactnumber;
	
	public UniversityStudent(String fullName , String age , String contactNumber) {
		this.fullName = fullName;
		this.age = age;
		this.contactnumber = contactNumber;
		
	}
	
	public void getFullName() {
		System.out.println("Full Name : "+this.fullName);
	};
	public void getContactNumber() {
		System.out.println("Contact Number : "+this.contactnumber);
	}
	public void getAge() {
		System.out.println("Age : "+this.age);
	}


}
