package passing.parameters;
import java.util.*;

public class NoFlagRoster {

	protected int capacity;
	protected List<String> students;
	
	public NoFlagRoster(int max) {
		capacity = max;
		students = new ArrayList<>();
	}
	
	/**
	 * Adds the student name to the List that is used to maintain the
	 * List.
	 * 
	 * @param name		Student to add to the list.
	 */
	public void addStringToList(String name) {
		students.add(name);
	}
	
	/**
	 * Attempts to add the student name to the List that is used to
	 * maintain the list. There is a capacity value that normally will
	 * limit the number of students that can be on the list, but the
	 * caller can override this check if desired.
	 * 
	 * @param name		Student to add to the list.
	 * @return		<code>true</code> if the student was added
	 * 		to the list, <code>false</code> otherwise.
	 */
public boolean conditionalAddStringToList(String name) {
	if (students.size() >= capacity) {
		return false;
	}
	addStringToList(name);
	return true;
	}

}
