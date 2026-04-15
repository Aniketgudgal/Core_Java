/*
Frequency of Elements
Problem:
Count frequency of each element in an array.
Example:
Input → [1, 2, 2, 3, 3, 3]
Output → {1=1, 2=2, 3=3}
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class FrequencyOfElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
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
			if(!hm.containsKey(nums[i]))
			{
				hm.put(nums[i], 1);
			}
			else
			{
				Integer val = hm.get(nums[i]);
				hm.put(nums[i], (val+1));
			}
		}
		Iterator<Map.Entry<Integer, Integer>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, Integer> et = it.next();
			System.out.println(et.getKey()+ " = "+et.getValue());
		}
	}
}