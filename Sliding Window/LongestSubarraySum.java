/*
 Longest Subarray with Sum ≤ K (non-negative numbers)
*/
import java.util.Scanner;
public class LongestSubarraySum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 1, 0, 1, 1, 0};
		int k = 4;
		int start = 0;
		int end = 0;
		int sum = 0;
		int maxLen = 0;
		int first = 0, last = 0;
		while(start < arr.length)
		{
			sum += arr[start];
			if(sum <= k)
			{
				if((start - end + 1) > maxLen)
				{
					maxLen = start - end + 1;
					first = end;
					last = start;
				}
			}
			while(sum > k)
			{
				sum -= arr[end];
				end++;
			}
			start ++;
		}
		while(first <= last)
		{
			System.out.print(" "+arr[first]);
			first++;
		}
		System.out.println();
		System.out.println("Longest subarray is: "+maxLen);
	}
}