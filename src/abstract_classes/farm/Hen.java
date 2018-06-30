package abstract_classes.farm;

public class Hen extends Animals {

	@Override
	public void makesNoise() {
		System.out.println("Annoying Hen Noises");

	}

	@Override
	public void eats() {
		System.out.println("Seeds");

	}

}
