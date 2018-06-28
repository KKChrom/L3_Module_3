package abstract_classes.cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		getAnnualTaxes(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double halfGR = growthRate/2;
		double returnVal = 0;
		returnVal = population*growthRate * halfGR;
		return returnVal;
		
	}

}
