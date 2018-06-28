package abstract_classes.cities;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		getAnnualTaxes( population,  growthRate);
		
	}

	@Override
	double getAnnualTaxes() {
		double returnVal = 0;
		returnVal = population*growthRate;
		return returnVal;
	}

}
