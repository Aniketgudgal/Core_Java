/*
Q2. You are given details of employees in the format: Employee ID, Name, Department,
and Salary.
Write a Java program using Java 8 Lambda Expression and Stream API to perform the
following tasks:
1. Print all employees whose salary is greater than 50,000.
2. Print the count of employees working in the IT department.
3. Find the employee having the highest salary.
Input Format
• First line contains integer N representing number of employees.
• Next N lines contain:
id name department salary
*/
import java.util.ArrayList;
import java.util.stream.Stream;
class Employee
{
	private int id;
	private String name;
	private String dept;
	private int salary;
	Employee(int id, String name, String dept, int salary)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
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
		return id+" "+name+" "+dept+" "+salary;
	}
}
public class StreamAPIExample
{
	public static void main(String x[])
	{
		Employee e1 = new Employee(1,"amit","IT",60000);
		Employee e2 = new Employee(2,"Ravi", "HR",50000);
		Employee e3 = new Employee(3,"Neha", "IT",80000);
		Employee e4 = new Employee(4,"Pooja", "Sales",40000);
		Employee e5 = new Employee(5, "Raj", "HR",90000);
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		System.out.println("Employee whose salary > 50,000");
		Stream<Employee> st = emp.stream().filter((e) -> e.getSalary() > 50000);
		// used inbuild function for the filtering data
		st.forEach((v) -> System.out.println(v));
		// count method returns the long value of counts
		long total = emp.stream().filter((e) -> e.getDept() == "IT").count();
		System.out.println("Total employee is IT department: "+total);
	}
}