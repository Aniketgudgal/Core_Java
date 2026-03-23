/*
Q5. Write a java program to implement binary search from array.
Input:
Array: 10 20 30 40 50 60
Search: 40
Output: Element found at index 3
*/
import java.util.Scanner;
public class BinarySearch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.print("Enter the target search value: ");
		int target = sc.nextInt();
		int result = binarySearch(num,target);
		if(result != -1)
		{
			System.out.println("The target value found: "+result);
		}
		else
		{
			System.out.println("Target is not found");
		}
	}
	public static int binarySearch(int[] arr, int target)
	{
		int s = 0;
		int e = arr.length - 1;
		while(s <= e)
		{
			int mid = (s+e)/2;
			if(arr[mid] == target)
			{
				return mid;
			}
			if(arr[mid] < target)
			{
				s = mid+1;
			}
			else
			{
				e = mid-1;
			}
		}
		return -1;
	}
}