package abstract_classes.farm;

public class Chicken extends Animals {

	@Override
	public void makesNoise() {
		System.out.println("Cluck");

	}

	@Override
	public void eats() {
		System.out.println("Seeds");
	}

}
