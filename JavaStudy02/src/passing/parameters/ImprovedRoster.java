package passing.parameters;
import java.util.*;

public class ImprovedRoster {

	protected int capacity;
	protected List<String> students;
	
	public ImprovedRoster(int max) {
		capacity = max;
		students = new ArrayList<>();
	}
	
	/**
	 * Enrolls the student in this course.
	 * 
	 * @param name Name of the student to enroll.
	 */
	public void enrollStudent(String name) {
		students.add(name);
	}
	
	/**
	 * Attempts to enroll a student in this couse. The student is added
	 * only if the capacity limit for the course has not been reached.
	 * 
	 * @param name Name of student to enroll.
	 * @return		<code>true</code> if the student was added
	 * 		to the list, <code>false</code> otherwise.
	 */
public boolean enrollStudentConditionally(String name) {
	boolean isEnrolled = false;
	if (students.size() < capacity) {
	enrollStudent(name);
	isEnrolled = true;
	}
	return isEnrolled;
	}

}
