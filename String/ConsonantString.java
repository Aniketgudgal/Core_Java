/*
Write a program to count consonants in a string.
 Input: Computer
 Output: 5
*/
import java.util.Scanner;
public class ConsonantString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input String: ");
		String in = sc.nextLine();
		int count = consonantCharacter(in);
		System.out.println("The total Character of consonants are: "+count);
	}
	public static int consonantCharacter(String s)
	{
		int count = 0;
		String convert = s.toLowerCase(); 
		for(int i = 0; i < s.length(); i++)
		{
			if((convert.charAt(i) != 'a') && (convert.charAt(i) != 'e') && (convert.charAt(i) != 'i') && (convert.charAt(i) != 'o') && (convert.charAt(i) != 'u'))
				if((convert.charAt(i) >= 65 && convert.charAt(i) <= 90) || (convert.charAt(i) >= 97 && convert.charAt(i) <= 122))
					count++;
		}
		return count;
	}
}