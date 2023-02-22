package encapsulation;

public class Employee {

	public int employeeID;
	public String firstName;
	public String lastName;
	
	public int getEmployeeID () {
		return employeeID;
	}
	
	public void setEmployeeID(int id) {
		employeeID = id;
	}
	
	public String getFirstName () {
		return firstName;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String name) {
		lastName = name;
	}
}
