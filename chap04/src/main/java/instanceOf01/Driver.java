package instanceOf01;

class Animal{
	
}
class Birds extends Animal{
	
}
class Penguin extends Birds{
	
}

public class Driver {

	public static void main(String[] args) {
		Animal ani = new Animal();
		Birds birds = new Birds();
		Penguin pen = new Penguin();
		
		System.out.println(ani instanceof Animal); // true
		
		System.out.println(birds instanceof Animal); // true
		System.out.println(birds instanceof Birds); // true
		
		System.out.println(pen instanceof Animal); // true
		System.out.println(pen instanceof Birds); // true
		System.out.println(pen instanceof Penguin); // true
		
		System.out.println(pen instanceof Object); // true
	}

}
