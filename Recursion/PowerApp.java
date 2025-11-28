/*
Write a program to calculate the power of a number (x^n) using recursion.
*/
import java.util.Scanner;
public class PowerApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// take the input base value from user
		System.out.print("Enter the base value: ");
		int base = sc.nextInt();
		// take the power value from user
		System.out.print("Enter the power: ");
		int power = sc.nextInt();
		// calling recursive function
		int result = powerCal(base,power, 1);
		// print the result
		System.out.println("The power is: "+result);
	}
	static int powerCal(int base, int power, int sum)
	{
		if(power < 1)
		{
			return sum;
		}
		else
		{
			return powerCal(base, power - 1, sum*base);
		}
	}
}