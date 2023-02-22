package avoid.duplication;

public class EditedAddingMachine {

	/**
	 * Adds two integers together and returns the result.
	 */
	public static int addIntegers(int first, int second) {
		int[] values = new int[] {first, second};
		return addIntegers(values); //왜 not applicable?
	}

	/**
	 * Adds some number of integers together and returns the result.
	 */
	public static int addIntegers(int[] values) {
		int result = 0;
		for (int value : values) {
			result += value;
		}
		return result;
	}

}
