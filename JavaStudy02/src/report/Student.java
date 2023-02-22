package report;
import java.util.List;

public class Student {

	private List<TestScore> testScores;
	private String name;
	public Student(List<TestScore> scores, String name) {
		this.testScores = scores;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<TestScore> getTestScores() {
		return testScores;
	}

}
