/*
Palindrome Check (Number or String)
Write a function isPalindrome(int n) that checks whether a number is palindrome or not.
Example: Input 121 → true.
*/
import java.util.Scanner;
public class IsPalindrome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		// take input size of array from user
		System.out.printf("Enter the size of array\n");
		int size = xyz.nextInt();
		int arr[] = new int[size];
		// insert the values in array
		System.out.printf("Enter the value in array\n");
		for(int i = 0; i < arr.length; i++)
		{	
			arr[i] = xyz.nextInt();
		}
		boolean result = isPalindrome(arr); // calling the function
		System.out.printf("The Array is palindrome or not: %b",result);
	}
	// function definition or logic
	public static boolean isPalindrome(int nums[])
	{
		// two pointer approach for this example
		int i = 0;
		int j = nums.length -1;
		boolean flag = true;
		while(i < j)
		{
			if(nums[i] != nums[j])
			{
				flag = false;
				break;
			}
			i++; // starting pointer
			j--; // ending pointer
		}
		// return the value from function
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}