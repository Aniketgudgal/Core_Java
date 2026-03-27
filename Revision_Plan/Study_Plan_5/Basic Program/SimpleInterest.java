/*
Write a Java program to calculate simple interest.
Input:
Principal = 1000
Rate = 5
Time = 2

Output:
Simple Interest = 100

Explanation:
Simple Interest formula:
SI = (Principal × Rate × Time) / 100
Applying the formula gives 100.
*/
import java.util.Scanner;
public class SimpleInterest
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal amount: ");
		int p = sc.nextInt();
		System.out.print("The the Rate of Interest: ");
		int r = sc.nextInt();
		System.out.print("Enter the Time Peroid: ");
		int t = sc.nextInt();
		float si = (p*r*t)/100;
		System.out.println("The simple interest is: "+si);
		
	}
}