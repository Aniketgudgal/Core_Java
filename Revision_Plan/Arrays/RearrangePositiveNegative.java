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
		for(int n : nums)
        {
            if(n >= 0)
            {
                pos.add(n);
            }
            else
            {
                neg.add(n);
            }
        }
		int i = 0;
        int p = 0;
        int n = 0;
        while(p < pos.size() && n < neg.size())
        {
            nums[i++] = neg.get(n++);
            nums[i++] = pos.get(p++);
        }
        while(n < neg.size())
        {
            nums[i++] = neg.get(n++);
        }
        while(p < pos.size())
        {
            nums[i++] = pos.get(p++);
        }
		System.out.println("Result array is: ");
		for(i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
}
