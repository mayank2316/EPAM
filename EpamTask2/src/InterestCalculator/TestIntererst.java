package InterestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIntererst {

	@SuppressWarnings("deprecation")
	@Test
	void testSimpleInterest() {
		SimpleAndCompoundInterest simpleInterest;
		simpleInterest = new SimpleAndCompoundInterest(2316, 2.5f, 3);
		assertEquals(17320, simpleInterest.calcSimpleInterest());
		simpleInterest = new SimpleAndCompoundInterest(231605, 2.5f, 5);
		assertEquals(2895062.50, simpleInterest.calcSimpleInterest());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void testCompoundInterest() {
		SimpleAndCompoundInterest compoundInterest;
		compoundInterest = new SimpleAndCompoundInterest(20202, 2.5f, 3);
		assertEquals(21755.342888139312, compoundInterest.calcCompoundInterest());
		compoundInterest = new SimpleAndCompoundInterest(20202, 2.5f, 5);
		assertEquals(22856.7060585414, compoundInterest.calcCompoundInterest());
	}

}
