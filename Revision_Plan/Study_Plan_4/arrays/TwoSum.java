/*
1)	Two Sum
Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
You may assume each input has exactly one solution, and you may not use the same element twice.
Example
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/
import java.util.Scanner;
public class TwoSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the value of Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the target value: ");
		int k = sc.nextInt();
		printTwoSum(arr, k);
	}
	public static void printTwoSum(int[] arr, int k)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			boolean flag = false;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == k)
				{
					System.out.println("The index is: "+i+" "+j);
					flag = true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
	}
}