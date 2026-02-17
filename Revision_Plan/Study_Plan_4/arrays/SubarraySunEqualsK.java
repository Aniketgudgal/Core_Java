/*
Subarray Sum Equals K
Return the total number of subarrays whose sum equals k.
Example
Input: nums=[1,1,1], k=2 → 2
*/
import java.util.Scanner;
public class SubarraySunEqualsK
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
		System.out.print("Enter the value of K: ");
		int k = sc.nextInt();
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				if(sum == k)
				{
					count++;
				}
			}
		}
		System.out.println("The total subarrays with sum equals to k is: "+count);
	}
}