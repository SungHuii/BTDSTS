package reference;

public class CallByValue {
	public static void main(String[] args) {
		int a = 10;
		int b = a;  // Call By Value (값에 의한 호출) : 값이 복사됨.
		
		b = 20;
		
		System.out.println(a); // 10
		System.out.println(b); // 20
	}

}
