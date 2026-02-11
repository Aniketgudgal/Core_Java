/*
 Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4] 
Output: (-1, 0, 1), (-1, -1, 2)
*/
import java.util.Scanner;
public class TripletsZeroSum
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
		int sum = -1;
		int count = 0;
		for(int i = 0; i < arr.length - 2; i++)
		{
			for(int j = i+1; j < arr.length - 1; j++)
			{
				for(int k = j+1; k < arr.length; k++)
				{
					if((arr[i] + arr[j] + arr[k]) == 0 )
					{
						count++;
						System.out.println(arr[i] +" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
		System.out.println("The Total zero's subarray is: "+count);
	}
}