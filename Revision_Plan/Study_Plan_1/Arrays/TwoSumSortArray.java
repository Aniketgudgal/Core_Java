// Two-Sum in Sorted Array (two pointers)
import java.util.Scanner;
public class TwoSumSortArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.print("Enter the size of Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		// input k from user
		System.out.print("Enter the value of k: ");
		int k = sc.nextInt();
		
		// check pairs
		int r = nums.length - 1;
		int l = 0;
		while(l < r)
		{
			if(nums[l]+ nums[r] == k)
			{
				System.out.printf("Value: [%d, %d]",nums[l],nums[r]);
				System.out.printf("\nIndex: [%d, %d]",l,r);
				l++;
				r--;
			}
			else if(nums[l] + nums[r] > k)
			{
				r--;
			}
			else if(nums[l] + nums[r] < k)
			{
				l++;
			}
		}
	}
}