package Super;

class Animal {
	void method() {
		System.out.println("동물");
	}
}

class Birds extends Animal {
	void method() {
		super.method();
		System.out.println("조류");
	}
}

class Penguin extends Birds{
	void method() {
		super.method();
		System.out.println("펭귄");
		
		// Syntax error on token "super", identifier expected
		// super.super.method();
	}
}

public class Driver {
	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		pororo.method();

	}

}
