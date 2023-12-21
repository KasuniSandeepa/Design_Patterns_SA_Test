package Adapter;

public class Person {
	
	private String NIC;
	private String FirstName;
	private String LastName;
	private String Phone;
	
	public Person(String nic , String firstName , String LastName , String phone)
	{
		this.NIC = nic;
		this.FirstName = firstName;
		this.LastName = LastName;
		this.Phone = phone;
	}

	

	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	
	

}
