/*
 Write a program to convert a string into lowercase.
 Input : HELLO
 Output : hello
*/
import java.util.Scanner;
public class ConvertStringLowerCase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String in = sc.nextLine();
		String result = convertLowerCase(in);
		System.out.println("the lower case string is: "+result);
	}
	public static String convertLowerCase(String s)
	{
		String result = "";
		try
		{
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
					result = result + (char)((int)s.charAt(i) + 32);
				else
					result = result + s.charAt(i);
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("You are accessing out elements");
		}
		return result;
	}
}