/*
13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/
import java.util.Scanner;
class Power
{
	//using recursion
	int powerCalculator(int b,int p)
	{
		if(p==0){
			return 1;
		}
		return b*powerCalculator(b,p-1);
	}
	/*
	//using loop
	int powerCalculator(int b,int p)
	{
		int fact = 0;
		while(p > 1)
		{
			fact += b*b;
			p--;
		}
		return fact;
	}
	*/
}

public class PowerCalculatorApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the power: ");
		int pow = sc.nextInt();
		System.out.printf("Enter the base: ");
		int base = sc.nextInt();
		Power p = new Power();
		int result = p.powerCalculator(base,pow);
		System.out.printf("The power of number is: %d",result);
	}
}
