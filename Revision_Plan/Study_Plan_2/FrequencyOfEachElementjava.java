/*
Count Frequency of Each Element
Concept: Use nested loops or a hash map to count how often each number appears.
 Example:  arr = [4, 5, 6, 4, 5, 7, 4]
Output:
Element 4 occurs 3 times 
Element 5 occurs 2 times 
Element 6 occurs 1 time 
Element 7 occurs 1 time  
*/
import java.util.Scanner;
public class FrequencyOfEachElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		//sorting
		for(int i = 0; i < nums.length--; i++)
		{
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[i] > nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		// after sorting
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(" "+nums[i]);
		}
		System.out.println();
		for(int i = 0; i < nums.length; i++)
		{
			int count = 0;
			for(int j = 0; j < nums.length; j++)
			{
				if(nums[i] == nums[j])
				{
					count++;
				}
			}
		}
	}
}