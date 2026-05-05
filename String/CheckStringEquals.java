/*
WAP to input two strings and compare then without using equals() or compareTo() method ?
*/
import java.util.Scanner;
public class CheckStringEquals
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		String s = new String("Aniket");
		String s2 = new String("Aniket");
		if(isEquals(s,s2))
		{
			System.out.println("To Strings Are Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}
	}
	public static boolean isEquals(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
}