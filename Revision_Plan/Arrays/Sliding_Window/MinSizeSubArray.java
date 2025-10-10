/*
10. Minimum Size Subarray with Sum ≥ Target

Approach: Sliding Window
Example: arr = [2,3,1,2,4,3], target = 7 → Length: 2 ([4,3])
*/
import java.util.Scanner;
public class MinSizeSubArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i=0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.print("Enter the Target value k: ");
		int k = sc.nextInt();
		int r = 0, l = 0, sum = 0;
		int len = Integer.MAX_VALUE;
		while(r < nums.length)
		{
			sum += nums[r];
			while(sum >= k)
			{
				if((r - l + 1) < len)
				{
					len = (r - l+ 1);
				}
				sum = sum - nums[l];
				l++;
			}
			r++;
		}
		if(len == Integer.MAX_VALUE)
		{
			 System.out.println("No subarray found with sum ≥ target");
		}
		else
		{
			System.out.println("The minimum size of subarray is: "+ len);
		}
	}
}