/*
Q2. Write a Java program to store employee names with department and count
employees department wise.
Input:
Amit-IT
Ravi-HR
Neha-IT
Pooja-Sales
Raj-HR
 Output:
IT = 2
HR = 2
Sales = 1
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
class Employee
{
	private int id;
	private String name;
	private String dept;
	Employee(int id, String name, String dept)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
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
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public String getDept()
	{
		return dept;
	}
	public String toString()
	{
		return id+" "+name+" "+dept;
	}
}
class Count
{
	ArrayList<Employee> c;
	Count(ArrayList c)
	{
		this.c = c;
	}
	public void countDept()
	{
		HashMap<String, Integer> hm = new HashMap<>();
		for(Employee e : c)
		{
			String dept = e.getDept();
			if(!hm.containsKey(dept))
			{
				hm.put(dept, 1);
				continue;
			}
			Integer count = hm.get(dept);
			hm.put(dept, (count+1));
		}
		for(Map.Entry<String, Integer> al: hm.entrySet())
		{
			System.out.println(al.getKey()+ " "+al.getValue());
		}
	}
}
public class MainApplication
{
	public static void main(String x[])
	{
		Employee e1 = new Employee(1,"amit","IT");
		Employee e2 = new Employee(2,"Ravi", "HR");
		Employee e3 = new Employee(3,"Neha", "IT");
		Employee e4 = new Employee(4,"Pooja", "Sales");
		Employee e5 = new Employee(5, "Raj", "HR");
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		Count c = new Count(emp);
		c.countDept();
	}
}