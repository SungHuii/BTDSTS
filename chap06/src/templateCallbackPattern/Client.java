package templateCallbackPattern;

public class Client {
	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("총! 초초초총 총총!");
		
		System.out.println();
		
		rambo.runContext("칼! 카카카칼 칼칼!");
		
		System.out.println();
		
		rambo.runContext("도끼! 도도도독 도끼!");

	}

}
