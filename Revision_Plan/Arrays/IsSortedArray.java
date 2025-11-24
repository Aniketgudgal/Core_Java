/*
4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
import java.util.Scanner;
public class IsSortedArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		// enter the values in array
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		// logic to check the array is sorted or not
		int j = 0; // using the two pointer to check the array is sorted or not
		boolean flag = true;
		for(int i = 0; i < num.length - 1; i++)
		{
			 j = i+1;
			 if(num[i] > num[j])
			 {
				flag = false;  // change the flag variable values
				break; // if the array is not sorted then break the loop
			 }
		}
		// display the output
		if(flag)
		{
			System.out.println("The Array is Sorted");
		}
		else
		{
			System.out.println("The Array is not Sorted");
		}
	}
}