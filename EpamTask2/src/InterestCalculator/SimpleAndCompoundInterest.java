package InterestCalculator;

//Program to calculate Simple Interest and Compound Interest 

public class SimpleAndCompoundInterest {
	
	int principle,time;
	float roI;
	/* @param principle
	 * @param roI denotes rate Of Interest of the loan
	 * @param Time denotes Time Period of the loan
	*/

	public SimpleAndCompoundInterest(int principle, float rOI, int time) {
		this.principle = principle;
		this.roI = roI;
		this.time = time;
	}

	// Calculate Simple Interest for the data

	public double calcSimpleInterest() {
		return (principle * time * roI) / 100;
	}

	// Calculate Compound Interest for the data

	public double calcCompoundInterest() {
		return principle * (Math.pow((1 + roI / 100), time));
	}
}
