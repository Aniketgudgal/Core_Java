/*	Write a program in java to delete an element at desired position from an array.
	Test Data :	Input the size of array : 5
	Input 5 elements in the array in ascending order : 1   2    3    4    5
	Input the position where to delete : 3
	Expected Output: The new list is : 1 2 3 5
*/
import java.util.Scanner;
public class DeleteElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int nums[] = {1,2,3,4,5};
		int k = 3;
		if(k >= 0 && k < nums.length - 1)
		{
			while(k < nums.length - 1)
			{
				nums[k] = nums[k] + nums[k+1];
				nums[k+1] = nums[k] - nums[k+1];
				nums[k] = nums[k] - nums[k+1];
				k++;
			}
		}
		else
		{
			System.out.println("The index value is not present");
		}
		// print array
		for(int i = 0; i < nums.length - 1; i++)
		{
			System.out.print(" "+nums[i]);
		}
	}
}