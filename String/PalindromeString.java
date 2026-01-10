/*
Write a program to check whether a string is palindrome or not.
 Input : madam
 Output : Palindrome
*/
import java.util.Scanner;
public class PalindromeString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String in = sc.nextLine();
		boolean result = Palindrome.palindromeString(in);
		if(result)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
class Palindrome
{
	private Palindrome(){};
	public static boolean palindromeString(String s)
	{
		boolean flag = true;
		for(int i = 0; i <= s.length()/2; i++)
		{
			if(s.charAt(i) != s.charAt(s.length() - i - 1))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}