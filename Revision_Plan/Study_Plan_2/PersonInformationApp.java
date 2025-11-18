/*
Q.7Create a class Person with method setDetails(String name, int age).
Create two subclasses:

Student → method getDetails() → prints student's name & age

Teacher → method getDetails() → prints teacher's name & age
Demonstrate runtime polymorphism using Person reference.
*/
import java.util.Scanner;
class Person
{
	String name;
	int age;
	void setDetails(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	void getDetails()
	{
		System.out.println("Details of Person");
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}
}
class Student extends Person
{
	void getDetails()
	{
		System.out.println("The Details of Student");
		System.out.println("The name is: "+name);
		System.out.println("The age is: "+age);
	}
}
class Teacher extends Person
{
	void getDetails()
	{
		System.out.println("The Details of teacher");
		System.out.println("The name is: "+name);
		System.out.println("The age is: "+age);
	}
}
public class PersonInformationApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of student: ");
		String name = sc.next();
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		
		Student s = new Student();
		s.setDetails(name,age);
	
		System.out.print("Enter the name of Teacher: ");
		name = sc.next();
		System.out.print("Enter the age: ");
		age = sc.nextInt();
		
		Teacher t = new Teacher();
		t.setDetails(name,age);
		
		s.getDetails();
		t.getDetails();
	}
}