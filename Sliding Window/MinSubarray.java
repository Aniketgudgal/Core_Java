/*
Minimum Size Subarray Sum ≥ S
*/
import java.util.Scanner;
public class MinSubarray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] nums = {2, 3, 1, 2, 4, 3};
		int k = 7;
		
		int start = 0;
		int end = 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int p= 0;
		int m = 0;
		while(start < nums.length)
		{
			sum += nums[start];
			while(sum >= k)
			{
				if((start - end + 1) < min)
				{
					min = start - end + 1;
					p = end;
					m = start;
				}
				sum -= nums[end];
				end++;
			}
			start++;
		}
		System.out.println("The subarray is");
		for(int i = p; i <= m; i++)
		{
			System.out.print(" "+nums[i]);
		}
		System.out.println();
		System.out.println("The minimum size of  subarray with sum greater than equal to k is: "+min);
	}
}