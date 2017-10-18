package by.http.Task7;

import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите год: ");
		int a = sc.nextInt();
		
		if (a%4==0)
		{
			if (a%100!=0)
			{
				System.out.print(" - високосный год");
			}			
			else 
			{
				if (a%400!=0)
				{
					System.out.print(" - невисокосный год");
				}			
			}
		}
		else
		{
			System.out.print(" - невисокосный год");
		}	
	}

}
