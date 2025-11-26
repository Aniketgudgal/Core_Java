/*
Q8. Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5
*/
import java.util.Scanner;
public class InversionArrayCount
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < nums.length - 1 ; i++)
		{
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[i] > nums[j])
				{
					System.out.println("("+nums[i]+", "+nums[j]+")");
					count++;
				}
			}
		}
		System.out.println("The inversion count is: "+count);
	}
}