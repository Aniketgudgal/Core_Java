/*
 Write a program to count total characters in a string (excluding spaces).
 Input : Java Language
 Output : 12
*/
import java.util.Scanner;
public class CharacterLengthWithSpace
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String name = sc.nextLine();
		int count = 0;
		for(int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i) >= 65 && name.charAt(i) <= 90 || name.charAt(i) >= 97 && name.charAt(i) <= 122 || name.charAt(i) == 32)
				count++;
		}
		System.out.println("The total length of string is: "+count);
	}
}