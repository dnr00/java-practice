package sec01.exam03;

public class practice2 {

	public static void main(String[] args) {
		int v1 = 0;
		if (true) {
			int v2 = 0;
			if (true) {
				int v3 = 0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
			}
			v1 = v2 + v3; //블록 내부에서 선언된 v3은 밖에서 사용 불가
		}
		System.out.println(v1);
	}

}
