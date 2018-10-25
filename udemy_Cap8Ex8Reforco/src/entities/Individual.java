package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (getAnualIncome() < 20000) {
			return 0.15 * getAnualIncome() - 0.5 * getHealthExpenditures();
		} 
		else {
			return 0.25 * getAnualIncome() - 0.5 * getHealthExpenditures();
		}

	}
}
