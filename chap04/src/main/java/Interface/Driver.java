package Interface;

interface Speakable {
	double PI = 3.14159;
	final double absoluteZeroPoint = -275.15;
	
	void sayYes();
}

class Speaker implements Speakable {
	public void sayYes() {
		System.out.println("I say NO!!");
	}
}

public class Driver {
	public static void main(String[] args) {
		System.out.println(Speakable.absoluteZeroPoint);
		System.out.println(Speakable.PI);
		
		Speaker reporter1 = new Speaker();
		reporter1.sayYes();

	}

}
