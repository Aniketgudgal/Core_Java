/*
calculate the sum of array using Recursion
*/
import java.util.Scanner;
public class SumOfArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < nums.length; i++)
		{	
			nums[i] = sc.nextInt();
		}
		
		int sum = sumArray(nums, nums.length - 1, 0);
		System.out.println("The sum of array is: "+sum);
	}
	static int sumArray(int nums[], int len, int sum)
	{
		if(len < 0)
		{
			return sum;
		}
		else
		{
			//sum += nums[len];
			return sumArray(nums,len-1,(sum += nums[len]));
		}
	}
}