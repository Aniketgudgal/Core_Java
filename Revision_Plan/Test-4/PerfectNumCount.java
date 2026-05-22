/*
Write a Java program to count Perfect numbers in an array.
A Perfect number is equal to sum of its proper divisors.
Example: 6 = 1 + 2 + 3
Input :- arr = [6, 28, 10, 12, 496]
Output :- Count of Perfect numbers = 3
*/
import java.util.Scanner;
public class PerfectNumCount
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(isPerfect(arr[i]))
			{
				count++;
			}
		}
		System.out.println("Count of Perfect Number is: "+count);
	}
	public static boolean isPerfect(int n)
	{
		int sum = 0;
		for(int i = 1; i < n;i++)
		{
			if(n % i == 0)
			{
				sum += i;
			}
		}
		return sum == n ? true: false;
	}
}