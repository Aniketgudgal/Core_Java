/*
 Write a program to print the first character of a string.
 Input : Apple
 Output : A
*/
import java.util.Scanner;
public class FirstCharacter
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String in = sc.nextLine();
		String con = in.toUpperCase();
		for(int i = 0; i < in.length(); i++)
		{
			if(con.charAt(i) >= 65 && con.charAt(i) <= 90)
			{
				System.out.println(in.charAt(i));
				break;
			}
		}
	}
}