package by.http.Task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("������� ������� ����: ");
		int d = sc.nextInt();
		int d2 = 2;
		
		System.out.print("������� ������ ����: ");
		int h = sc.nextInt();
		
		System.out.print("������� ������ ������: ");
		int r = sc.nextInt();
	
		double sum = (Math.PI*Math.pow(d, d2))/4;		
		
		double sum2 = Math.PI*d*h;		
		
		double sum3 = (sum+sum2)/r;
		System.out.println("��� ����������� ��������� "+Math.ceil(sum3)+" �����");
		
		

	}

}
