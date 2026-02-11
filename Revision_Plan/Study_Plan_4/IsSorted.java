/*
Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
import java.util.Scanner;
public class IsSorted
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
		boolean flag = true;
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i-1] > arr[i])
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("not a sorted array");
		}
	}
}