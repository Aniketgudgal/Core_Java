/*
5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
formula: S.I. = (P × R × T)/100 
*/
import java.util.Scanner;
public class SimpleInterestApp
{
	public static void main(String x[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.printf("Enter the value: ");
			int p = sc.nextInt();
			System.out.printf("Enter the rate: ");
			int r = sc.nextInt();
			System.out.printf("Enter the duration: ");
			int t = sc.nextInt();
			SimpleInterest p1 = new SimpleInterest();
			int result = p1.simpleInterest(p,r,t);
			System.out.printf("The interest is: %d",result);
	}
}
class SimpleInterest 
{
	int simpleInterest(int p, int r, int t)
	{
		int interest = (p*r*t)/100;
		int result =  p + interest;
		return result;
	}
}