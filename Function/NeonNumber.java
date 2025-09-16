/*
Write a function to check whether the given number is a neon number (sum of digits of square = number).
*/
import java.util.Scanner;
public class NeonNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		// take input from user using scanner class
		System.out.printf("Enter the number: ");
		int num = xyz.nextInt();
		// check condition
		if(isNeon(num))
		{
			System.out.printf("The number is Neon");
		}
		else
		{
			System.out.printf("The number is not Neon");
		}
		
	}
	
	public static boolean isNeon(int n)
	{
		int square = n*n;
		int sum = 0;
		while(square != 0)
		{
			int rem = square % 10; // separate out last digit
			sum += rem; // add that digit in sum
			square /= 10; // remove that last digit
		}
		//check number is neon or not
		if(sum == n)
		{
			return true; // if yes
		}
		else
		{
			return false; // if not
		}
	}
}