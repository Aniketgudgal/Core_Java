/*
Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/
import java.util.Scanner;
public class MissingNumberInArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		int n = nums.length + 1;
		int total = n*(n+1)/2;
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
		}
		System.out.println("The missing number is: "+(total - sum));
	}
}