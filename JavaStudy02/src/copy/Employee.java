package copy;

public class Employee implements Cloneable {
	//clone() 메서드 : 얕은 복제 - 원본 수정이 복사본에 영향을 줌

	private int employeeID;
	private String firstName;
	private String lastName;
	
	public Employee(int id, String first, String last) {
		employeeID = id;
		firstName = first;
		lastName = last;
	}
	
	public int getEmployeeID () {
		return employeeID;
	}
	
	public String getFirstName () {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}
