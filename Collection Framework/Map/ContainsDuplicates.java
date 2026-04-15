/*
Contains Duplicate
Problem:
Check if an array contains duplicate elements.
Example:
Input → [1, 2, 3, 1]
Output → true
*/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class ContainsDuplicates
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < nums.length; i++)
		{
			Integer val = hm.get(nums[i]);
			if(val == null)
			{
				hm.put(nums[i], 1);
				continue;
			}
			hm.put(nums[i], (val+1));
		}
		Iterator<Map.Entry<Integer, Integer>> it = hm.entrySet().iterator();
		boolean flag = false;
		while(it.hasNext())
		{
			Map.Entry<Integer, Integer> data = it.next();
			if(data.getValue() >= 2)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Contains Duplicate values");
		}
		else
		{
			System.out.println("Not Contains Duplicate");
		}
	}
}