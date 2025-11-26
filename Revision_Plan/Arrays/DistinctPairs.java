/*
Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/
import java.util.Scanner;
public class DistinctPairs
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
		System.out.print("Enter the difference values: ");
		int target = sc.nextInt();
		int count = 0;
		for(int i = 0; i < nums.length - 1; i++)
		{
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[i] > nums[j])
				{
					if(nums[i] - nums[j] == target)
					{
						System.out.println("("+nums[i]+", "+nums[j]+")");
						count++;
					}
				}
				else
				{
					if(nums[j] - nums[i] == target)
					{
						System.out.println("("+nums[j]+", "+nums[i]+")");
						count++;
					}
				}
			}
		}
		System.out.println("Number of distinct pairs for difference "+target+" are: "+count);
	}
}