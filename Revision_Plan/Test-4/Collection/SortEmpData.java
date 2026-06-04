/*
Sort Employee Names Alphabetically
Description: Sort a list of employee names in ascending order.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Employee implements Comparable
{
	private String name;
	private int id;
	private int salary;
	public Employee(String name, int id, int salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public Employee()
	{
	}
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
	public int compareTo(Object o)
	{
		Employee e = (Employee)o;
		return this.name.compareTo(e.getName());
	}
	public String toString()
	{
		return "["+name+", "+id+", "+salary+"]";
	}
}
public class SortEmpData
{
	public static void main(String x[])
	{
		Employee e1 = new Employee("Shivam",1,1400);
		Employee e2 = new Employee("Gokul",2,5000);
		Employee e3 = new Employee("Aniket",3,6000);
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println("Before Sorting");
		for(Employee e:  al)
		{
			System.out.println(e);
		}
		Collections.sort(al);
		System.out.println("After sorting");
		for(Employee e: al)
		{
			System.out.println(e);
		}
	}
}