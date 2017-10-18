package by.http.Task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("¬ведите диаметр бака: ");
		int d = sc.nextInt();
		int d2 = 2;
		
		System.out.print("¬ведите высоту бака: ");
		int h = sc.nextInt();
		
		System.out.print("¬ведите расход краски: ");
		int r = sc.nextInt();
	
		double sum = (Math.PI*Math.pow(d, d2))/4;		
		
		double sum2 = Math.PI*d*h;		
		
		double sum3 = (sum+sum2)/r;
		System.out.println("ƒл€ окрашивани€ требуетс€ "+Math.ceil(sum3)+" банок");
		
		

	}

}
