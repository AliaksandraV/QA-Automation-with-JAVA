package by.http.Task8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, n, m;
		
		System.out.print("¬ведите число: ");
        a = sc.nextInt();
        System.out.print("¬ведите цифру которую из него надо удалить: ");
        n = sc.nextInt();
        b = 0;
        while (a>0)
        {
            m = a % 10;
            if (m != n)
                b = b * 10 + m;
            a = a / 10;
        }
        while (b > 0)
        {
            a = a * 10 + b % 10;
            b = b / 10;
        }
        System.out.println("–езультат: "+a);
	}

}
