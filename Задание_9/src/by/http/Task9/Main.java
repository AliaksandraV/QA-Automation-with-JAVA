package by.http.Task9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int otvet=0;
		char z;
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("������� ���� ��� �������� �+� �-� �/� ��� �*�: ");
		do
		{
			z = sc.next().charAt(0);;
			if(z=='+'||z=='-'||z=='*'||z=='/')
			{
				System.out.println("�� �����: " +z);
				break;
			}
			if(z=='0')
			{
				System.out.print("����� �� ���������.");
				System.exit(0);
			}
			else
			{
				System.out.print("�� ����� �������� ����, ��������� ����: ");
			}
		}while(true);
		 		 	 
	 	
        System.out.print("������� X: ");
        int x = sc.nextInt();        
        	        
        System.out.print("������� Y: ");
        int y = sc.nextInt();
        
        if(z == '+')
        {
    	  otvet = x+ y;
        }
        else if(z == '-')
        {
  	    	  otvet = x- y;
  	    }
        else if(z == '/')
        {
        	otvet = x/ y;
        }
        else if(z == '*')
        {
        	otvet = x* y;
        }     
        
        System.out.println("�� �����: " + x + z + y);
        System.out.println("�����: " + otvet);        
        
	}

}
