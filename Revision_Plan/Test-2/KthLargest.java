/*
Q3. Write a Java program to find the kth largest element in an array without sorting.
Input:
Enter size: 6
Enter elements: 10 45 23 67 34 67
Enter k value: 2
Output: Second largest element is 45
*/
import java.util.Scanner;
public class KthLargest
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the Values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the kth element: ");
		int target = sc.nextInt();
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		if(target == 1)
		{
			System.out.println("The max value is: "+max);
			System.exit(0);
		}
		int secondMax = Integer.MIN_VALUE;
		for(int i= 1; i<target; i++)
		{
			secondMax = Integer.MIN_VALUE;
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[j] > secondMax && arr[j] < max)
				{
					secondMax = arr[j];
				}
			}
			max = secondMax;
			if(i == target - 1)
			{
				if(target >= arr.length)
				{
						System.out.print("Enter the value input target");
				}
				else
				{
					System.out.println("Max value is: "+secondMax);
				}
			}
		}
		
	}
}