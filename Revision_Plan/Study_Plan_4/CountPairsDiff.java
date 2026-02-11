/*
Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/
import java.util.Scanner;
public class CountPairsDiff
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
		System.out.print("Enter the value of k: ");
		int k = sc.nextInt();
		for(int i= 0; i < arr.length - 1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] - arr[j] == k)
				{
					System.out.println("("+arr[i]+", "+arr[j]+")");
				}
				else if(arr[j] - arr[i] == k)
				{
					System.out.println("("+arr[i]+", "+arr[j]+")");
				}
			}
		}
	}
}