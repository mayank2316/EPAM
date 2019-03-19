package HouseCostEstimation;

/* The program estimates cost of the house depending
 * on the various materials used, area of the
 * house and other special features such as automation  */

public class CostEstimator {
	int materialType;
	double areaOfHouse;
	boolean isAutomated;
	
	public CostEstimator(int materialType, double areaOfHouse, boolean isAutomated) {
		this.areaOfHouse = areaOfHouse;
		this.materialType = materialType;
		this.isAutomated = isAutomated;
	}
	
	//function to calculate the cost of the house depending on the data given.
	
	public double Calc_Cost() {
		int cost = 0;
		if(materialType==0)
			cost = 1200;
		else if(materialType==1)
			cost = 1500;
		else if(materialType==2 && isAutomated)
			cost = 2500;
		else
			cost = 1800;
		return areaOfHouse * cost;
	}
}
