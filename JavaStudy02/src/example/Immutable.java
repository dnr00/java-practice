package example;

public class Immutable {

	public static void main(String[] args) {
	String myString = "Hi";
	System.out.println(myString);
	myString = "Hello";
	System.out.println(myString);
	myString = "Hello there";
	System.out.println(myString); 
	
	// 겉으로 보기에는 값을 수정 가능한 것처럼 보이지만, 새로운 값을 할당하고 참조하는 것
	// String. Integer, Boolean은 불변객체임
	
	}
}
