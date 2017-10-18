package by.http.Task11;

public class Main {

	public static void main(String[] args) 
	{
		double []mas=new double[] {327, 381, 891, 918, 212, 848, 770, 363, 416, 736};
		
		double max= mas[0];;
		for(int i=0; i< mas.length; i++)
		{			
			if(mas[i]>max)
			{
				max=mas[i];
			}
		}
		
		
		for(int i=0; i< mas.length; i++)
		{			
			double x = mas[i]/max;
			String formattedDouble = String.format("%.2f ", x);
			System.out.print(formattedDouble+" ");
		}
	}

}
