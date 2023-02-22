package sec04.exam01;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		int keyCode;
			
		while(true) {
			keyCode = System.in.read();
			System.out.printf("keyCode: %d", + keyCode);
			//System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		} 	
		
		System.out.println("종료");
	}	
}
