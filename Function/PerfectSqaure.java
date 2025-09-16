/*
 * write a program to check the given number is perfect square or not
 */
import java.util.Scanner;
public class PerfectSqaure
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: \n");
		int n = sc.nextInt();
		int check = (int)Math.sqrt(n);
		int check2 = check*check;
		if(check2 == n)
		{
			System.out.printf("Perfect sqaure");
		}
		else
		{
			System.out.printf("Not perfect");
		}
	}
}