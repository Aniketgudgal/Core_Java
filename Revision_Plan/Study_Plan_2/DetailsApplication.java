/*
Q4. Write program to Create class name as PersonalInfo with parameterized constructor
PersonalInfo(String name, String middlename, String lastname) and you have to create class name as ProfessionalInfo with parameterized constructor like as ProfessionalInfo(int id,String des,int salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and pass parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have to define void show() method in ProfessionalInfo and you have to show the all data in show() method.
*/
import java.util.Scanner;
class PersonalInfo
{
	String name,middlename,lastname;
	PersonalInfo(String name, String middlename, String lastname)
	{
		this.name = name;
		this.middlename = middlename;
		this.lastname = lastname;
	}
}
class ProfessionalInfo extends PersonalInfo
{
	int id, salary;
	String des, skillset;
	ProfessionalInfo(String name, String middlename, String lastname,int id, String des, int salary, String skillset)
	{
		super(name,middlename,lastname);
		this.id = id;
		this.des = des;
		this.salary = salary;
		this.skillset = skillset;
	}
	void show()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Middle Name: "+middlename);
		System.out.println("Last Name: "+lastname);
		System.out.println("Des: "+des);
		System.out.println("Salary: "+salary);
		System.out.println("Skill set: "+skillset);
	}
}
public class DetailsApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		String name = sc.next();
		System.out.print("Enter the middle name: ");
		String middlename = sc.next();
		System.out.print("Enter the last name: ");
		String lastname = sc.next();
		System.out.print("Enter the id: ");
		int id = sc.nextInt();
		System.out.print("Enter the des: ");
		String des = sc.next();
		System.out.print("Enter the salary: ");
		int salary = sc.nextInt();
		System.out.print("Enter the skill set: ");
		String skillset = sc.next();
		
		ProfessionalInfo p = new ProfessionalInfo(name,middlename,lastname,id,des,salary,skillset);
		p.show();
	}
}