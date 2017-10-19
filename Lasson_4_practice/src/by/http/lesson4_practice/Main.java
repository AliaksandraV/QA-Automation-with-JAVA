package by.http.lesson4_practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
//		Student student1 = new Student("Jenia");		
//		Student student2 = new Student("18");	
//		Student student3 = new Student(55, 170);
		
//		System.out.println(student1);
//		task_1();
//		task_2();
//		task_3();
//		task_4();
//		task_5();
		task_6();

	}
	
	
	public static void task_1()
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
			System.out.print(mas[i]+" ");
		}
	}
	
	public static void task_2() 
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

	public static void task_3()
	{
		double []masA=new double[] {-1.49,  0.50, -4.70, -1.08, 
									-4.95,  1.14, -2.46, 2.61, -3.14,  
									4.35, 0.52,  1.24,  4.29, -2.39, 
									-3.95, -4.91, -4.35,  3.60,  2.50, 
									-0.21};
		
		
		int j=0, s=0;
		double sum=0;
		
		for(int i=1; i< masA.length; i+=2)
		{
			if(masA[i]>0)
			{
				j++;
				//System.out.print(masA[i]+" ");
			}
		}	
		
		double []masB=new double[j];
		
		for(int i=1; i< masA.length; i+=2)
		{
			if(masA[i]>0)
			{
				masB[s]= masA[i];
				sum = sum + masB[s] * masB[s];
				System.out.print(masB[s]+" ");
				s++;
			}
		}
		System.out.println("\n"+sum);		
	}
	
	public static void task_4()
	{
		int m [] []={
			{18, 11,  5},
			{18,  1,  6},
			{ 2, 14, 14},
			{13,  5, 11},
			//{0,  0, 1}
		};
		
		for (int i = 0; i < m.length; i++) 
		{
		      for (int j = 0; j <m[i].length; j++) 
		      {
		        System.out.print(m[i][j] + "   ");		 
		      }
		      System.out.println();
		}
		
		System.out.println();
		
		
		for (int i = 0; i < m.length; i++) //СПРОСИТЬ почему при разном кол-ве строк плохо работает
		{
		      for (int j = 0; j <m[i].length; j++) 
		      {
		    	int tmp = m[0][j];  
		  		m[0][j] = m[3][j];  
		  		m[3][j] = tmp;		
		  		
		  		System.out.print(m[i][j] + "   ");
		      }
		      System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < m.length; i++) 
		{
		      for (int j = 0; j <m[i].length; j++) 
		      {
		        System.out.print(m[i][j] + "   ");		 
		      }
		      System.out.println();
		}
		
		
		
	}

	public static void task_5()
	{
		int m [] []={
				{18, 11,  5},
				{18,  1,  27},
				{ 2, 19, 14},				
			};
			
		System.out.println("Дан массив:");		
		for (int i = 0; i < m.length; i++) 
		{
		      for (int j = 0; j <m[i].length; j++) 
		      {
		        System.out.print(m[i][j] + "   ");		 
		      }
		      System.out.println();
		}		
		System.out.println();
		
		
		
		for (int i = 0; i < m.length; i++) 
		{
			int tmp = m[i][0];  
			for (int j = 0; j <m[i].length; j++)
			{
		        if(tmp<m[i][j])
		        {
			        	tmp = m[i][j];
		        }	
		    }
		     System.out.println("Максимальное значение "+(i+1)+" строки "+tmp);
		}
			
			System.out.println();
			
	}
	
	public static void task_6()
	{
		int m [] []={
				{18, 11,  5, 14},
				{14, 18,  1,  6},
				{ 2, 14, 14, 0},
				{13,  5, 11, 11}				
			};
		
		System.out.println("Дан массив:");		
		for (int i = 0; i < m.length; i++) 
		{
		      for (int j = 0; j <m[i].length; j++) 
		      {
		        System.out.print(m[i][j] + "   ");		 
		      }
		      System.out.println();
		}		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.print("Введите число которое искать: ");
		int x = sc.nextInt();
		for (int i = 0; i < m.length; i++) 
		{
		      for (int j = 0; j <m[i].length; j++) 
		      {
		        if (x==m[i][j])
		        {
		        	count++;
		        }
		      }		      
		}	
		
		if(count==0)
		{
			System.out.println("В массиве нет указанного значения.");
		}
		else
		{
			System.out.println("Значение встречается "+count+" раз");
		}
	}

}
