package HouseCostEstimation;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import org.junit.Test;

class TestCostEstimator {

	void testCostEstimator() {
		CostEstimator ce;
		ce = new CostEstimator(0, 250, false);
		assertEquals(300000.0, ce.Calc_Cost());
		ce = new CostEstimator(0, 250.562585, false);
		assertEquals(300675.102, ce.Calc_Cost());
		ce = new CostEstimator(2, 1, true);
		assertEquals(2500, ce.Calc_Cost());
		ce = new CostEstimator(2, 1, false);
		assertEquals(1800, ce.Calc_Cost());		
	}
}
