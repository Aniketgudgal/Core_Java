/*
5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
Explanation:
 This introduces basic mathematical operations and accessing object fields.
*/
import java.util.Scanner;
class Company
{
	private String companyName;
	private float revenue;
	private float expenses;
	
	void setCompanyName(String name)
	{
		companyName = name;
	}
	String getCompanyName()
	{
		return companyName;
	}
	void setRevenue(float r)
	{
		revenue = r;
	}
	float getRevenue()
	{
		return revenue;
	}
	void setExpenses(float e)
	{
		expenses = e;
	}
	float getExpenses()
	{
		return expenses;
	}
}
class ExpensiveCalc
{
	Company[] c;
	Scanner sc = new Scanner(System.in);
	void setData(Company c[])
	{
		this.c= c;
	}
	void setCompanyInfo()
	{
		for(int i = 0; i < c.length; i++)
		{
			c[i] = new Company();
			System.out.printf("Enter the name of company: ");
			String name = sc.next();
			System.out.printf("Enter the company Revenue: ");
			float revenue = sc.nextFloat();
			System.out.printf("Enter the total expenses: ");
			float expenses = sc.nextFloat();
			c[i].setCompanyName(name);
			c[i].setExpenses(expenses);
			c[i].setRevenue(revenue);
		}
	}
	void calculateExpensive()
	{
		for(int i = 0; i < c.length; i++)
		{
			float profit = c[i].getRevenue() - c[i].getExpenses();
			System.out.println("revenue: "+c[i].getRevenue());
			System.out.println("expenses: "+c[i].getExpenses());
			System.out.println("The profit of "+c[i].getCompanyName()+" is: "+profit);
			float profitMargin = (profit/c[i].getRevenue())*100;
			System.out.printf("\nProfit margin is: %f\n",profitMargin);
		}
	}
}
public class CompanyProfitMarginApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the total companys: ");
		int size = sc.nextInt();
		Company[] Obj = new Company[size];
		
		ExpensiveCalc e = new ExpensiveCalc();
		e.setData(Obj);
		e.setCompanyInfo();
		e.calculateExpensive();
	}
}