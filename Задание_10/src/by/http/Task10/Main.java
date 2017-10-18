package by.http.Task10;

public class Main {

	public static void main(String[] args) 
	{
		int []mas=new int[] {-15, -10, -3, 9, -8, 7 };
		
		
		System.out.print("Дан массив: ");
		for(int i=0; i<mas.length; i++)
		{
			System.out.print(mas[i]+" ");
		}
		
		System.out.println();
		for(int i=0; i<mas.length; i++)
		{
			if(mas[i]>0); //Бред какой то почему сюда заходит?????
			{
				System.out.println("Первый положительный элемент массива: "+mas[i]+" расположен "+(i+1)+" по счету.");				
				break;
			}
		}

	}

}
