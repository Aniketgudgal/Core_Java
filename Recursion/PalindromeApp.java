/*
Write a program to check whether a given array is a palindrome using recursion.
*/
import java.util.Scanner;
public class PalindromeApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// take the array size from user
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		// create the array with given size
		int nums[] = new int[size];
		// insert values in array using loop
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		// call recursive function
		boolean result = palindromeCheck(nums, 0, nums.length - 1, true);
		// check the final output and print the result
		if(result)
		{
			System.out.println("The given array is palindrome");
		}
		else
		{
			System.out.println("The array is not palindrome");
		}
	}
	static boolean palindromeCheck(int[] nums, int start, int end, boolean result)
	{
		if(start > end) // base condition
		{
			return result;
		}
		else
		{
			if(nums[start] != nums[end]) // check the array 
			{
				result = false; // the final result if array is not palindrome
				return result; // break the recursion
			}
			return palindromeCheck(nums, start + 1, end - 1, result); // is not start check other values
		}
	}
}