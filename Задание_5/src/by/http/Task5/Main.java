package by.http.Task5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("������� ������ �����: ");
		int a = sc.nextInt();
		
		System.out.print("������� ������ �����: ");
		int b = sc.nextInt();
		
//		if(a%2==0&&b%2==0)
//		{
//			System.out.println("�� ����� ��� ������ ����� ");
//		}
//		if(a%2!=0&&b%2!=0)
//		{
//			System.out.println("�� ����� ��� �������� ����� ");			
//		}
		
		
		if(a%2==0)
		{
			System.out.println("�������� ����� � ���������� b= "+b);
		}
		else
		{
			System.out.println("�������� ����� � ���������� a= "+a);			
		}
		//������� �������� � ���� ��� ����� ������ ��� �� ������?
	}

}
