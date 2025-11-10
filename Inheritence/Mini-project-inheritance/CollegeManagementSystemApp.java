/*
Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.

Class Structure:
Parent Class – Person

Data Members:
 int id, String name, String address, int contactNo
 
Member Methods:
1. addDetails() – Accept and store basic person details.
2. displayDetails() – Display details of a person.
3. updateAddress() – Update the address of a person.
4. updateContact() – Update contact number.
5. showBasicInfo() – Display ID, name, and contact number.

Child Class 1 – Student extends Person
Additional Data Members:
String courseName, int marks[3], double percentage
Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.
	
Child Class 2 – Faculty extends Person

Additional Data Members:
String subject, double salary, int experience

Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.
  
Operations to Perform (Sequentially):
1. Add student details using addDetails() method.
2. Enter marks for three subjects using enterMarks().
3. Calculate and store the student’s percentage using calculatePercentage().
4. Update the student’s contact number using updateContact().
5. Display all details of the student using displayDetails().
6. Add faculty details using addDetails() method.
7. Assign subject to faculty using assignSubject().
8. Calculate salary increment for the faculty using calculateIncrement().
9. Update the faculty’s address using updateAddress().
10. Display complete faculty information using displayFacultyInfo().

Instructions:
a. Use constructors in all classes for initialization.
b. Use the super keyword to call parent constructors in child classes.
c. Apply method overriding for displayDetails() to show specific outputs for each child class.
d. Perform all 10 operations sequentially in the main() method.
e. Do not use collections; use arrays or primitive variables only.

*/
import java.util.Scanner;
class Person
{
	int id;
	String name;
	String address;
	int contactNo;
	
	void addDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id: ");
		int ID = sc.nextInt();
		System.out.print("Enter the name: ");
		String NAME = sc.next();
		System.out.print("Enter the Address: ");
		String ADDRESS = sc.next();
		System.out.print("Enter the Contact number: ");
		int CONTACTNO = sc.nextInt();
		
		id = ID;
		name = NAME;
		address = ADDRESS;
		contactNo = CONTACTNO;
	}
	void displayDetails()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("address: "+address);
		System.out.println("Contact: "+contactNo);
	}
	void updateAddress()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the New Address: ");
		address = sc.next();
	}
	void updateContact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new ContactNo: ");
		contactNo = sc.nextInt();
	}
	void showBasicInfo()
	{
		System.out.println("The id: "+id);
		System.out.println("The name is: "+name);
		System.out.println("The Address is: "+address);
		System.out.println("The Contact Number: "+contactNo);
	}
}
class Student extends Person
{
	String courseName;
	int marks[] = new int[3] ;
	
	double percentage;
	Scanner sc = new Scanner(System.in);
	void enterMarks()
	{
		System.out.println("Enter the Marks of Subject: ");
		for(int i = 0; i < marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}
	}
	
	void calculatePercentage()
	{
		float sum = 0;
		float total = 0;
		for(int i = 0; i < marks.length; i++)
		{
			sum+= marks[i];
			total += 100;
		}
		percentage = (sum / total)*100;
		System.out.println("The Percentage is: "+percentage);
	}
}
class Faculty extends Person
{
	String subject;
	double salary;
	int experience;
	
	void assignSubject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Subject name: ");
		subject = sc.next();
	}
	
	void calculateIncrement()
	{
		if(experience > 5)
		{
			double increment = (10*salary)/100;
			System.out.println("Salary incremented by: "+increment);
			salary += increment;
		}
	}
	void displayFacultyInfo()
	{
		System.out.println("Details of faculty");
		System.out.println("The Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Addres: "+address);
		System.out.println("Contact Number: "+contactNo);
		System.out.println("Subject: "+subject);
		System.out.println("Salary: "+salary);
		System.out.println("Experience: "+experience);
	}
}
public class CollegeManagementSystemApp
{
	public static void main(String x[])
	{
		System.out.println("Student object is created");
		Student s1 = new Student();
		s1.addDetails();
		s1.enterMarks();
		s1.calculatePercentage();
		s1.updateContact();
		s1.displayDetails();
		
		System.out.println("Faculty Object is Created");
		Faculty f1 = new Faculty();
		f1.addDetails();
		f1.assignSubject();
		f1.calculateIncrement();
		System.out.println("Incremented Salary is: "+f1.salary);
		f1.updateAddress();
		f1.displayFacultyInfo();
	}
}