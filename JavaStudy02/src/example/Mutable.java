package example;

public class Mutable {
	public int age; //final int age;로 넣으면 불변 클래스가 됨
	public int name;
	
	public Mutable(int age, int name) {
		this.age = age;
		this.name = name; // 외부에서 age, name 수정 가능. 불변객체 아님
	}
}
