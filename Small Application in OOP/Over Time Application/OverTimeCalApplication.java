/*
Write a Java program to calculate overtime for 5 employees with both daily and weekly rules.
Rules:
• Daily shift = 8 hours
• If any day working > 8 hours → daily overtime
• Weekly limit = 40 hours
• Overtime rate:
o Daily OT → Rs.40/hour
o Weekly OT → Rs.60/hour
• If both daily and weekly OT occur, calculate both separately
Requirements:
1. Employee class:
id, name, int dailyHours[7], basicSalary, dailyOT, weeklyOT
2. OverTime class:
o setEmployee(Employee emp[])
o calculateDailyOvertime()
o calculateWeeklyOvertime()
3. Display complete salary breakup
*/
import java.util.Scanner;
class Employee
{
	private int id;
	private String name;
	private int dailyHours[];
	private int basicSalary;
	private int dailyOT;
	private int weeklyOT;
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setDailyHours(int[] dailyHours)
	{
		this.dailyHours = dailyHours;
	}
	public int[] getDailyHours()
	{
		return dailyHours;
	}
	public void setBasicSalary(int basicSalary)
	{
		this.basicSalary = basicSalary;
	}
	public int getBasicSalary()
	{
		return basicSalary;
	}
	public void setDailyOT(int dailyOT)
	{
		this.dailyOT = dailyOT;
	}
	public int getDailyOT()
	{
		return dailyOT;
	}
	public void setWeeklyOT(int weeklyOT)
	{
		this.weeklyOT = weeklyOT;
	}
	public int getWeeklyOT()
	{
		return weeklyOT;
	}
}
class OverTime 
{
	Employee[] emp;
	public void setEmployee(Employee emp[])
	{
		this.emp = emp;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < emp.length; i++)
		{
			System.out.print("Enter the id of"+i+" Employee: ");
			int id = sc.nextInt();
			System.out.print("Enter the name of Employee: ");
			String name = sc.next();
			System.out.print("Enter Basic salary of Employee: ");
			int salary = sc.nextInt();
			int dailyWork = 8;
			int[] dailyHours = new int[7];
			for(int j = 0; j < dailyHours.length; j++)
			{
				System.out.print("Enter the dailyOT of "+(j+1)+" daily: ");
				int dailyOverTime = sc.nextInt();
				dailyHours[i] = dailyOverTime + dailyWork;
			}
			emp[i] = new Employee();
			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setBasicSalary(salary);
			emp[i].setDailyHours(dailyHours);
		}
	}
	public void calculateDailyOvertime()
	{
		for(int i = 0; i < emp.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < arr.length; j++)
			{
				int count = arr[i];
				int result = count - 8;
				sum += result;
			}
			emp[i].setDailyOT(sum);
		}
	}
	public void displayDailyOvertime()
	{
		for(int i = 0; i < emp.length; i++)
		{
			System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getDailyOT()+"\t"+(emp[i].getDailyOT()*40));
		}
	}
	public void calculateWeeklyOvertime()
	{
		for(int i = 0; i < emp.length; i++)
		{
			int[] arr = emp[i].getDailyHours();
			int sum = 0;
			for(int j = 0; j < arr.length; j++)
			{
				sum += arr[j];
			}
			sum = sum - 40;
			emp[i].setWeeklyOT(sum);
		}
	}
	public void displayWeeklyOvertime()
	{
		for(int i = 0; i < emp.length; i++)
		{
			System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getWeeklyOT()+"\t"+(emp[i].getWeeklyOT()*60));
		}
	}
}
public class OverTimeCalApplication
{
	public static void main(String x[])
	{
		Employee[] emp = new Employee[2];
		OverTime ot = new OverTime();
		ot.setEmployee(emp);
		ot.calculateDailyOvertime();
		ot.calculateWeeklyOvertime();
		ot.displayDailyOvertime();
		ot.displayWeeklyOvertime();
	}
}