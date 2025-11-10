/*
8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.


CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
*/
class Loan
{
	double amount;
	int years;
}
class HomeLoan extends Loan
{
	HomeLoan(double amount, int years)
	{
		this.amount = amount;
		this.years = years;
	}
	float rate = 7;
	double emi;
	void calculateEMI()
	{
		double r = rate/(12.0*100.0);
		int n = years*12;
		double R2 = Math.pow((1+r),(float)n);
		emi = ((amount*rate)*R2)/(R2-1);
	}
	void displayEMI()
	{
		System.out.println("The EMI per month is: "+(float)emi);
	}
}
class CarLoan extends Loan
{
	CarLoan(double amount, int years)
	{
		this.amount = amount;
		this.years = years;
	}
	float rate = 9;
	double emi;
	void calculateEMI()
	{
		double r = rate/(12.0*100.0);
		int n = years*12;
		double R2 = Math.pow((1+r),n);
		emi = ((amount*rate)*R2)/(R2-1.0);
	}
	void displayEMI()
	{
		System.out.println("The EMI per month is: "+(float)emi);
	}
}
public class EMICalculator
{
	public static void main(String x[])
	{
		HomeLoan h1 = new HomeLoan(500000, 10);
		h1.calculateEMI();
		h1.displayEMI();
		
		CarLoan c1 = new CarLoan(500000, 5);
		c1.calculateEMI();
		c1.displayEMI();
	}
}