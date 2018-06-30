package abstract_classes.farm;

public class Fish extends Animals {

	@Override
	public void makesNoise() {
		System.out.println("Glub");

	}

	@Override
	public void eats() {
		System.out.println("Anything in water");

	}

}
