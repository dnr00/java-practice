package passing.parameters;
import java.util.*;

public class Roster {

	protected int capacity;
	protected List<String> students;
	
	public Roster(int max) {
		capacity = max;
		students = new ArrayList<>();
	}
	
	/**
	 * Attempts to add the student name to the List that is used to
	 * maintain the list. There is a capacity value that normally will
	 * limit the number of students that can be on the list, but the
	 * caller can override that constraint if the student has been
	 * given permission from their advisor to add the class even though
	 * it's already full.
	 * 
	 * @param name		Student to add to the list.
	 * @param allowExcess	Override capacity check when adding student
	 * @return		<code>true</code> if the student was added
	 * 		to the list, <code>false</code> otherwise.
	 */
public boolean addStringToList(String name, boolean allowExcess) {
	if (!allowExcess) {
		if (students.size() >= capacity) {
			return false;
		}
	}
	students.add(name); //addElement 왜 오류?
	return true;
	}

}
