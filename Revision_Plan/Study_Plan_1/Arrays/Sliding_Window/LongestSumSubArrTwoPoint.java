import java.util.Scanner;
// longest subarray with sum <= k

// this example i do in the two pointer approach

public class LongestSumSubArrTwoPoint
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.print("Enter value  of k: ");
		int k = sc.nextInt();
		
		int l = 0, r = 0, sum = 0, maxlen = 0, maxSum = 0;
		while(r < nums.length)
		{
			sum = sum + nums[r]; // add next values
			if(sum > k)
			{
				sum = sum - nums[l]; // remove the last values
				if(l < nums.length) // check the condition l is in the bound
				{
					l++;
				}
			}
			if(sum <= k)
			{
				if((r - l + 1) > maxlen)
				{
					maxlen = (r - l + 1);
					maxSum = sum;
				}
			}
			r++;
		}
		System.out.println("The max sum is: "+maxSum);
		System.out.println("The max longest subarray length is: "+maxlen);
	}
}