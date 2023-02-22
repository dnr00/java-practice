package avoid.duplication;

public class AddingMachine {

	/**
	 * Adds two integers together and returns the result.
	 */
	public static int addIntegers(int first, int second) {
		return first + second;
	}

	/**
	 * Adds some number of integers together and returns the result.
	 */
	public static int addIntergers(int[] values) {
		int result = 0;
		for (int value : values) {
			result += value;
		}
		return result;
	}

}
