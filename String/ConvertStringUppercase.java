/*
 Write a program to convert a string into uppercase.
 Input : java
 Output : JAVA
*/
import java.util.Scanner;
public class ConvertStringUppercase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String in = sc.nextLine();
		String result = convertStringUpperCase(in);
		System.out.println("Uppercase String is: "+result);	
	}
	public static String convertStringUpperCase(String s)
	{
		String result = "";
		try
		{	
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
				{
					result = result + (char)((int)(s.charAt(i)) - 32);
				}
				else
				{
					result = result + s.charAt(i);
				}
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("You are accessing string out of bount index"+e);
			return result;
		}
		return result;
	}
}