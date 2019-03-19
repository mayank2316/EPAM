package Calculator;

import java.util.ArrayList;

class Calculator{
	
	public int add_numbers(ArrayList<Integer> list)
	{
		int result=0;
		
		for(int i=0;i<list.size();i++)
		{
			result=result+list.get(i);
		}
		
		return result;
	}
	
	public int multiply_numbers(ArrayList<Integer> list)
	{
		int result=1;
		
		for(int i=0;i<list.size();i++)
		{
			result=result*list.get(i);
		}
		
		return result;
	}
	
	public int division_two_numbers(int num1, int num2)
	{
		return (num1/num2);
	}
	
	
	
}
