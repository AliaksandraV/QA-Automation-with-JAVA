package by.http.lesson4_practice;

public class Student 
{
	String name;
	String surname;
	String patronymic;
	int age;
	int weight;
	int growth;
	
	public Student(String nameofStudent)
	{
		name = nameofStudent;
		
	}
	
	public Student(String surnameofStudent, String patronymicofStudent)
	{
		surname = surnameofStudent;
		patronymic = patronymicofStudent;
		
	}
	
	public Student (int ageofStudent)
	{
		age = ageofStudent;
	}
	
	public Student (int weightofStudent, int growthofStudent)
	{
		weight = weightofStudent;
		growth = growthofStudent;
	}
}
