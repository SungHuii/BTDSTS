package strategyPattern;

public class StrategyGun implements Strategy{
	@Override
	public void runStrategy() {
		System.out.println("탕, 탕탕, 탕다당");
	}
}
