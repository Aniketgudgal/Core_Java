/*
Valid Palindrome (Ignore Symbols)
Check if a string is a palindrome ignoring spaces, punctuation, and case.
Example
Input: "A man, a plan, a canal: Panama" → true
*/
import java.util.Scanner;
public class ValidPalindrome
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String s = sc.nextLine();
		char[] ch = new char[s.length()];
		int j = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				ch[j] = s.charAt(i);
				j++;
			}
			else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				ch[j] = (char)(s.charAt(i)+32);
				j++;
			}
		}
		// check palindrome or not
		j--;
		int i = 0;
		boolean flag = true;
		while(i < j)
		{
			if(ch[i] != ch[j])
			{
				flag = false;
				break;
			}
			i++;
			j--;
		}
		if(flag)
		{
			System.out.println("The String is valid palindrome");
		}
		else
		{
			System.out.println("String is not valid palindrome");
		}
	}
}