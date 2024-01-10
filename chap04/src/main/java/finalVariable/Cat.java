package finalVariable;

public class Cat {

	final static int stconst1 = 1;
	final static int stconst2;
	
	final int instconst1 = 1;
	final int instconst2;
	
	static {
		stconst2 = 2;
		
		// 상수는 한 번 초기화되면 값을 변경할 수 없다.
		// stf2 =4;
	}
	
	Cat() {
		instconst2 = 2;
		
		// 상수는 한 번 초기화되면 값을 변경할 수 없다.
		// instconst2 = 4;
		
		final int localconst1 = 1;
		final int localconst2;
		
		localconst2 = 2;
		// localconst2 = 4;
	}
	
}
