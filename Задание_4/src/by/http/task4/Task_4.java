package by.http.task4;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		int i;
		
		do
		{
			System.out.print("Введите четырехзначное число: ");
			i = sc.nextInt();
		}while(i<1000||i>=10000);
		
		int n1 = ((i- i%1000)/1000);
			
		int n2 = (i%1000)/100;
				
		int n3 = (i%100)/10;
				
		int n4 = i%10;
		
		int sum = n1*n2 + n3*n4;
		System.out.println("Ответ: "+sum);
	

	}

}
