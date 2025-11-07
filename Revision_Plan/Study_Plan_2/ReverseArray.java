/*
Reverse an Array
Concept: Swap elements from both ends moving toward the center.
 Use Case: Invert order of operations or list of commands.
Example: arr = [10, 20, 30, 40, 50]
Reversed array: [50, 40, 30, 20, 10]
*/
import java.util.Scanner;
public class ReverseArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Before Reverse Array");
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(" "+nums[i]);
		}
		System.out.println();
		int i = 0;
		int j = nums.length  - 1;
		while(i < j)
		{
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		System.out.println("After Reverse Array");
		for(int k = 0; k < nums.length; k++)
		{
			System.out.print(" "+nums[k]);
		}
	}
}