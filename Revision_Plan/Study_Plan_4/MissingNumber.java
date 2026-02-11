/*
 Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/
import java.util.Scanner;
public class MissingNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the value in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] - arr[i-1] != 1)
			{
				for(int j = arr[i-1]+1; j < arr[i]; j++)
				{
					System.out.print(" "+j);
				}
				System.out.println();
			}
		}
	}
}