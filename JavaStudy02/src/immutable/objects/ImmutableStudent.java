package immutable.objects;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class ImmutableStudent {

	private List<TestScore> testScores;
	private String name;
	
	public ImmutableStudent(List<TestScore> scores, String name) {
		this.testScores = Collections.unmodifiableList(
				new ArrayList<TestScore>(scores));
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<TestScore> getTestScores() {
		return testScores;
	}
	public int getAverage() {
		int total = 0;
		for (TestScore testScore : testScores) {
			total += testScore.getPercentCorrect();
		}
		return total / testScores.size();
	}
	

}
