/*
Write a program to find the greatest common divisor (GCD) of two numbers using recursion.
*/
import java.util.Scanner;
public class GCDNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		int maxNumber = findGCD(1,num1,num2,0);
		System.out.println("The GCD number is: "+maxNumber);
	}
	static int findGCD(int i,int num1, int num2, int max)
	{
		if(i > num2 && i > num1)
		{
			return max;
		}
		else
		{
			if((num2 % i == 0) && (num1 % i == 0))
			{
				if(i > max)
				{
					max = i;
				}
			}
			return findGCD(i + 1,num1,num2,max);
		}
	}
}