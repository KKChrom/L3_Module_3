package abstract_classes.farm;

public class Cow extends Animals {

	@Override
	public void makesNoise() {
		System.out.println("Moo");

	}

	@Override
	public void eats() {
		System.out.println("Wheat");

	}

}
