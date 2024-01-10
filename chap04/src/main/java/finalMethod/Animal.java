package finalMethod;

public class Animal {
	final void breath() {
		System.out.println("호흡 중");
	}
}

class Mammalia extends Animal{
//	void breath() {
//		System.out.println("호흡 중");
//	}
	//Cannot override the final method from Animal
	// final 메소드를 오버라이드 할 수 없음
}
