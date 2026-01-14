/*
Write a program to print the last character of a string.
 Input : India
 Output : a
*/
import java.util.Scanner;
public class LastCharacter
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String in = sc.nextLine();
		int count = 0;
		String a = in.toLowerCase();
		a = a + " ";
		for(int i = 0; i < in.length() - 1; i++)
		{
			if(a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				if(a.charAt(i+1) != ' ')
				{	count++;
					//System.out.println(count);
				}
				else
				{
					String input = in.substring((i - count),i+1);
					//System.out.println(input);
					char lastChar = lastCharacter(input);
					System.out.println("Last Character is: "+lastChar);
					count = 0;
				}
			}
		}
	}
	public static char lastCharacter(String a)
	{
		String lower = a.toLowerCase();
		for(int i = a.length() - 1; i > 0; i--)
		{
			if((lower.charAt(i) >= 97 && lower.charAt(i) <= 122))
			{
				return lower.charAt(i);
			}
		}
		return ' ';
	}
}