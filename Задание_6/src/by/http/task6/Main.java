package by.http.task6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("������� �����: ");
		int a = sc.nextInt();
		
		if (a==0){
			System.out.println("�� ����� ����");
			System.exit(0);
		}
		if (a>0){
			System.out.print("�� ����� ������������� �����, ");
		}else{
			System.out.print("�� ����� ������������� �����, ");
		}
		int n = String.valueOf(Math.abs(a)).length();
		System.out.println("���������� �������� � ����� "+n);
	}

}
