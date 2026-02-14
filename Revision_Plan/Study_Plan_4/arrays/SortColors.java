/*
Sort Colors (Dutch National Flag)
Given an array containing 0, 1, and 2, sort them in-place.
Example
Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*/
import java.util.Scanner;
public class SortColors
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
		/*
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		*/
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while(mid <= high)
		{
			if(arr[mid] == 0)
			{
				arr[mid] = arr[mid] + arr[low];
				arr[low] = arr[mid] - arr[low];
				arr[mid] = arr[mid] - arr[low];
				low++;
				mid++;
			}
			else if(arr[mid] == 1)
			{
				mid++;
			}
			else
			{
				arr[mid] = arr[mid] + arr[high];
				arr[high] = arr[mid] - arr[high];
				arr[mid] = arr[mid] - arr[high];
				high--;
			}
		}
		// display array
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}