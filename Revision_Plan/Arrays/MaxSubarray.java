/*
1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
public class MaxSubarray
{
	public static void main(String x[])
	{
		int[] num = {-2, 1 ,-3, 4 , -1 , 2 , 1, -5 , 4};
		int s = 1;
		int e = 0;
		int sum = 0;
		int max = 0;
		while(s < num.length)
		{
			sum = sum + num[s];
			while(sum >= max)
			{
				if(sum > max)
				{
					max = sum;
				}
				sum  = sum - num[e];
				e++;
			}
			s++;
		}
		System.out.println("The max is: "+max);
	}
}
	