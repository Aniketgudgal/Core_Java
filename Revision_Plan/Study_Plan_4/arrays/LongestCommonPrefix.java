/*
Longest Common Prefix
Given an array of strings, find the longest common prefix.

Input: ["flower", "flow", "flight"]
Output: "fl"

Input: ["dog", "racecar", "car"]
Output: ""
*/
import java.util.Scanner;
public class LongestCommonPrefix
{
	public static void main(String x[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.print("Enter the string input: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.next();
		}
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sortString(arr[i]);
		}
		String fSting = arr[0];
		String lString = arr[arr.length-1 ];
		int i = 0;
		while(i < fSting.length() && i < lString.length() && fSting.charAt(i) == lString.charAt(i))
		{
			i++;
		}
		System.out.println("The prefix string is: "+fSting.substring(0,i));
		System.out.println("The longest common prefix is: "+(i));
	}
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