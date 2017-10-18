package by.http.HomeWork_2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) 
	{
		int [] nembers = new int[]{1, 2, -101, 3, 128, -5, 4, -11, 12, 96, -2, 325};		
		
		System.out.println(findMaxValue(nembers));
		System.out.println(findMinValue(nembers));
		
		int [] sortNembers = sort(nembers);
		for(int i=0; i<sortNembers.length; i++)
		{
			System.out.print(sortNembers[i]+" ");
		}
		

	}
	
	public static int findMaxValue(int [] numbers)
	{
		int max = numbers[0];
		
		for(int i=0; i<numbers.length-1;i++)
		{
			if(numbers[i]> max)
			{
				max = numbers[i];
			}
		}
		return max;
	}
	
	
	public static int findMinValue(int [] numbers)
	{
		int min = numbers[0];
		
		for(int i=0; i<numbers.length-1;i++)
		{
			if(numbers[i]< min)
			{
				min = numbers[i];
			}
		}
		return min;
	}
	
	public static int[] sort(int [] numbers)
	{
		 for (int i = 0; i < numbers.length; i++)
		    {
		        for (int j = 0; j < numbers.length - i - 1 ; j++)
		        {
		            if (numbers[j] > numbers[j + 1])
		            {
		                int temp = numbers[j];
		                numbers[j] = numbers[j + 1];
		                numbers[j + 1] = temp;
		            }
		        }
		    }
		 
		 return numbers;
	}
}
