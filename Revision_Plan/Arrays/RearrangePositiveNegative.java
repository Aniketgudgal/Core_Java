/*
Write a program in java to rearrange positive and negative numbers alternatively in a given array ?
Output:
If positive numbers are more they appear at the end and for also negative numbers, they too appear in the end of the array.
 Expected Output:
 The given array is:
 -4 8 -5 -6 5 -9 7 1 -21 -11 19
 The rearranged array is:
 -4 7 -5 1 -21 5 -11 8 -9 19 -6
*/
import java.util.Scanner;
import java.util.ArrayList;
public class RearrangePositiveNegative
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] > 0)
			{
				pos.add(nums[i]);
			}
			else
			{
				neg.add(nums[i]);
			}
		}
		boolean flag = false;
		int j = 0;
		int k = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(flag && nums[i] > 0)
			{
				j++;
				flag = false;
			}
			else if(!flag && nums[i] < 0)
			{
				k++;
				flag = true;
			}
			else if(flag & nums[i] < 0)
			{
				nums[i] = pos.get(j);
				j++;
				flag = false;
			}
			else
			{
				nums[i] = neg.get(k);
				k++;
				flag = true;
			}
		}
		System.out.println("Result array is: ");
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
}
