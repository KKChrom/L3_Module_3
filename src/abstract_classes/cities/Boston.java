package abstract_classes.cities;

public class Boston extends City {


	

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		getAnnualTaxes(population, growthRate);
	}




	@Override
	double getAnnualTaxes() {
		double returnVal = 0;
		returnVal = population *1.5 * growthRate;
		return returnVal;
	}

}
