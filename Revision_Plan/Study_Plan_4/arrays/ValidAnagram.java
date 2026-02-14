/*
Valid Anagram
Given two strings s and t, return true if t is an anagram of s.
Example
Input: s="anagram", t="nagaram" → true
*/
import java.util.Scanner;
public class ValidAnagram
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s = sc.next();
		System.out.print("Enter the second string: ");
		String t = sc.next();
		
		String rev1 = sortString(s);
		String rev2 = sortString(t);
		if(rev1.equals(rev2))
		{
			System.out.println("This is valid anagram");
		}
		else
		{
			System.out.println("This is not valid anagram");
		}
	}
	// sort two string then check if equals or not
	public static String sortString(String s)
	{
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length - 1; i++)
		{
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] > ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return new String(ch);
	}
}