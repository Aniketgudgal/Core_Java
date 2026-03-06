/*
Write a program in java to find the ceiling in a sorted array?
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
 Expected Output :
 The given array is : 1 3 4 7 8 9 9 10
 The ceiling of 5 is: 7
*/
import java.util.Scanner;
public class CeilingElementInArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.print("Enter the ceiling Value: ");
		int val = sc.nextInt();
		boolean flag = true;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] >= val)
			{
				flag = false;
				System.out.println("The ceiling of "+val+" is: "+nums[i]);
				break;
			}
		}
		if(flag)
		{
			System.out.print("The ceiling of "+val+" is: "+(-1));
		}
	}
}
