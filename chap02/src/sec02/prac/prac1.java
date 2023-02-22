package sec02.prac;

public class prac1 {

	public static void main(String[] args) {
		//순서는 byte short int long float double , char는 유니코드
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
