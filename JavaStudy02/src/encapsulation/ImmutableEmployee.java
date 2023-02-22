package encapsulation;

public class ImmutableEmployee {

	private String employeeID;
	private String firstName;
	private String lastName;
	
public ImmutableEmployee(String id, String first, String last) {
	employeeID = id;
	firstName = first;
	lastName = last;
}
	
	public int getEmployeeID () {
		return Integer.parseInt(employeeID);
	}
	
		public String getFirstName () {
			return firstName;
		}
	
		public String getLastName() {
			return lastName;
		}
	
	
}
