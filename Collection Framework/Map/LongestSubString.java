/*
Longest Substring Without Repeating Characters
Problem:
Find length of longest substring without repeating characters.
Example:
Input → "abcabcbb"
Output → 3
*/
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class LongestSubString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String ip = sc.next();
		int max = 0;
		int maxLen = Integer.MIN_VALUE;
		HashMap<Character, Integer> hm = new HashMap<>();
		// logic using hashmap
		for(int i = 0; i < ip.length(); i++)
		{
			Integer val = hm.get(ip.charAt(i));
			if(val != null)
			{
				if(val == 1)
				{
					max--;
					maxLen = Math.max(max, maxLen);
					hm.put(ip.charAt(i), (val-1));
				}
				else
				{
					max++;
					maxLen = Math.max(max, maxLen);
					hm.put(ip.charAt(i), val+1);
				}
			}
			else
			{
				hm.put(ip.charAt(i), 1);
			}
		}
		System.out.println("The max is: "+max);
	}
}