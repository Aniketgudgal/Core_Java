import java.util.Scanner;
public class FindLength
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		//sort array
		for(int i = 0; i < nums.length - 1; i++)
		{
			for(int j = i+ 1; j < nums.length; j++)
			{
				if(nums[i] > nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.print("Original Array:");
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(" "+nums[i]);
		}
		System.out.println();
		// longest consecutive length
		int count = 0;
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] - nums[i-1] != 1)
			{
				count = i;
				break;
			}
		}
		
		System.out.print("Consecutive Array:");
		for(int i = 0; i < count; i++)
		{
			System.out.print(" "+nums[i]);
		}
		System.out.println();
		System.out.println("length Count is: "+count);
	}
}