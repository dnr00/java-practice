package avoid.duplication;

public class DuplicationSample {

	protected int firstValue;
	protected String secondValue;
	protected Integer thirdValue;
	
	public DuplicationSample(int first, String second, Integer third) {
		this(first, second, new Integer(0)); //자바 버전 문제
	}

}
