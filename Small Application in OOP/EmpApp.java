/*
2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.
*/
import java.util.Scanner;
class Employee
{
	private String empName;
	private String deprt;
	private float sal;
	
	public void setEmpName(String en)
	{
		empName = en;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setDeprt(String dp)
	{
		deprt  = dp;
	}
	public String getDepart()
	{
		return deprt;
	}
	public void setSal(float s)
	{
		sal = s;
	}
	public float getSal()
	{
		return sal;
	}
}
class IncreaseSal
{
	int per = 10;
	public void incrementSal(Employee ...e)
	{
		for(int i = 0; i < e.length; i++)
		{
			float salary = e[i].getSal();
			float incrementSal = salary+(10/100f)*salary;
			e[i].setSal(incrementSal);
		}
	}
}
class InputOutEmpData
{
	Employee[] e;
	Scanner sc = new Scanner(System.in);
	public void setDataEmp(Employee[] e1)
	{
		e = e1;
		for(int i = 0; i < e.length; i++)
		{
			System.out.println();
			e[i] = new Employee();	
			System.out.print("Enter the name of Employee: ");
			String name = sc.next();
			System.out.print("Enter the department of Employee: ");
			String dep = sc.next();
			System.out.print("Enter the salary of Employee: ");
			int sal = sc.nextInt();
			System.out.println();			
			e[i].setEmpName(name);
			e[i].setDeprt(dep);			
			e[i].setSal(sal);
		}
	}
	
	public void showData()
	{
		System.out.println("Name of Employee"+"\t"+"Department"+"\t"+"salary");
		for(int i = 0; i < e.length; i++)
		{
			
			System.out.println(e[i].getEmpName()+ "\t\t\t"+e[i].getDepart()+"\t\t"+e[i].getSal());
			System.out.println();
		}
	}
}
public class EmpApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		Employee[] emp = new Employee[2];
		InputOutEmpData ip = new InputOutEmpData();
		ip.setDataEmp(emp);
		ip.showData();
	}
}