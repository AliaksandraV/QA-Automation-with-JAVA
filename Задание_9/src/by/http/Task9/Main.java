package by.http.Task9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int otvet=0;
		char z;
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("Введите знак для операции «+» «-» «/» или «*»: ");
		do
		{
			z = sc.next().charAt(0);;
			if(z=='+'||z=='-'||z=='*'||z=='/')
			{
				System.out.println("Вы ввели: " +z);
				break;
			}
			if(z=='0')
			{
				System.out.print("Выход из программы.");
				System.exit(0);
			}
			else
			{
				System.out.print("Вы ввели неверный знак, повторите ввод: ");
			}
		}while(true);
		 		 	 
	 	
        System.out.print("Введите X: ");
        int x = sc.nextInt();        
        	        
        System.out.print("Введите Y: ");
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
        
        System.out.println("Вы ввели: " + x + z + y);
        System.out.println("Ответ: " + otvet);        
        
	}

}
