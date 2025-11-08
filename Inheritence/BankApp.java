/*
2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
*/
import java.util.Scanner;
class BankAccount
{
	int time;
	double pAmount;
	
}
class SavingsAccount extends BankAccount
{
	void calculateInterest()
	{
		int rate = 5;
		System.out.println("Interest according to saving accout is: "+((pAmount*time*rate)/100));
	}
}
class CurrentAccount extends BankAccount
{
	void calculateInterest()
	{
		int rate = 3;
		System.out.println("Interest according to CurrentAccount accout is: "+((pAmount*time*rate)/100));
	}
}
public class BankApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Caculation Interest App");
		String exit = " ";
		System.out.println("Enter the Principal Amount: ");
		int amount = sc.nextInt();
		System.out.println("Enter the Time: ");
		int time = sc.nextInt();
		do
		{
			System.out.println("1. For Saving Bank Account /t 2. Current Bank Account /t 3. Do you want to change the amount /t 4.Exit");
			int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				SavingsAccount s = new SavingsAccount();
				s.pAmount = amount;
				s.time = time;
				s.calculateInterest();
				break;
			case 2: 
				CurrentAccount c = new CurrentAccount();
				c.pAmount = amount;
				c.time = time;
				c.calculateInterest();
				break;
			case 3:
				System.out.print("Enter the new principal amount: ");
				amount = sc.nextInt();
				System.out.print("Enter the time or period: ");
				time = sc.nextInt();
				break;
			case 4:
				System.out.println("Do you want to exit: (yes or not)");
				exit = sc.next();
				break;
			default:
			System.out.println("Enter the valid input");
		}
		}while(!exit.equals("yes"));
	}
}