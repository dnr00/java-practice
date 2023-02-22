package sec03.exam;

public class prac7 {

	public static void main(String[] args) {
		//9번
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int) (var1 + var2 + (int)var3 + Double.parseDouble(var4));
		System.out.println(result);
	}

}
