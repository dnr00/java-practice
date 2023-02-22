package sec03.exam;

public class prac8 {

	public static void main(String[] args) {
		//10번
		String str1 = 2 + 3 + ""; //숫자끼리 먼저(5)
		String str2 = 2 + "" + 3; //문자열 결합 (23)
		String str3 = "" + 2 + 3; //문자열 결합 (23)
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
