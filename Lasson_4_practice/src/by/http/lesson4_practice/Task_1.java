package by.http.lesson4_practice;

public class Task_1 {
	
	public void Task1()
	{
	
		double mas[]=new double[]{0.92,  1.00,  0.42,  0.40,  0.48};
		int max=0;
		int min=0;
		
		for(int i=0; i<mas.length;i++)
		{
			if(mas[max]>mas[i])
			{
				max=i;
			}
			if(mas[min]<mas[i])
			{
				min=i;
			}
		}
		
		double b= mas[max];
		mas[max] = mas[min];
		mas[min] = b;
		
		for(int i=0; i<mas.length;i++)
		{
			System.out.println(mas[i]+" ");
		}
	}

}
