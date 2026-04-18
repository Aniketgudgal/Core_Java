/*
Q1. Write a Java program that accepts a string from the user. Create two threads:
• Thread 1 prints characters at even index positions.
• Thread 2 prints characters at odd index positions.
Threads should print characters alternately in correct sequence.
Description
If input string is MULTI, then:
• Thread 1 prints M, L, I
• Thread 2 prints U, T
Final output should follow original sequence using thread coordination.
*/
import java.util.Scanner;
class EvenNum extends Thread
{
	String ip;
	String name;
	EvenNum(String ip, String name)
	{
		this.ip = ip;
		this.name = name;
	}
	public synchronized void run()
	{
		try
		{
			for(int i = 0; i < ip.length(); i++)
			{
				if(i % 2 == 0)
				{
					System.out.println("Thread "+name+" "+ip.charAt(i));
				}
			}
		}catch(Exception e)
		{
			System.out.println("Even Exception: "+e);
		}
	}
}
class OddNum extends Thread
{
	String ip;
	String name;
	OddNum(String ip, String name)
	{
		this.ip = ip;
		this.name = name;
	}
	public synchronized void run()
	{
		try
		{
			for(int i = 0; i < ip.length(); i++)
			{
				if(i % 2 != 0)
				{
					System.out.println("Thread "+name+" "+ip.charAt(i));
				}
			}
		}catch(Exception e)
		{
			System.out.println("Odd Exception: "+e);
		}
	}
}
public class CharThreadApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String n = sc.next();
		Thread t1 = new EvenNum(n, "1");
		Thread t2 = new OddNum(n,"2");
		t1.start();
		t2.start();
	}
}