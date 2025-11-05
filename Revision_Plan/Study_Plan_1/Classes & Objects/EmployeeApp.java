/*
Q5. Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object
*/
import java.util.Scanner;
// POJO class of Employee
class Employee
{
	private String name;
	private int id;
	private int salary;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.print("Enter the id of Employee: ");
		int id = sc.nextInt();
		System.out.print("Enter the name of Employee: ");
		String name = sc.next();
		System.out.print("Enter the salary of Employee: ");
		int salary = sc.nextInt();
		
		//store data in object
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		
		//print or display the object data
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}