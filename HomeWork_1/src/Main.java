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
		System.out.println("�1");
		System.out.println("Hello world!");
		System.out.println(" ");
	}
	
	
	public static void two()
	{
		System.out.println("�2");
		System.out.println("��������\n����������\n������������");
		System.out.println(" ");
	}
	
	
	public static void three()
	{
		System.out.println("�3");
		int a=3, b=2;
		
		System.out.println(a+b);
		System.out.println(" ");
	}
	
	
	public static void four()
	{
		System.out.println("�4");
		
		int otvet=0;
		
		 Scanner in = new Scanner(System.in);
		 
		 	int firsNum=0;
	        System.out.print("������� ������ ��������: ");
	        if(in.hasNextInt())
	        {
	        	firsNum = in.nextInt();
	        }else {
	            System.out.println("�� ����� �� ����� �����");
	            return;
	        }	        
	        
	        
	        int secNum=0;	        
	        System.out.print("������� ������ ��������: ");
	        if(in.hasNextInt())
	        {	
	        	secNum = in.nextInt();
	        }else {
	            System.out.println("�� ����� �� ����� �����");
	            return;
	        }	
	       
	        
	        System.out.print("������� ���� �������������� ��������: ");	        
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
	    	  System.out.println("����������� ��������.");
	    	  return;
	      }
	        
	      System.out.println("�� �����: " + firsNum + znak + secNum);
	      System.out.println("�����: " + otvet);		
		
		
		System.out.println(" ");
	}
	
	
	public static void five()
	{
		System.out.println("�5");
		Scanner in = new Scanner(System.in);
		int firsNum=0;
        System.out.print("������� ����� ����� �� 0 �� 9: ");
        if(in.hasNextInt())
        {
        	firsNum = in.nextInt();
        }               
        else {
            System.out.println("�� ����� �� ����� �����");
            return;
        }
        if(firsNum<0||firsNum>9)
        {
        	System.out.print("��������� ����� �� �������� � ��������� ��������.");
        	return;
        }
        
        String numberName = null;
        
        switch (firsNum) 
        {        
	        case 0:  numberName = "����";
				break;
        	case 1:  numberName = "����";
	        		break;
			case 2:  numberName = "���";
			        break;
			case 3:  numberName = "���";
			        break;
			case 4:  numberName = "������";
			        break;
			case 5:  numberName = "����";
			        break;
			case 6:  numberName = "�����";
			        break;
			case 7:  numberName = "����";
			        break;
			case 8:  numberName = "������";
			        break;
			case 9:  numberName = "������";
			        break;	
        }            
        System.out.println("�� �����: " + numberName );
        System.out.println(" ");
	}
	
	
	public static void six()
	{
		System.out.println("�6");
		Scanner in = new Scanner(System.in);
		int firsNum=0;
        System.out.print("������� ����� ����� �� 0 �� 9: ");
        if(in.hasNextInt())
        {
        	firsNum = in.nextInt();
        }               
        else {
            System.out.println("�� ����� �� ����� �����");
            return;
        }
        if(firsNum<0||firsNum>9)
        {
        	System.out.print("��������� ����� �� �������� � ��������� ��������.");
        	return;
        }
        
        if(firsNum % 2 == 0) {
            System.out.println("�� ����� - " + firsNum + ", ����� ������.");
        } else {
            System.out.println("�� ����� - " + firsNum + ", ����� ��������.");
        }
	}
	
	
	public static void seven()
	{
		System.out.println("�7");
		Scanner in = new Scanner(System.in);
		int firsNum=0;
        System.out.print("������� ����� ����� �� -9 �� 9: ");
        if(in.hasNextInt())
        {
        	firsNum = in.nextInt();
        }               
        else {
            System.out.println("�� ����� �� ����� �����");
            return;
        }
        if(firsNum<-9||firsNum>9)
        {
        	System.out.print("��������� ����� �� �������� � ��������� ��������.");
        	return;
        }
        
        if(firsNum % 2 == 0) 
        {
            if(firsNum>0)
            {
            	System.out.println("�� ����� " + firsNum + ", ����� ������ �������������.");
            	//return;
            }
            if(firsNum<0)
            {
            	System.out.println("�� ����� " + firsNum + ", ����� ������ �������������.");
            }
        } 
        else 
        {
        	if(firsNum>0)
            {
            	System.out.println("�� ����� " + firsNum + ", ����� �������� �������������.");
            	//return;
            }
            else if(firsNum<0)
            {
            	System.out.println("�� ����� " + firsNum + ", ����� �������� �������������.");
            }             	
        }
        System.out.println(" ");          
	}

	
	public static void eight()
	{
		System.out.println("�8");
				
		Scanner in = new Scanner(System.in);		
		
        System.out.print("������� �����: ");
        String text = in.nextLine();
        
        
        String [] compare= new String[]{
        	"�������", "������", "�������", "����", "������", "���", "����", "����", "������", "��������", "�������","������"
        };
        
        for(int i=0; i<compare.length; i++)
        {
        	if(compare[i].equals(text))
        	{
        		if(i==0||i==1||i==2)
        		{
        			System.out.println("����");
        		}
        		if(i==3||i==4||i==5)
        		{
        			System.out.println("�����");
        		}
        		if(i==6||i==7||i==8)
        		{
        			System.out.println("����");
        		}
        		if(i==9||i==10||i==11)
        		{
        			System.out.println("�����");
        		}       		
        		return;
        	}
        }        
		System.out.println("���������� �� �������.");
        
		System.out.println(" ");
	}
	
	
	public static void nine()
	{
		System.out.println("�9");	
		
		int otvet =0;
		for(int sum=0; sum<101; sum+=1)
		{
			otvet+=sum;			
		}		
		System.out.println("����� ����� �� 0 �� 100 ����� " +otvet);
		
		System.out.println(" ");
	}
	
	
	public static void ten()
	{
		System.out.println("�10");
		
		Scanner in = new Scanner(System.in);
		System.out.println ("������� 3 ����� ����� �����: ");
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
		System.out.println("�11");
		
		System.out.println("��������� ����� ����������� ���� �� ����� ������� q � ������ Enter:");
		
		while((char)System.in.read()!='q')
		{
			
		}			
		System.out.println("����� q, ����� �� ���������.");	
			
		System.out.println(" ");
	}
	
	
	public static void twelve() throws java.io.IOException
	{
		System.out.println("�12");
		
		BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

		String str = " ";
		
		System.out.println("��������� ����� ����������� ���� �� ����� ������� ����� stop � ������ Enter:");		
		while (!str.equals("stop"))
		{
			str = br.readLine();
		}			
		System.out.println("����� stop, ����� �� ���������.");
		System.out.println(" ");
	}
}
