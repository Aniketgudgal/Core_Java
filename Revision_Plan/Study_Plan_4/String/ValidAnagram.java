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
		String f1 = sc.next();
		System.out.print("Enter the second string: ");
		String f2 = sc.next();
		char[] ch1 = f1.toCharArray();
		char[] ch2 = f2.toCharArray();
		f1 = new String(sorting(ch1));
		f2 = new String(sorting(ch2));
		if(f1.equals(f2))
		{
			System.out.println("The String is anagram");
		}
		else
		{
			System.out.println("the String is not anagram");
		}
	}
	public static char[] sorting(char[] ch)
	{
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
		return ch;
	}
}