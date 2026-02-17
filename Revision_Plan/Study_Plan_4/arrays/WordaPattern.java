/*
Word Pattern
Check if a string follows a given pattern.
Example
pattern = "abba"
s = "dog cat cat dog" → true
*/
import java.util.Scanner;
public class WordaPattern
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pattern: ");
		String pattern = sc.next();
		System.out.print("Enter the string: ");
		sc.nextLine();
		String s = sc.nextLine();
		String[] word = s.split(" ");
		if(word.length != pattern.length())
		{
			System.out.println("Pattern not match");
			return;
		}
		String[] result = new String[26];
		boolean flag = true;
		for(int i = 0; i < pattern.length(); i++)
		{
			if(result[pattern.charAt(i) - 'a'] == null)
			{
				result[pattern.charAt(i) - 'a'] = word[i];
			}
			else if(!result[pattern.charAt(i) - 'a'].equals(word[i]))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("the pattern is match");
		}
		else
		{
			System.out.println("Not matching pattern");
		}
	}
}