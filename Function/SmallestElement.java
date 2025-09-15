/*
Find Smallest Element in an Array
Write a function findMin(int arr[]) that returns the smallest element in the array.
Call it from main().
*/
import java.util.Scanner;
public class SmallestElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the size of array\n");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.printf("Enter the value in array\n");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		// pass that array for the function
		int result = smallestElement(nums);
		System.out.printf("The smallest number is: %d",result);
	}
	
	public static int smallestElement(int nums[])
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		return min;
	}
}