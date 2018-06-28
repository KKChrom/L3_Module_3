package abstract_classes.cities;

public abstract class City {
	protected int population;
	protected double growthRate;
	
	public City(int population, double growthRate) {
		this.population = population;
		this.growthRate = growthRate;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
	
	abstract double getAnnualTaxes();

	double getAnnualTaxes(int population, double growthRate) {
		// TODO Auto-generated method stub
		return 0;
	}
}
