package abstract_classes.farm;

public class Turkey extends Animals {

	@Override
	public void makesNoise() {
		System.out.println("Really loud bakaw");

	}

	@Override
	public void eats() {
		System.out.println("More seeds");

	}

}
