package by.http.Task5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите первое число: ");
		int a = sc.nextInt();
		
		System.out.print("Введите второе число: ");
		int b = sc.nextInt();
		
//		if(a%2==0&&b%2==0)
//		{
//			System.out.println("Вы ввели два четных числа ");
//		}
//		if(a%2!=0&&b%2!=0)
//		{
//			System.out.println("Вы ввели два нечетных числа ");			
//		}
		
		
		if(a%2==0)
		{
			System.out.println("Нечетное число в переменной b= "+b);
		}
		else
		{
			System.out.println("Нечетное число в переменной a= "+a);			
		}
		//СДЕЛАТЬ ПРОВЕРКУ А если два числа четных или не четных?
	}

}
