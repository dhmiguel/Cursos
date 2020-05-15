package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public Double tax() {
		double result = 0;
		if(anualIncome < 20000.00 && healthExpenditures != 0) {
			result = (anualIncome * 0.15) - (healthExpenditures * 0.50);
		}
		else if(anualIncome < 20000.00 && healthExpenditures == 0) {
			result =  (anualIncome * 0.15);
		}
		else if(anualIncome >= 20000.00 && healthExpenditures !=0) {
			result = (anualIncome * 0.25) - (healthExpenditures * 0.50);
		}
		else if(anualIncome >= 20000.00 && healthExpenditures ==0) {
			result = (anualIncome * 0.25);
		}
		return result;
	}
	
	public String ToString() {
		return getName() + ": $ " + getAnualIncome();
	}

}
