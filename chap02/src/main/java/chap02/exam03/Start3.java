package chap02.exam03;

public class Start3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = 10;
		int k = 20;
		
		if(1 == 10) {
			int m = k + 5;
			k = m;
		} else {
			int p = k + 10;
			k = p;
		}
		System.out.println(i + " " + k);
		// k = m + p;
	}

}
