package method.design;

public class TestOrigin {
	
	public void doSomethingComplex(int a, int b, Object c, int d) {
		if (a < b) {
			if (c instanceof Number) {
				for (int i = 0; i < count; i++) {
					if(getSomeData(i) == null) {
						while (d < 5) {
							if (d == 0) {
								handleSpecialCase();
							}
						}
					}
				}
			}
		}
	}

}
