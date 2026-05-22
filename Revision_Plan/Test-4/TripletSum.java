/*
Write a Java program to find all unique triplets whose sum is equal to zero.
Explanation
1. Sort array.
2. Fix one element.
3. Use two pointers.
4. Avoid duplicate triplets.
Input : [-1,0,1,2,-1,-4]
Output : -1 -1 2 , -1 0 1
*/
import java.util.Scanner;
public class TripletSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		// sort array
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length - 2; i++)
		{
			for(int j = i+1; j < arr.length - 1; j++)
			{
				for(int k = j+1; k < arr.length; k++)
				{
					if(arr[i] + arr[j] + arr[k] == 0)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
	public static boolean isPresent(int[] arr, int k)
	{
		for(int i = 0; i < k - 2 && i < arr.length-2;i++)
		{
			for(int j = i+1; j < k - 1 && j < arr.length - 1; j++)
			{
				for(int m = j+1; m < k && m < arr.length; m++)
				{
					if(arr[m] + arr[j]+arr[i] == 0)
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}