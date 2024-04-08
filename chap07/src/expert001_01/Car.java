package expert001_01;

public class Car {

		Tire tire;
		
		public Car() {
			tire = new KoreaTire(); // 의존 관계
			// tire = new AmericaTire();
		}
		
		public String getTireBrand() {
			return "장착된 타이어 : " + tire.getBrand();
		}

}
