/*
Count Subarrays of Size K with Avg ≥ Target

Approach: Sliding Window
Example: arr = [2,1,3,4,1,2], k = 3, avg = 2 → Count: 2
*/
import java.util.Scanner;
public class CountSubarrayAvgTarget
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}

		int count = 0,sum = 0;
		float maxAvg = 0;
		float avg = 0;
		for(int i = 0; i < k; i++)
		{
			sum += nums[i];
		}
		avg = sum/k;
		if(avg >= k)
		{
			count++;
			maxAvg = avg;
		}
		
		for(int i = k; i < nums.length; i++)
		{
			sum = sum - nums[i-k] + nums[i];
			avg = sum/k;
			if(avg >= k)
			{
				count++;
				maxAvg = avg;
			}
		}
		System.out.println("The Avg is: "+maxAvg);
		System.out.println("The count is: "+count);
	}
}