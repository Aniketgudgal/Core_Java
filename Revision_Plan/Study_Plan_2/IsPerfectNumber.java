/*
Write program to input number and check number is perfect or not?
*/
import java.util.Scanner;
public class IsPerfectNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i < n)
		{
			if(n % i == 0)
			{
				sum += i;
			}
			i++;
		}
		if(sum == n)
		{
			System.out.println("The number is perfect");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}
}