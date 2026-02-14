/*
First Unique Character in a String
Given a string s, return the first non-repeating character.
If none exists, return _.
Example
Input: "leetcode" → "l"
Input: "aabb" → "_"
*/
import java.util.Scanner;
public class UniqueCharacterString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String str = sc.next();
		String result = uniqueCharacter(str);
		System.out.println("The result is: "+result);
	}
	public static String uniqueCharacter(String str)
	{
		String result = "_";
		/*
		// first approach
		for(int i = 0; i < str.length() - 1; i++)
		{
			int count = 0;
			for(int j = i+1; j < str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			boolean flag = true;
			for(int k = 0; k < i; k++)
			{
				if(str.charAt(i) == str.charAt(k))
				{
					flag = false;
				}
			}
			if(flag && count < 1)
			{
				result = str.charAt(i)+"";
				break;
			}
		}
		*/
		// second approach
		int[] ch = new int[26];
		for(int i = 0; i < str.length(); i++)
		{
			ch[str.charAt(i) - 'a']++;
		}
		for(int i = 0; i < str.length(); i++)
		{
			int count = ch[str.charAt(i) - 'a'];
			if(count < 2)
			{
				result = str.charAt(i)+"";
				break;
			}
		}
		return result;
	}
}