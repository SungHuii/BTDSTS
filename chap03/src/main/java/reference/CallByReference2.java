package reference;

public class CallByReference2 {
	public static void main(String[] args) {
		Animal ref_a = new Animal();
		Animal ref_b = ref_a; // Call By Reference(참조에 의한 호출)
		
		System.out.println(ref_a); // 주소값
		System.out.println(ref_b); // 위의 주소값과 동일함.
		// 두 변수가 같은 객체를 참조하고 있기 때문에 주소값은 동일하게 나온다.
	}

}