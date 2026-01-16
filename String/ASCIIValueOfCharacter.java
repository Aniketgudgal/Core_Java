/*
Q17. Write a program to find ASCII value of a character from a string.
 Input : A
 Output : 65
*/
import java.util.Scanner;
public class ASCIIValueOfCharacter
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String input: ");
		String in = sc.nextLine();
		displayAscii(in);
	}
	public static void displayAscii(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
			{
				System.out.print((int)s.charAt(i)+" ");
			}
		}
	}
}