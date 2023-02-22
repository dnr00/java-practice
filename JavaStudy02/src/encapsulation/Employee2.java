package encapsulation;

public class Employee2 {

	public String employeeID; //int를 String으로 수정
	public String firstName;
	public String lastName;
	
	public int getEmployeeID () {
		return Integer.parseInt(employeeID); //파싱? 왜 하는걸까요?
	}
	
	public void setEmployeeID(int id) {
		employeeID = Integer.toString(id); //int to string
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
