package templateMethodPattern;

public class Driver {

	public static void main(String[] args) {
		Animal white = new Dog();
		Animal kitty = new Cat();

		white.playWithOwner();
		
		System.out.println();
		System.out.println();
		
		kitty.playWithOwner();
	}

}
