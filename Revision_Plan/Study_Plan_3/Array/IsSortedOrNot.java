/*
Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
import java.util.Scanner;
public class IsSortedOrNot
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr= new int[size];
		System.out.print("Ente the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		boolean flag = true;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] > arr[i+1])
			{
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "Array is Sorted": "Not sorted");
	}
}