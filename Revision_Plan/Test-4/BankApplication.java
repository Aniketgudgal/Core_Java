/*
Write a Java program to Create deposit and withdrawal threads using synchronization.
Explanation
• One thread deposits money.
• Another withdraws money.
• Synchronization avoids data inconsistency.
• Initial Balance = 1000
Output :- Deposited: 500
 Withdrawn: 1200
 Remaining Balance: 300
*/
class Bank extends Thread
{
	int balance= 1000;
	public  void showBalance()
	{
		System.out.println("balance is: "+balance);
	}
}
class Withdraw extends Bank
{
	public synchronized void run()
	{
		withdraw(1200);
		showBalance();
	}
	public synchronized void withdraw(int amount)
	{
		if(balance > amount)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("In Sufficent balance");
		}
	}
}
class Deposite extends Bank
{
	public synchronized void run()
	{
		deposit(500);
		showBalance();
	}
	public synchronized void deposit(int amount)
	{
		balance += amount;
	}
}
public class BankApplication
{
	public static void main(String x[])
	{
		Deposite d = new Deposite();
		Withdraw w = new Withdraw();
		w.start();
		d.start();
	}
}