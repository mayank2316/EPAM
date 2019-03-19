package Calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAddition() {
		Calculator test= new Calculator();
		ArrayList<Integer> list= new ArrayList<>();
		list.add(5);  list.add(6);
		list.add(7);  list.add(8);
		int output= test.add_numbers(list);
		assertEquals(26, output);
	}

	@Test
	public void testMultiplication() {
		Calculator test= new Calculator();
		ArrayList<Integer> list= new ArrayList<>();
		list.add(5);   list.add(6);
		list.add(7);   list.add(8);		
		int output= test.multiply_numbers(list);
		assertEquals(1680, output);
	}
	
	@Test
	public void testDivision() {
		Calculator test= new Calculator();
		int num1=6; 	int num2=2;
		int result= test.division_two_numbers(num1, num2);
		assertEquals(3,result);
	}
}
