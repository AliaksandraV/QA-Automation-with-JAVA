package by.http.task6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Введите число: ");
		int a = sc.nextInt();
		
		if (a==0){
			System.out.println("Вы ввели ноль");
			System.exit(0);
		}
		if (a>0){
			System.out.print("Вы ввели положительное число, ");
		}else{
			System.out.print("Вы ввели отрицательное число, ");
		}
		int n = String.valueOf(Math.abs(a)).length();
		System.out.println("количество символов в числе "+n);
	}

}
