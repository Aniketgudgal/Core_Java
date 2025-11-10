/*
10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.


ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.
*/
class Employee
{
	int id;
	String name;
	int salary;
	void calculateBonus()
	{
	}
}
class PermanentEmployee extends Employee
{
	PermanentEmployee(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	int bonus = 25;
	float bonusAmount;
	void calculateBonus()
	{
		bonusAmount = (bonus*salary)/100;
	}
	
	void displayBonus()
	{
		System.out.println("The Bonus of permanent employee is: "+bonusAmount);
	}
}
class ContractEmployee extends Employee
{
	ContractEmployee(int id, String name, int salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	int bonus = 10;
	float bonusAmount;
	void calculateBonus()
	{
		bonusAmount = (bonus*salary)/100;
	}
	
	void displayBonus()
	{
		System.out.println("The Bonus of cotract employee is: "+bonusAmount);
	}
}
public class BonusApp
{
	public static void main(String x[])
	{
		PermanentEmployee p1 = new PermanentEmployee(1,"xyz",4000);
		p1.calculateBonus();
		p1.displayBonus();
		
		ContractEmployee c1 = new ContractEmployee(1,"pqr",2000);
		c1.calculateBonus();
		c1.displayBonus();
	}
}