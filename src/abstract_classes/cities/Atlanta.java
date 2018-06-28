package abstract_classes.cities;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		getAnnualTaxes(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double returnVal= 0;
		returnVal = population*growthRate*2;
		return returnVal;
	}

}
