/*
Sort Integers in Ascending Order
Description: Arrange integers from smallest to largest.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// POJO class
class Employee
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
	public String toString()
	{
		return "["+name+", "+id+", "+salary+"]";
	}
}
class SortById implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		if(e1.getId() > e2.getId())
		{
			return 1;
		}
		else if(e1.getId() < e2.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class SortIntegerData
{
	public static void main(String x[])
	{
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Aniket",3,5000));
		al.add(new Employee("Tahir",1,7000));
		al.add(new Employee("Gokul",2,4000));
		al.add(new Employee("Omkar",4,8000));
		System.out.println("Before Sorting");
		for(Employee e: al)
		{
			System.out.println(e);
		}
		//Comparator c = new SortById();
		Collections.sort(al, new SortById());
		System.out.println("After sorting");
		for(Employee e: al)
		{
			System.out.println(e);
		}
	}
}