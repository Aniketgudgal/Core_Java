/*
 Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.Scanner;
public class MaxSubSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the value is array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int i = 0;
		int j = 0;
		int maxSum = -1;
		while(j < arr.length)
		{
			sum += arr[j];
			if(sum < 0)
			{
				sum = 0;
			}
			if(sum > maxSum)
			{
				maxSum = sum;
				while(sum < maxSum)
				{
					sum -= arr[i];
					i++;
				}
			}
			j++;
		}
		System.out.println("The max Sum is: "+maxSum);
	}
}