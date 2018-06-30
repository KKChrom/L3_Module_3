package abstract_classes.cities;

public class Boston extends City {


	

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		getAnnualTaxes(population, growthRate);
	}




	@Override
	double getAnnualTaxes() {
		double returnVal = 0;
		double bonusVal = population*.5;
		returnVal = population  * growthRate + bonusVal;
		return returnVal;
	}

}
