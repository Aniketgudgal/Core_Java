/*
First Non-Repeating Character
Problem:
Find the first character in a string that does not repeat.
Example:
Input → "leetcode"
Output → 'l'
*/
import java.util.Scanner;
import java.util.HashMap;
public class NonRepeatingChar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string input: ");
		String inp = sc.next();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i = 0; i < inp.length(); i++)
		{
			Integer val = hm.get(inp.charAt(i));
			if(val != null)
			{
				hm.put(inp.charAt(i), (val+1));
				continue;
			}
			hm.put(inp.charAt(i) , 1);
		}
		for(int i = 0; i < inp.length(); i++)
		{
			Integer val = hm.get(inp.charAt(i));
			if(val == 1)
			{
				System.out.println("Non repeat character is: "+inp.charAt(i));
				break;
			}
		}
		//System.out.println(hm);
	}
}