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
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = xyz.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = xyz.nextInt();
		}
		boolean flag = true;
		for(int i = 0; i < arr.length - 1; i++)
		{
			int j = i + 1;
			if(arr[i] > arr[j])
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
			System.out.println("Array is unsorted");
		}
	}
}