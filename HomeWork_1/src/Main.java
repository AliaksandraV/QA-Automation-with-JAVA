import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {

	static char K;
	
	public static void main(String[] args) 
			throws java.io.IOException
	{		
		one();
		two();
		three();
		four();
		five();
		six();
		seven();
		eight();
		nine();
		ten();
		eleven();
		twelve();
	}
	
	public static void one()
	{
		System.out.println("№1");
		System.out.println("Hello world!");
		System.out.println(" ");
	}
	
	
	public static void two()
	{
		System.out.println("№2");
		System.out.println("Когарева\nАлександра\nВладимировна");
		System.out.println(" ");
	}
	
	
	public static void three()
	{
		System.out.println("№3");
		int a=3, b=2;
		
		System.out.println(a+b);
		System.out.println(" ");
	}
	
	
	public static void four()
	{
		System.out.println("№4");
		
		int otvet=0;
		
		 Scanner in = new Scanner(System.in);
		 
		 	int firsNum=0;
	        System.out.print("Введите первый аргумент: ");
	        if(in.hasNextInt())
	        {
	        	firsNum = in.nextInt();
	        }else {
	            System.out.println("Вы ввели не целое число");
	            return;
	        }	        
	        
	        
	        int secNum=0;	        
	        System.out.print("Введите второй аргумент: ");
	        if(in.hasNextInt())
	        {	
	        	secNum = in.nextInt();
	        }else {
	            System.out.println("Вы ввели не целое число");
	            return;
	        }	
	       
	        
	        System.out.print("Введите знак арифметической операции: ");	        
	        char znak = in.next().charAt(0);
	      
	      if(znak == '+')
	      {
	    	  otvet = firsNum+ secNum;
	      }
	      else if(znak == '-')
	      {
	    	  otvet = firsNum- secNum;
	      }
	      else if(znak == '/')
	      {
	    	  otvet = firsNum/ secNum;
	      }
	      else if(znak == '*')
	      {
	    	  otvet = firsNum* secNum;
	      }
	      else
	      {
	    	  System.out.println("Неизвестная операция.");
	    	  return;
	      }
	        
	      System.out.println("Вы ввели: " + firsNum + znak + secNum);
	      System.out.println("Ответ: " + otvet);		
		
		
		System.out.println(" ");
	}
	
	
	public static void five()
	{
		System.out.println("№5");
		Scanner in = new Scanner(System.in);
		int firsNum=0;
        System.out.print("Введите целое число от 0 до 9: ");
        if(in.hasNextInt())
        {
        	firsNum = in.nextInt();
        }               
        else {
            System.out.println("Вы ввели не целое число");
            return;
        }
        if(firsNum<0||firsNum>9)
        {
        	System.out.print("Введенное число не попадает в указанный диапазон.");
        	return;
        }
        
        String numberName = null;
        
        switch (firsNum) 
        {        
	        case 0:  numberName = "Ноль";
				break;
        	case 1:  numberName = "Один";
	        		break;
			case 2:  numberName = "Два";
			        break;
			case 3:  numberName = "Три";
			        break;
			case 4:  numberName = "Четыре";
			        break;
			case 5:  numberName = "Пять";
			        break;
			case 6:  numberName = "Шесть";
			        break;
			case 7:  numberName = "Семь";
			        break;
			case 8:  numberName = "Восемь";
			        break;
			case 9:  numberName = "Девять";
			        break;	
        }            
        System.out.println("Вы ввели: " + numberName );
        System.out.println(" ");
	}
	
	
	public static void six()
	{
		System.out.println("№6");
		Scanner in = new Scanner(System.in);
		int firsNum=0;
        System.out.print("Введите целое число от 0 до 9: ");
        if(in.hasNextInt())
        {
        	firsNum = in.nextInt();
        }               
        else {
            System.out.println("Вы ввели не целое число");
            return;
        }
        if(firsNum<0||firsNum>9)
        {
        	System.out.print("Введенное число не попадает в указанный диапазон.");
        	return;
        }
        
        if(firsNum % 2 == 0) {
            System.out.println("Вы ввели - " + firsNum + ", число четное.");
        } else {
            System.out.println("Вы ввели - " + firsNum + ", число нечетное.");
        }
	}
	
	
	public static void seven()
	{
		System.out.println("№7");
		Scanner in = new Scanner(System.in);
		int firsNum=0;
        System.out.print("Введите целое число от -9 до 9: ");
        if(in.hasNextInt())
        {
        	firsNum = in.nextInt();
        }               
        else {
            System.out.println("Вы ввели не целое число");
            return;
        }
        if(firsNum<-9||firsNum>9)
        {
        	System.out.print("Введенное число не попадает в указанный диапазон.");
        	return;
        }
        
        if(firsNum % 2 == 0) 
        {
            if(firsNum>0)
            {
            	System.out.println("Вы ввели " + firsNum + ", число четное положительное.");
            	//return;
            }
            if(firsNum<0)
            {
            	System.out.println("Вы ввели " + firsNum + ", число четное отрицательное.");
            }
        } 
        else 
        {
        	if(firsNum>0)
            {
            	System.out.println("Вы ввели " + firsNum + ", число нечетное положительное.");
            	//return;
            }
            else if(firsNum<0)
            {
            	System.out.println("Вы ввели " + firsNum + ", число нечетное отрицательное.");
            }             	
        }
        System.out.println(" ");          
	}

	
	public static void eight()
	{
		System.out.println("№8");
				
		Scanner in = new Scanner(System.in);		
		
        System.out.print("Введите месяц: ");
        String text = in.nextLine();
        
        
        String [] compare= new String[]{
        	"декабрь", "январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь","ноябрь"
        };
        
        for(int i=0; i<compare.length; i++)
        {
        	if(compare[i].equals(text))
        	{
        		if(i==0||i==1||i==2)
        		{
        			System.out.println("Зима");
        		}
        		if(i==3||i==4||i==5)
        		{
        			System.out.println("Весна");
        		}
        		if(i==6||i==7||i==8)
        		{
        			System.out.println("Лето");
        		}
        		if(i==9||i==10||i==11)
        		{
        			System.out.println("Осень");
        		}       		
        		return;
        	}
        }        
		System.out.println("Совпадения не найдены.");
        
		System.out.println(" ");
	}
	
	
	public static void nine()
	{
		System.out.println("№9");	
		
		int otvet =0;
		for(int sum=0; sum<101; sum+=1)
		{
			otvet+=sum;			
		}		
		System.out.println("Сумма чисел от 0 до 100 ровна " +otvet);
		
		System.out.println(" ");
	}
	
	
	public static void ten()
	{
		System.out.println("№10");
		
		Scanner in = new Scanner(System.in);
		System.out.println ("Введите 3 любых целых числа: ");
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int number3 = in.nextInt();
		
		int[] mass = new int[]{
				number1, number2, number3
		};
		int max=mass[0];
		int min=mass[0];
		
		for(int i=0;i<mass.length;i++)
		{
			if(mass[i]>max)
			{
				max=mass[i];
			}
			if(mass[i]<min)
			{
				min=mass[i];
			}
		}	
		System.out.print(min + max);
		
		System.out.println(" ");
	}

	
	public static void eleven() throws java.io.IOException
	{
		System.out.println("№11");
		
		System.out.println("Программа будет выполняться пока не будет введено q и нажата Enter:");
		
		while((char)System.in.read()!='q')
		{
			
		}			
		System.out.println("Ввели q, выход из программы.");	
			
		System.out.println(" ");
	}
	
	
	public static void twelve() throws java.io.IOException
	{
		System.out.println("№12");
		
		BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

		String str = " ";
		
		System.out.println("Программа будет выполняться пока не будет введено слово stop и нажата Enter:");		
		while (!str.equals("stop"))
		{
			str = br.readLine();
		}			
		System.out.println("Ввели stop, выход из программы.");
		System.out.println(" ");
	}
}
