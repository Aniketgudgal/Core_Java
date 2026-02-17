/*
Longest Substring Without Repeating Characters
Return the length of the longest substring without repeating characters.
Example
Input: "abcabcbb" → 3
*/
import java.util.Scanner;
public class LongestSubStringWithoutRepeatingChar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.next();
		int maxCount = 0;
		for(int i = 0; i < s.length(); i++)
		{
			int[] countArr = new int[26];
			int count = 0;
			for(int j = i; j < s.length(); j++)
			{
				if(countArr[s.charAt(j) - 'a'] == 1)
				{
					break;
				}
				count++;
				countArr[s.charAt(j) - 'a'] = 1;
				if(count > maxCount)
				{
					maxCount = count;
				}
			}
		}
		System.out.println("The Longest substring is: "+maxCount);
	}
}