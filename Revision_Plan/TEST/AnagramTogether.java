/*
Q8. store N words in a HashMap. Group all anagrams together without using sort().
Input: 6
listen , silent , cat , act , dog , god
Output:
Anagram Groups:
listen silent
cat act
dog god
Description:
Store the given words in a HashMap.
Do not use:
• Arrays.sort()
• Collections.sort()
• Any built-in anagram checking methods
Finally, traverse the Map and print groups containing more than one word.
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class AnagramTogether
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Hash Map: ");
		int size = sc.nextInt();
		HashMap<Integer, String> al = new HashMap<>();
		System.out.print("Enter the values in hash map: ");
		for(int i = 1; i <= size; i++)
		{
			al.put(i,sc.next());
		}
		
		Iterator<Map.Entry<Integer,String>> abc = al.entrySet().iterator();
		while(abc.hasNext())
		{
			Map.Entry<Integer, String> ac = abc.next();
			System.out.println(ac.getKey()+" "+ac.getValue());
		}
	}
	public static String reverseString(String s)
	{
		char[] ch = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = s.length() - 1; i>= 0; i--)
		{
			sb.append(s.charAt(i));
		}
		return new String(sb);
	}
}