package instanceOf03;

interface Flyable{
	
}
class Bat implements Flyable{
	
}
class Sparrow implements Flyable{
	
}

public class Driver {

	public static void main(String[] args) {
		Flyable bat = new Bat();
		Flyable spa = new Sparrow();
		
		System.out.println(bat instanceof Flyable); //true
		System.out.println(bat instanceof Bat);	//true
		
		System.out.println(spa instanceof Flyable);	//true
		System.out.println(spa instanceof Sparrow);	//true

	}

}
